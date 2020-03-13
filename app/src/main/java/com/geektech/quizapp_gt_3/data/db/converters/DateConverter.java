package com.geektech.quizapp_gt_3.data.db.converters;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.util.Date;

public class DateConverter {

    @TypeConverter
    public static Date fromRaw(Long timestamp) {

        if (timestamp == null) return null; {
            return new Date(timestamp);
        }

    }

    @TypeConverter
    public static Long toRaw(Date date) {

        if (date == null) return null;

            return date.getTime();
        }
    }