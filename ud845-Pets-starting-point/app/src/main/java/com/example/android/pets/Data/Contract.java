package com.example.android.pets.Data;

import android.provider.BaseColumns;

/**
 * Created by Mirka on 03/07/2017.
 */

public class Contract {

    //constructor
    private Contract(){
    }


    // Inner class that defines the table contents
    public static class PetEntry implements BaseColumns{

        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_PET_ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
