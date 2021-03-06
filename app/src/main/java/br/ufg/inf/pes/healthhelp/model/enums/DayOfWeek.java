package br.ufg.inf.pes.healthhelp.model.enums;

import java.security.InvalidParameterException;
import java.util.Calendar;

public enum DayOfWeek {

    SUNDAY(Calendar.SUNDAY, "Domingo"),
    MONDAY(Calendar.MONDAY, "Segunda"),
    TUESDAY(Calendar.TUESDAY, "Terça"),
    WEDNESDAY(Calendar.WEDNESDAY, "Quarta"),
    THURSDAY(Calendar.THURSDAY, "Quinta"),
    FRIDAY(Calendar.FRIDAY, "Sexta"),
    SATURDAY(Calendar.SATURDAY, "Sábado");

    private int value;
    private String displayName;

    DayOfWeek(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    public static DayOfWeek of(final int dayOfWeek) {
        for (DayOfWeek dayOfWeekFinder : DayOfWeek.values()) {
            if (dayOfWeekFinder.getValue() == dayOfWeek) {
                return dayOfWeekFinder;
            }
        }
        throw new InvalidParameterException("Unable to convert to a DayOfWeek:" + dayOfWeek);
    }

    public int getValue() {
        return value;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return this.getDisplayName();
    }
}
