package com.groupc.android.illuminati.Objects;

import com.groupc.android.illuminati.Objects.Table.CardTypeEnum;
import com.groupc.android.illuminati.Objects.Table.AlignmentEnum;
import com.groupc.android.illuminati.Objects.Table.IlluminatiCardEnum;
import com.groupc.android.illuminati.Objects.Table.SpecialAbilityEnum;

/**
 * Created by micha on 4/9/2017.
 */

public class IlluminatiCard extends NonSpecialCard {
    IlluminatiCardEnum illuminati;

    public IlluminatiCard (
                                  String cardName,
                                  CardTypeEnum type,
                                  int power,
                                  int transferablePower,
                                  int resistance,
                                  int income,
                                  AlignmentEnum alignment,
                                  SpecialAbilityEnum specialAbility,
                                  IlluminatiCardEnum illuminati,
                                  Bank bank) {
        super(cardName, type, power, transferablePower, resistance, income, alignment, specialAbility, bank);
        this.illuminati = illuminati;
    }

    public boolean checkGenericGoal() {
        return false;
    }

    public boolean checkSpecialGoal() {
        return false;
    }

    public String getName() {
        return illuminati.getName();
    }
}
