package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity {
    EditText EtName, EtDOB, EtAge, EtNOP, EtPlace, EtDist, EtMobNo, EtWNo, EtCondition;
    Button btnReg;
    registr register;
    RadioGroup RgGender, RgTherapy;
    CheckBox CB1, CB2, CB3, CB4, CB5, CB6;
    String Gender, Psychology, PhysioTherapy, SpeechTherapy, OccupationalTherapy, SpecialEducation, Pre_Vocational_Skill_Training, Currently_Receiving_Therapy;
    int i;
    FirebaseDatabase rootNode;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EtName = findViewById(R.id.Name);
        EtDOB = findViewById(R.id.DOB);
        EtAge = findViewById(R.id.Age);
        EtNOP = findViewById(R.id.NOP);
        EtPlace = findViewById(R.id.Place);
        EtDist = findViewById(R.id.Dist);
        EtMobNo = findViewById(R.id.MobNo);
        EtWNo = findViewById(R.id.WNo);
        EtCondition = findViewById(R.id.Condition);
        CB1 = findViewById(R.id.CB1);
        CB2 = findViewById(R.id.CB2);
        CB3 = findViewById(R.id.CB3);
        CB4 = findViewById(R.id.CB4);
        CB5 = findViewById(R.id.CB5);
        CB6 = findViewById(R.id.CB6);
        RgGender = findViewById(R.id.Gender);
        RgTherapy = findViewById(R.id.Therapy);
        btnReg = findViewById(R.id.Reg);
        register = new registr();
        reff = FirebaseDatabase.getInstance().getReference().child("Register");
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String Name = EtName.getText().toString();
                final String DOB = EtDOB.getText().toString();
                final String Age = EtAge.getText().toString();
                final String NOP = EtNOP.getText().toString();
                final String Place = EtPlace.getText().toString();
                final String District = EtDist.getText().toString();
                final String MobNo = EtMobNo.getText().toString();
                final String WNo = EtWNo.getText().toString();
                final String Condition = EtCondition.getText().toString();

                //code for selecting gender from selected radio button

                int genCheckedId = RgGender.getCheckedRadioButtonId();
                if (genCheckedId == -1) {
                    Toast.makeText(register.this, "Please select your gender", Toast.LENGTH_SHORT).show();
                } else if (genCheckedId == R.id.radio_male) {
                    Gender = "Male";
                } else {
                    Gender = "Female";
                }


                //checked checkboxes are inserted into an array
                String[] therapy = new String[6];
                if (CB1.isChecked()) {
                    Psychology = "Psychology";
                } else {
                    Psychology = "";
                }
                therapy[0] = Psychology;
                if (CB2.isChecked()) {
                    PhysioTherapy = "PhysioTherapy";
                } else {
                    PhysioTherapy = "";
                }
                therapy[1] = PhysioTherapy;
                if (CB3.isChecked()) {
                    SpeechTherapy = "SpeechTherapy";
                } else {
                    SpeechTherapy = "";
                }
                therapy[2] = SpeechTherapy;
                if (CB4.isChecked()) {
                    OccupationalTherapy = "OccupationalTherapy";
                } else {
                    OccupationalTherapy = "";
                }
                therapy[3] = OccupationalTherapy;
                if (CB5.isChecked()) {
                    SpecialEducation = "SpecialEducation";
                } else {
                    SpecialEducation = "";
                }
                therapy[4] = SpecialEducation;
                if (CB6.isChecked()) {
                    Pre_Vocational_Skill_Training = "Pre-VocationalSkillTraining";
                } else {
                    Pre_Vocational_Skill_Training = "";
                }
                therapy[5] = Pre_Vocational_Skill_Training;

                //therapy lists inserted into array is assigned to a single string variable-"therapyList"

                String therapyList = "";
                for (i = 0; i < 6; i++) {
                    therapyList = therapyList + " " + therapy[i];

                }

                //Check whether all fields are filled or not
                if (Name.equals("") || DOB.equals("") || Age.equals("") || NOP.equals("") || Place.equals("") || District.equals("") || MobNo.equals("") || WNo.equals("") || Condition.equals("")) {

                    Toast.makeText(register.this, "Please Fill All the Fields", Toast.LENGTH_SHORT).show();
                }

                //if filled, the data are passed to the firebase database
                else {
                    register.setName(Name);
                    register.setGender(Gender);
                    register.setDOB(DOB);
                    register.setAge(Age);
                    register.setNOP(NOP);
                    register.setPlace(Place);
                    register.setDistrict(District);
                    register.setMobNo(MobNo);
                    register.setWNo(WNo);
                    register.setCondition(Condition);
                    register.setCurrently_Receiving_Therapy(Currently_Receiving_Therapy);
                    register.setTherapyList(therapyList);


                    reff.child(register.getMobNo()).setValue(register).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(register.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(register.this, "Registration Failed...!!!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), register.class);
                                startActivity(intent);
                            }
                        }
                    });

                }
            }


        });

    }

}
    //code for the radio button of currenlty receiving therapy or not

    public void onRadioButtonClicked(View view) {

        int therapyCheckedId = RgTherapy.getCheckedRadioButtonId();
        if (therapyCheckedId == -1) {
            Toast.makeText(register.this, "Please select currently receiving therapy or not", Toast.LENGTH_SHORT).show();
        } else if (therapyCheckedId == R.id.radio_No) {
            Currently_Receiving_Therapy = "No";

            if (CB1.isChecked()) {
                CB1.toggle();
            }
            if (CB2.isChecked()) {
                CB2.toggle();
            }
            if (CB3.isChecked()) {
                CB3.toggle();
            }
            if (CB4.isChecked()) {
                CB4.toggle();
            }
            if (CB5.isChecked()) {
                CB5.toggle();
            }
            if (CB6.isChecked()) {
                CB6.toggle();
            }

            View YesorNo = findViewById(R.id.Ifyes);
            YesorNo.setVisibility(View.INVISIBLE);
            View CB_1 = findViewById(R.id.CB1);
            CB_1.setVisibility(View.INVISIBLE);
            View CB_2 = findViewById(R.id.CB2);
            CB_2.setVisibility(View.INVISIBLE);
            View CB_3 = findViewById(R.id.CB3);
            CB_3.setVisibility(View.INVISIBLE);
            View CB_4 = findViewById(R.id.CB4);
            CB_4.setVisibility(View.INVISIBLE);
            View CB_5 = findViewById(R.id.CB5);
            CB_5.setVisibility(View.INVISIBLE);
            View CB_6 = findViewById(R.id.CB6);
            CB_6.setVisibility(View.INVISIBLE);
        } else {
            Currently_Receiving_Therapy = "Yes";

            View YesorNo = findViewById(R.id.Ifyes);
            YesorNo.setVisibility(View.VISIBLE);
            View CB_1 = findViewById(R.id.CB1);
            CB_1.setVisibility(View.VISIBLE);
            View CB_2 = findViewById(R.id.CB2);
            CB_2.setVisibility(View.VISIBLE);
            View CB_3 = findViewById(R.id.CB3);
            CB_3.setVisibility(View.VISIBLE);
            View CB_4 = findViewById(R.id.CB4);
            CB_4.setVisibility(View.VISIBLE);
            View CB_5 = findViewById(R.id.CB5);
            CB_5.setVisibility(View.VISIBLE);
            View CB_6 = findViewById(R.id.CB6);
            CB_6.setVisibility(View.VISIBLE);
        }
    }
