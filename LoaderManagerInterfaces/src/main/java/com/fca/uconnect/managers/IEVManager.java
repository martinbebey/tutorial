package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IEVManager
 *
 * Note: if invalid data values are sent to an ECU using a set API the ECU will ignore the set.
 * No error message will be returned.
 *
 * @author Fiat Chrysler Automobiles
 *
 * <b>Change Log</b>
 *
 *<table>
 *      <tr>
 *          <th class="colFirst" scope="col">Date</th>
 *          <th class="colFirst" scope="col">Version</th>
 *          <th class="colFirst" scope="col">CR</th>
 *          <th class="colLast" scope="col">Description</th>
 *      </tr>
 *      <tr>
 *          <td style="text - align: left; ">2019-05-23
 *          </td>
 *          <td style="text - align: left; ">1.0
 *          </td>
 *          <td style="text - align: left; ">DCR 13822
 *          </td>
 *          <td style="text - align: left; ">MY21 - Initial Version.
 *          </td>
 *      </tr>
 *      <tr>
 *          <td style="text - align: left; ">2019-08-13
 *          </td>
 *          <td style="text - align: left; ">1.1
 *          </td>
 *          <td style="text - align: left; ">DCR 14223 & 14224
 *          </td>
 *          <td style="text - align: left; ">Generated code for MY21. See Release Notes for DCR 14223 and 14224 for a description of changes.
 *          </td>
 *      </tr>
 *      <tr>
 *          <td style="text - align: left; ">2019-11-05
 *          </td>
 *          <td style="text - align: left; ">1.2
 *          </td>
 *          <td style="text - align: left; ">DCR 14629
 *          </td>
 *          <td style="text - align: left; ">Generated code for MY21. See Release Notes for DCR 14629 for a description of changes.
 *          </td>
 *      </tr>
 *</table>
 *
 */
public interface IEVManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_BATT_CABINPRIORITY1_CHECKBOX_UNSELECTED = 0;
    public static final int VALUE_BATT_CABINPRIORITY1_CHECKBOX_SELECTED   = 1;

    public static final int VALUE_BATT_CABINPRIORITY1_STS_BATTERY_CHARGING_ON_PRIORITY   = 0;
    public static final int VALUE_BATT_CABINPRIORITY1_STS_CABIN_CONDITIONING_ON_PRIORITY = 1;

    public static final int VALUE_BATT_CABINPRIORITY2_CHECKBOX_UNSELECTED = 0;
    public static final int VALUE_BATT_CABINPRIORITY2_CHECKBOX_SELECTED   = 1;

    public static final int VALUE_BATT_CABINPRIORITY2_STS_BATTERY_CHARGING_ON_PRIORITY   = 0;
    public static final int VALUE_BATT_CABINPRIORITY2_STS_CABIN_CONDITIONING_ON_PRIORITY = 1;

    public static final int VALUE_BATT_CABINPRIORITY3_CHECKBOX_UNSELECTED = 0;
    public static final int VALUE_BATT_CABINPRIORITY3_CHECKBOX_SELECTED   = 1;

    public static final int VALUE_BATT_CABINPRIORITY3_STS_BATTERY_CHARGING_ON_PRIORITY   = 0;
    public static final int VALUE_BATT_CABINPRIORITY3_STS_CABIN_CONDITIONING_ON_PRIORITY = 1;

    public static final int VALUE_BATTERY_CHARGE_STAT_OFF   = 0;
    public static final int VALUE_BATTERY_CHARGE_STAT_CONT  = 1;
    public static final int VALUE_BATTERY_CHARGE_STAT_BLINK = 2;
    public static final int VALUE_BATTERY_CHARGE_STAT_SNA   = 3;

    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_DEFAULT = 0;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_PRE     = 1;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_SPR     = 2;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_PRE_OFF = 3;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_PRF     = 4;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_NOT_OK  = 5;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_BCC     = 6;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_BCS     = 7;
    public static final int VALUE_CABIN_PRE_COND_REQ_STAT_SNA     = 15;

    public static final int VALUE_CHARGE_NOW_NO_CHARGE  = 0;
    public static final int VALUE_CHARGE_NOW_CHARGE_NOW = 1;

    public static final int VALUE_CHARGE_UNTIL_FULL1_CHARGE_UNTIL_FULL_NOT_SELECTED = 0;
    public static final int VALUE_CHARGE_UNTIL_FULL1_CHARGE_UNTIL_FULL              = 1;

    public static final int VALUE_CHARGEUNTILFULL1_STS_CHARGE_UNTIL_FULL_NOT_SELECTED = 0;
    public static final int VALUE_CHARGEUNTILFULL1_STS_CHARGE_UNTIL_FULL              = 1;

    public static final int VALUE_CHARGE_UNTIL_FULL2_CHARGE_UNTIL_FULL_NOT_SELECTED = 0;
    public static final int VALUE_CHARGE_UNTIL_FULL2_CHARGE_UNTIL_FULL              = 1;

    public static final int VALUE_CHARGEUNTILFULL2_STS_CHARGE_UNTIL_FULL_NOT_SELECTED = 0;
    public static final int VALUE_CHARGEUNTILFULL2_STS_CHARGE_UNTIL_FULL              = 1;

    public static final int VALUE_CHARGE_UNTIL_FULL3_CHARGE_UNTIL_FULL_NOT_SELECTED = 0;
    public static final int VALUE_CHARGE_UNTIL_FULL3_CHARGE_UNTIL_FULL              = 1;

    public static final int VALUE_CHARGEUNTILFULL3_STS_CHARGE_UNTIL_FULL_NOT_SELECTED = 0;
    public static final int VALUE_CHARGEUNTILFULL3_STS_CHARGE_UNTIL_FULL              = 1;

    public static final int VALUE_CHARGING_LEVEL_DEFAULT_NOLEVEL = 0;
    public static final int VALUE_CHARGING_LEVEL_LEVEL_1_AC      = 1;
    public static final int VALUE_CHARGING_LEVEL_LEVEL_2_AC      = 2;
    public static final int VALUE_CHARGING_LEVEL_LEVEL_3_AC      = 3;
    public static final int VALUE_CHARGING_LEVEL_LEVEL_1_DC      = 4;
    public static final int VALUE_CHARGING_LEVEL_LEVEL_2_DC      = 5;
    public static final int VALUE_CHARGING_LEVEL_PLUG_IN_NOT_DET = 6;
    public static final int VALUE_CHARGING_LEVEL_PPI_1_NO_DRIVE  = 7;
    public static final int VALUE_CHARGING_LEVEL_PPI_2_OK_DRIVE  = 8;
    public static final int VALUE_CHARGING_LEVEL_SNA             = 15;

    public static final int VALUE_CHARGING_SYS_STS_NOT_CHARGING       = 0;
    public static final int VALUE_CHARGING_SYS_STS_CHARGING           = 1;
    public static final int VALUE_CHARGING_SYS_STS_CHARGE_INTERRUPTED = 2;
    public static final int VALUE_CHARGING_SYS_STS_CHARGE_COMPLETE    = 3;
    public static final int VALUE_CHARGING_SYS_STS_SNA                = 7;

    public static final int VALUE_DO_NOT_REPEAT1_REPEAT        = 0;
    public static final int VALUE_DO_NOT_REPEAT1_DO_NOT_REPEAT = 1;

    public static final int VALUE_DO_NOT_REPEAT1_STS_REPEAT        = 0;
    public static final int VALUE_DO_NOT_REPEAT1_STS_DO_NOT_REPEAT = 1;

    public static final int VALUE_DO_NOT_REPEAT2_REPEAT        = 0;
    public static final int VALUE_DO_NOT_REPEAT2_DO_NOT_REPEAT = 1;

    public static final int VALUE_DO_NOT_REPEAT2_STS_REPEAT        = 0;
    public static final int VALUE_DO_NOT_REPEAT2_STS_DO_NOT_REPEAT = 1;

    public static final int VALUE_DO_NOT_REPEAT3_REPEAT        = 0;
    public static final int VALUE_DO_NOT_REPEAT3_DO_NOT_REPEAT = 1;

    public static final int VALUE_DO_NOT_REPEAT3_STS_REPEAT        = 0;
    public static final int VALUE_DO_NOT_REPEAT3_STS_DO_NOT_REPEAT = 1;

    public static final int VALUE_ENABLE_SCHEDULE1_DISABLE_SCHEDULE1 = 0;
    public static final int VALUE_ENABLE_SCHEDULE1_ENABLE_SCHEDULE1  = 1;

    public static final int VALUE_ENABLE_SCHEDULE2_DISABLE_SCHEDULE2 = 0;
    public static final int VALUE_ENABLE_SCHEDULE2_ENABLE_SCHEDULE2  = 1;

    public static final int VALUE_ENABLE_SCHEDULE3_DISABLE_SCHEDULE3 = 0;
    public static final int VALUE_ENABLE_SCHEDULE3_ENABLE_SCHEDULE3  = 1;

    public static final int VALUE_END_TIME_HR1_SNA = 2147483647;

    public static final int VALUE_END_TIME_HR1_STS_SNA = 2147483647;

    public static final int VALUE_END_TIME_HR2_SNA = 2147483647;

    public static final int VALUE_END_TIME_HR2_STS_SNA = 2147483647;

    public static final int VALUE_END_TIME_HR3_SNA = 2147483647;

    public static final int VALUE_END_TIME_HR3_STS_SNA = 2147483647;

    public static final int VALUE_END_TIME_MIN1_SNA = 2147483647;

    public static final int VALUE_END_TIME_MIN1_STS_SNA = 2147483647;

    public static final int VALUE_END_TIME_MIN2_SNA = 2147483647;

    public static final int VALUE_END_TIME_MIN2_STS_SNA = 2147483647;

    public static final int VALUE_END_TIME_MIN3_SNA = 2147483647;

    public static final int VALUE_END_TIME_MIN3_STS_SNA = 2147483647;

    public static final int VALUE_E_SAVE_REQ_PASSIVE_SAVE  = 0;
    public static final int VALUE_E_SAVE_REQ_ACTIVE_CHARGE = 1;

    public static final int VALUE_ESTTIMEOFCHRG_DC_FAST_100_SNA = 2147483647;

    public static final int VALUE_ESTTIMEOFCHRG_DC_FAST_80_SNA = 2147483647;

    public static final int VALUE_H_V_BAT_CNTCTR_STAT_OPEN                = 0;
    public static final int VALUE_H_V_BAT_CNTCTR_STAT_PRECHARGING         = 1;
    public static final int VALUE_H_V_BAT_CNTCTR_STAT_CLOSED              = 2;
    public static final int VALUE_H_V_BAT_CNTCTR_STAT_PRECHARGE_FAILED    = 3;
    public static final int VALUE_H_V_BAT_CNTCTR_STAT_PRECHARGE_INHIBITED = 4;
    public static final int VALUE_H_V_BAT_CNTCTR_STAT_SNA                 = 7;

    public static final int VALUE_H_V_BAT_ISOL_STAT_N_S  = 0;
    public static final int VALUE_H_V_BAT_ISOL_STAT_PASS = 1;
    public static final int VALUE_H_V_BAT_ISOL_STAT_FAIL = 2;
    public static final int VALUE_H_V_BAT_ISOL_STAT_INV  = 3;

    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_1  = 0;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_2  = 1;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_3  = 2;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_4  = 3;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_5  = 4;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_6  = 5;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_7  = 6;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_8  = 7;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_9  = 8;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_10 = 9;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_11 = 10;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_12 = 11;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_13 = 12;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_14 = 13;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_15 = 14;
    public static final int VALUE_HVBATMOD_NUMMAXVLT_MODULE_16 = 15;

    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_1  = 0;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_2  = 1;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_3  = 2;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_4  = 3;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_5  = 4;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_6  = 5;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_7  = 6;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_8  = 7;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_9  = 8;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_10 = 9;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_11 = 10;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_12 = 11;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_13 = 12;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_14 = 13;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_15 = 14;
    public static final int VALUE_HVBATMOD_NUMMINVLT_MODULE_16 = 15;

    public static final int VALUE_NEXT_CHARGE_END_TIME_HR_CHARGEI_UNTIL_FULL = 25;
    public static final int VALUE_NEXT_CHARGE_END_TIME_HR_SNA                = 2147483647;

    public static final int VALUE_NEXT_CHARGE_END_TIME_MIN_SNA = 2147483647;

    public static final int VALUE_NEXT_CHARGE_ENDDAY_NO_SELECTION = 0;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_M            = 1;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_T            = 2;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_W            = 3;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_TH           = 4;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_F            = 5;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_SA           = 6;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_S            = 7;
    public static final int VALUE_NEXT_CHARGE_ENDDAY_SNA          = 15;

    public static final int VALUE_NEXT_CHARGE_START_TIME_HR_CHARGEI_UNTIL_FULL = 25;
    public static final int VALUE_NEXT_CHARGE_START_TIME_HR_SNA                = 2147483647;

    public static final int VALUE_NEXT_CHARGE_START_TIME_MIN_SNA = 2147483647;

    public static final int VALUE_NEXT_CHARGE_STARTDAY_NO_SELECTION = 0;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_M            = 1;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_T            = 2;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_W            = 3;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_TH           = 4;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_F            = 5;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_SA           = 6;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_S            = 7;
    public static final int VALUE_NEXT_CHARGE_STARTDAY_SNA          = 15;

    public static final int VALUE_NEXT_CLIMATE_DAY_NO_SELECTION = 0;
    public static final int VALUE_NEXT_CLIMATE_DAY_M            = 1;
    public static final int VALUE_NEXT_CLIMATE_DAY_T            = 2;
    public static final int VALUE_NEXT_CLIMATE_DAY_W            = 3;
    public static final int VALUE_NEXT_CLIMATE_DAY_TH           = 4;
    public static final int VALUE_NEXT_CLIMATE_DAY_F            = 5;
    public static final int VALUE_NEXT_CLIMATE_DAY_SA           = 6;
    public static final int VALUE_NEXT_CLIMATE_DAY_S            = 7;
    public static final int VALUE_NEXT_CLIMATE_DAY_SNA          = 15;

    public static final int VALUE_NEXT_CLIMATE_TIME_HR_CHARGEI_UNTIL_FULL = 25;
    public static final int VALUE_NEXT_CLIMATE_TIME_HR_SNA                = 2147483647;

    public static final int VALUE_NEXT_CLIMATE_TIME_MIN_SNA = 2147483647;

    public static final int VALUE_SCHEDULE_CONFIRMED1_DISABLE = 0;
    public static final int VALUE_SCHEDULE_CONFIRMED1_ENABLE  = 1;

    public static final int VALUE_SCHEDULE_CONFIRMED2_DISABLE = 0;
    public static final int VALUE_SCHEDULE_CONFIRMED2_ENABLE  = 1;

    public static final int VALUE_SCHEDULE_CONFIRMED3_DISABLE = 0;
    public static final int VALUE_SCHEDULE_CONFIRMED3_ENABLE  = 1;

    public static final int VALUE_SCHEDULE_DAY1_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_DAY1_M               = 1;
    public static final int VALUE_SCHEDULE_DAY1_T               = 2;
    public static final int VALUE_SCHEDULE_DAY1_TM              = 3;
    public static final int VALUE_SCHEDULE_DAY1_W               = 4;
    public static final int VALUE_SCHEDULE_DAY1_WM              = 5;
    public static final int VALUE_SCHEDULE_DAY1_WT              = 6;
    public static final int VALUE_SCHEDULE_DAY1_WTM             = 7;
    public static final int VALUE_SCHEDULE_DAY1_TH              = 8;
    public static final int VALUE_SCHEDULE_DAY1_TH_M            = 9;
    public static final int VALUE_SCHEDULE_DAY1_TH_T            = 10;
    public static final int VALUE_SCHEDULE_DAY1_TH_T_M          = 11;
    public static final int VALUE_SCHEDULE_DAY1_TH_W            = 12;
    public static final int VALUE_SCHEDULE_DAY1_TH_W_M          = 13;
    public static final int VALUE_SCHEDULE_DAY1_TH_W_T          = 14;
    public static final int VALUE_SCHEDULE_DAY1_TH_W_T_M        = 15;
    public static final int VALUE_SCHEDULE_DAY1_F               = 16;
    public static final int VALUE_SCHEDULE_DAY1_FM              = 17;
    public static final int VALUE_SCHEDULE_DAY1_FT              = 18;
    public static final int VALUE_SCHEDULE_DAY1_FTM             = 19;
    public static final int VALUE_SCHEDULE_DAY1_FW              = 20;
    public static final int VALUE_SCHEDULE_DAY1_FWM             = 21;
    public static final int VALUE_SCHEDULE_DAY1_FWT             = 22;
    public static final int VALUE_SCHEDULE_DAY1_FWTM            = 23;
    public static final int VALUE_SCHEDULE_DAY1_F_TH            = 24;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_M          = 25;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_T          = 26;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_T_M        = 27;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_W          = 28;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_W_M        = 29;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_W_T        = 30;
    public static final int VALUE_SCHEDULE_DAY1_F_TH_W_T_M      = 31;
    public static final int VALUE_SCHEDULE_DAY1_S               = 32;
    public static final int VALUE_SCHEDULE_DAY1_SM              = 33;
    public static final int VALUE_SCHEDULE_DAY1_ST              = 34;
    public static final int VALUE_SCHEDULE_DAY1_STM             = 35;
    public static final int VALUE_SCHEDULE_DAY1_SW              = 36;
    public static final int VALUE_SCHEDULE_DAY1_SWM             = 37;
    public static final int VALUE_SCHEDULE_DAY1_SWT             = 38;
    public static final int VALUE_SCHEDULE_DAY1_SWTM            = 39;
    public static final int VALUE_SCHEDULE_DAY1_S_TH            = 40;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_M          = 41;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_T          = 42;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_T_M        = 43;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_W          = 44;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_W_M        = 45;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_W_T        = 46;
    public static final int VALUE_SCHEDULE_DAY1_S_TH_W_T_M      = 47;
    public static final int VALUE_SCHEDULE_DAY1_SF              = 48;
    public static final int VALUE_SCHEDULE_DAY1_SFM             = 49;
    public static final int VALUE_SCHEDULE_DAY1_SFT             = 50;
    public static final int VALUE_SCHEDULE_DAY1_SFTM            = 51;
    public static final int VALUE_SCHEDULE_DAY1_SFW             = 52;
    public static final int VALUE_SCHEDULE_DAY1_SFWM            = 53;
    public static final int VALUE_SCHEDULE_DAY1_SFWT            = 54;
    public static final int VALUE_SCHEDULE_DAY1_SFWTM           = 55;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH          = 56;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_M        = 57;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_T        = 58;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_T_M      = 59;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_W        = 60;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_W_M      = 61;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_W_T      = 62;
    public static final int VALUE_SCHEDULE_DAY1_S_F_TH_W_T_M    = 63;
    public static final int VALUE_SCHEDULE_DAY1_SA              = 64;
    public static final int VALUE_SCHEDULE_DAY1_SA_M            = 65;
    public static final int VALUE_SCHEDULE_DAY1_SA_T            = 66;
    public static final int VALUE_SCHEDULE_DAY1_SA_T_M          = 67;
    public static final int VALUE_SCHEDULE_DAY1_SA_W            = 68;
    public static final int VALUE_SCHEDULE_DAY1_SA_W_M          = 69;
    public static final int VALUE_SCHEDULE_DAY1_SA_W_T          = 70;
    public static final int VALUE_SCHEDULE_DAY1_SA_W_T_M        = 71;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH           = 72;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_M         = 73;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_T         = 74;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_T_M       = 75;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_W         = 76;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_W_M       = 77;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_W_T       = 78;
    public static final int VALUE_SCHEDULE_DAY1_SA_TH_W_T_M     = 79;
    public static final int VALUE_SCHEDULE_DAY1_SA_F            = 80;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_M          = 81;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_T          = 82;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_T_M        = 83;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_W          = 84;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_W_M        = 85;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_W_T        = 86;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_W_T_M      = 87;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH         = 88;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_M       = 89;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_T       = 90;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_T_M     = 91;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_W       = 92;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_W_M     = 93;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_W_T     = 94;
    public static final int VALUE_SCHEDULE_DAY1_SA_F_TH_W_T_M   = 95;
    public static final int VALUE_SCHEDULE_DAY1_SA_S            = 96;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_M          = 97;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_T          = 98;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_T_M        = 99;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_W          = 100;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_W_M        = 101;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_W_T        = 102;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_W_T_M      = 103;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH         = 104;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_M       = 105;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_T       = 106;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_T_M     = 107;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_W       = 108;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_W_M     = 109;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_W_T     = 110;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_TH_W_T_M   = 111;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F          = 112;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_M        = 113;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_T        = 114;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_T_M      = 115;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_W        = 116;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_W_M      = 117;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_W_T      = 118;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_W_T_M    = 119;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH       = 120;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_M     = 121;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_T     = 122;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_T_M   = 123;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_W     = 124;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_W_M   = 125;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_W_T   = 126;
    public static final int VALUE_SCHEDULE_DAY1_SA_S_F_TH_W_T_M = 127;
    public static final int VALUE_SCHEDULE_DAY1_SNA             = 255;

    public static final int VALUE_SCHEDULE_DAY1_STS_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_DAY1_STS_M               = 1;
    public static final int VALUE_SCHEDULE_DAY1_STS_T               = 2;
    public static final int VALUE_SCHEDULE_DAY1_STS_TM              = 3;
    public static final int VALUE_SCHEDULE_DAY1_STS_W               = 4;
    public static final int VALUE_SCHEDULE_DAY1_STS_WM              = 5;
    public static final int VALUE_SCHEDULE_DAY1_STS_WT              = 6;
    public static final int VALUE_SCHEDULE_DAY1_STS_WTM             = 7;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH              = 8;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_M            = 9;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_T            = 10;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_T_M          = 11;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_W            = 12;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_W_M          = 13;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_W_T          = 14;
    public static final int VALUE_SCHEDULE_DAY1_STS_TH_W_T_M        = 15;
    public static final int VALUE_SCHEDULE_DAY1_STS_F               = 16;
    public static final int VALUE_SCHEDULE_DAY1_STS_FM              = 17;
    public static final int VALUE_SCHEDULE_DAY1_STS_FT              = 18;
    public static final int VALUE_SCHEDULE_DAY1_STS_FTM             = 19;
    public static final int VALUE_SCHEDULE_DAY1_STS_FW              = 20;
    public static final int VALUE_SCHEDULE_DAY1_STS_FWM             = 21;
    public static final int VALUE_SCHEDULE_DAY1_STS_FWT             = 22;
    public static final int VALUE_SCHEDULE_DAY1_STS_FWTM            = 23;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH            = 24;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_M          = 25;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_T          = 26;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_T_M        = 27;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_W          = 28;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_W_M        = 29;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_W_T        = 30;
    public static final int VALUE_SCHEDULE_DAY1_STS_F_TH_W_T_M      = 31;
    public static final int VALUE_SCHEDULE_DAY1_STS_S               = 32;
    public static final int VALUE_SCHEDULE_DAY1_STS_SM              = 33;
    public static final int VALUE_SCHEDULE_DAY1_STS_ST              = 34;
    public static final int VALUE_SCHEDULE_DAY1_STS_STM             = 35;
    public static final int VALUE_SCHEDULE_DAY1_STS_SW              = 36;
    public static final int VALUE_SCHEDULE_DAY1_STS_SWM             = 37;
    public static final int VALUE_SCHEDULE_DAY1_STS_SWT             = 38;
    public static final int VALUE_SCHEDULE_DAY1_STS_SWTM            = 39;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH            = 40;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_M          = 41;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_T          = 42;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_T_M        = 43;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_W          = 44;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_W_M        = 45;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_W_T        = 46;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_TH_W_T_M      = 47;
    public static final int VALUE_SCHEDULE_DAY1_STS_SF              = 48;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFM             = 49;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFT             = 50;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFTM            = 51;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFW             = 52;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFWM            = 53;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFWT            = 54;
    public static final int VALUE_SCHEDULE_DAY1_STS_SFWTM           = 55;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH          = 56;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_M        = 57;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_T        = 58;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_T_M      = 59;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_W        = 60;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_W_M      = 61;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_W_T      = 62;
    public static final int VALUE_SCHEDULE_DAY1_STS_S_F_TH_W_T_M    = 63;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA              = 64;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_M            = 65;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_T            = 66;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_T_M          = 67;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_W            = 68;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_W_M          = 69;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_W_T          = 70;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_W_T_M        = 71;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH           = 72;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_M         = 73;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_T         = 74;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_T_M       = 75;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_W         = 76;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_W_M       = 77;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_W_T       = 78;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_TH_W_T_M     = 79;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F            = 80;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_M          = 81;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_T          = 82;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_T_M        = 83;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_W          = 84;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_W_M        = 85;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_W_T        = 86;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_W_T_M      = 87;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH         = 88;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_M       = 89;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_T       = 90;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_T_M     = 91;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_W       = 92;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_W_M     = 93;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_W_T     = 94;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_F_TH_W_T_M   = 95;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S            = 96;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_M          = 97;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_T          = 98;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_T_M        = 99;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_W          = 100;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_W_M        = 101;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_W_T        = 102;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_W_T_M      = 103;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH         = 104;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_M       = 105;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_T       = 106;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_T_M     = 107;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_W       = 108;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_W_M     = 109;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_W_T     = 110;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_TH_W_T_M   = 111;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F          = 112;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_M        = 113;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_T        = 114;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_T_M      = 115;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_W        = 116;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_W_M      = 117;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_W_T      = 118;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_W_T_M    = 119;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH       = 120;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_M     = 121;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_T     = 122;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_T_M   = 123;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_W     = 124;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_W_M   = 125;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_W_T   = 126;
    public static final int VALUE_SCHEDULE_DAY1_STS_SA_S_F_TH_W_T_M = 127;
    public static final int VALUE_SCHEDULE_DAY1_STS_SNA             = 255;

    public static final int VALUE_SCHEDULE_DAY2_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_DAY2_M               = 1;
    public static final int VALUE_SCHEDULE_DAY2_T               = 2;
    public static final int VALUE_SCHEDULE_DAY2_TM              = 3;
    public static final int VALUE_SCHEDULE_DAY2_W               = 4;
    public static final int VALUE_SCHEDULE_DAY2_WM              = 5;
    public static final int VALUE_SCHEDULE_DAY2_WT              = 6;
    public static final int VALUE_SCHEDULE_DAY2_WTM             = 7;
    public static final int VALUE_SCHEDULE_DAY2_TH              = 8;
    public static final int VALUE_SCHEDULE_DAY2_TH_M            = 9;
    public static final int VALUE_SCHEDULE_DAY2_TH_T            = 10;
    public static final int VALUE_SCHEDULE_DAY2_TH_T_M          = 11;
    public static final int VALUE_SCHEDULE_DAY2_TH_W            = 12;
    public static final int VALUE_SCHEDULE_DAY2_TH_W_M          = 13;
    public static final int VALUE_SCHEDULE_DAY2_TH_W_T          = 14;
    public static final int VALUE_SCHEDULE_DAY2_TH_W_T_M        = 15;
    public static final int VALUE_SCHEDULE_DAY2_F               = 16;
    public static final int VALUE_SCHEDULE_DAY2_FM              = 17;
    public static final int VALUE_SCHEDULE_DAY2_FT              = 18;
    public static final int VALUE_SCHEDULE_DAY2_FTM             = 19;
    public static final int VALUE_SCHEDULE_DAY2_FW              = 20;
    public static final int VALUE_SCHEDULE_DAY2_FWM             = 21;
    public static final int VALUE_SCHEDULE_DAY2_FWT             = 22;
    public static final int VALUE_SCHEDULE_DAY2_FWTM            = 23;
    public static final int VALUE_SCHEDULE_DAY2_F_TH            = 24;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_M          = 25;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_T          = 26;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_T_M        = 27;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_W          = 28;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_W_M        = 29;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_W_T        = 30;
    public static final int VALUE_SCHEDULE_DAY2_F_TH_W_T_M      = 31;
    public static final int VALUE_SCHEDULE_DAY2_S               = 32;
    public static final int VALUE_SCHEDULE_DAY2_SM              = 33;
    public static final int VALUE_SCHEDULE_DAY2_ST              = 34;
    public static final int VALUE_SCHEDULE_DAY2_STM             = 35;
    public static final int VALUE_SCHEDULE_DAY2_SW              = 36;
    public static final int VALUE_SCHEDULE_DAY2_SWM             = 37;
    public static final int VALUE_SCHEDULE_DAY2_SWT             = 38;
    public static final int VALUE_SCHEDULE_DAY2_SWTM            = 39;
    public static final int VALUE_SCHEDULE_DAY2_S_TH            = 40;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_M          = 41;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_T          = 42;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_T_M        = 43;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_W          = 44;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_W_M        = 45;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_W_T        = 46;
    public static final int VALUE_SCHEDULE_DAY2_S_TH_W_T_M      = 47;
    public static final int VALUE_SCHEDULE_DAY2_SF              = 48;
    public static final int VALUE_SCHEDULE_DAY2_SFM             = 49;
    public static final int VALUE_SCHEDULE_DAY2_SFT             = 50;
    public static final int VALUE_SCHEDULE_DAY2_SFTM            = 51;
    public static final int VALUE_SCHEDULE_DAY2_SFW             = 52;
    public static final int VALUE_SCHEDULE_DAY2_SFWM            = 53;
    public static final int VALUE_SCHEDULE_DAY2_SFWT            = 54;
    public static final int VALUE_SCHEDULE_DAY2_SFWTM           = 55;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH          = 56;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_M        = 57;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_T        = 58;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_T_M      = 59;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_W        = 60;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_W_M      = 61;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_W_T      = 62;
    public static final int VALUE_SCHEDULE_DAY2_S_F_TH_W_T_M    = 63;
    public static final int VALUE_SCHEDULE_DAY2_SA              = 64;
    public static final int VALUE_SCHEDULE_DAY2_SA_M            = 65;
    public static final int VALUE_SCHEDULE_DAY2_SA_T            = 66;
    public static final int VALUE_SCHEDULE_DAY2_SA_T_M          = 67;
    public static final int VALUE_SCHEDULE_DAY2_SA_W            = 68;
    public static final int VALUE_SCHEDULE_DAY2_SA_W_M          = 69;
    public static final int VALUE_SCHEDULE_DAY2_SA_W_T          = 70;
    public static final int VALUE_SCHEDULE_DAY2_SA_W_T_M        = 71;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH           = 72;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_M         = 73;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_T         = 74;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_T_M       = 75;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_W         = 76;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_W_M       = 77;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_W_T       = 78;
    public static final int VALUE_SCHEDULE_DAY2_SA_TH_W_T_M     = 79;
    public static final int VALUE_SCHEDULE_DAY2_SA_F            = 80;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_M          = 81;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_T          = 82;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_T_M        = 83;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_W          = 84;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_W_M        = 85;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_W_T        = 86;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_W_T_M      = 87;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH         = 88;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_M       = 89;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_T       = 90;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_T_M     = 91;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_W       = 92;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_W_M     = 93;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_W_T     = 94;
    public static final int VALUE_SCHEDULE_DAY2_SA_F_TH_W_T_M   = 95;
    public static final int VALUE_SCHEDULE_DAY2_SA_S            = 96;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_M          = 97;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_T          = 98;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_T_M        = 99;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_W          = 100;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_W_M        = 101;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_W_T        = 102;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_W_T_M      = 103;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH         = 104;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_M       = 105;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_T       = 106;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_T_M     = 107;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_W       = 108;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_W_M     = 109;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_W_T     = 110;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_TH_W_T_M   = 111;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F          = 112;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_M        = 113;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_T        = 114;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_T_M      = 115;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_W        = 116;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_W_M      = 117;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_W_T      = 118;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_W_T_M    = 119;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH       = 120;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_M     = 121;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_T     = 122;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_T_M   = 123;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_W     = 124;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_W_M   = 125;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_W_T   = 126;
    public static final int VALUE_SCHEDULE_DAY2_SA_S_F_TH_W_T_M = 127;
    public static final int VALUE_SCHEDULE_DAY2_SNA             = 255;

    public static final int VALUE_SCHEDULE_DAY2_STS_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_DAY2_STS_M               = 1;
    public static final int VALUE_SCHEDULE_DAY2_STS_T               = 2;
    public static final int VALUE_SCHEDULE_DAY2_STS_TM              = 3;
    public static final int VALUE_SCHEDULE_DAY2_STS_W               = 4;
    public static final int VALUE_SCHEDULE_DAY2_STS_WM              = 5;
    public static final int VALUE_SCHEDULE_DAY2_STS_WT              = 6;
    public static final int VALUE_SCHEDULE_DAY2_STS_WTM             = 7;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH              = 8;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_M            = 9;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_T            = 10;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_T_M          = 11;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_W            = 12;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_W_M          = 13;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_W_T          = 14;
    public static final int VALUE_SCHEDULE_DAY2_STS_TH_W_T_M        = 15;
    public static final int VALUE_SCHEDULE_DAY2_STS_F               = 16;
    public static final int VALUE_SCHEDULE_DAY2_STS_FM              = 17;
    public static final int VALUE_SCHEDULE_DAY2_STS_FT              = 18;
    public static final int VALUE_SCHEDULE_DAY2_STS_FTM             = 19;
    public static final int VALUE_SCHEDULE_DAY2_STS_FW              = 20;
    public static final int VALUE_SCHEDULE_DAY2_STS_FWM             = 21;
    public static final int VALUE_SCHEDULE_DAY2_STS_FWT             = 22;
    public static final int VALUE_SCHEDULE_DAY2_STS_FWTM            = 23;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH            = 24;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_M          = 25;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_T          = 26;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_T_M        = 27;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_W          = 28;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_W_M        = 29;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_W_T        = 30;
    public static final int VALUE_SCHEDULE_DAY2_STS_F_TH_W_T_M      = 31;
    public static final int VALUE_SCHEDULE_DAY2_STS_S               = 32;
    public static final int VALUE_SCHEDULE_DAY2_STS_SM              = 33;
    public static final int VALUE_SCHEDULE_DAY2_STS_ST              = 34;
    public static final int VALUE_SCHEDULE_DAY2_STS_STM             = 35;
    public static final int VALUE_SCHEDULE_DAY2_STS_SW              = 36;
    public static final int VALUE_SCHEDULE_DAY2_STS_SWM             = 37;
    public static final int VALUE_SCHEDULE_DAY2_STS_SWT             = 38;
    public static final int VALUE_SCHEDULE_DAY2_STS_SWTM            = 39;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH            = 40;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_M          = 41;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_T          = 42;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_T_M        = 43;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_W          = 44;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_W_M        = 45;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_W_T        = 46;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_TH_W_T_M      = 47;
    public static final int VALUE_SCHEDULE_DAY2_STS_SF              = 48;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFM             = 49;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFT             = 50;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFTM            = 51;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFW             = 52;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFWM            = 53;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFWT            = 54;
    public static final int VALUE_SCHEDULE_DAY2_STS_SFWTM           = 55;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH          = 56;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_M        = 57;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_T        = 58;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_T_M      = 59;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_W        = 60;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_W_M      = 61;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_W_T      = 62;
    public static final int VALUE_SCHEDULE_DAY2_STS_S_F_TH_W_T_M    = 63;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA              = 64;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_M            = 65;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_T            = 66;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_T_M          = 67;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_W            = 68;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_W_M          = 69;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_W_T          = 70;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_W_T_M        = 71;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH           = 72;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_M         = 73;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_T         = 74;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_T_M       = 75;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_W         = 76;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_W_M       = 77;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_W_T       = 78;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_TH_W_T_M     = 79;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F            = 80;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_M          = 81;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_T          = 82;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_T_M        = 83;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_W          = 84;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_W_M        = 85;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_W_T        = 86;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_W_T_M      = 87;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH         = 88;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_M       = 89;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_T       = 90;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_T_M     = 91;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_W       = 92;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_W_M     = 93;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_W_T     = 94;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_F_TH_W_T_M   = 95;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S            = 96;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_M          = 97;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_T          = 98;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_T_M        = 99;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_W          = 100;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_W_M        = 101;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_W_T        = 102;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_W_T_M      = 103;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH         = 104;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_M       = 105;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_T       = 106;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_T_M     = 107;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_W       = 108;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_W_M     = 109;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_W_T     = 110;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_TH_W_T_M   = 111;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F          = 112;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_M        = 113;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_T        = 114;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_T_M      = 115;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_W        = 116;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_W_M      = 117;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_W_T      = 118;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_W_T_M    = 119;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH       = 120;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_M     = 121;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_T     = 122;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_T_M   = 123;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_W     = 124;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_W_M   = 125;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_W_T   = 126;
    public static final int VALUE_SCHEDULE_DAY2_STS_SA_S_F_TH_W_T_M = 127;
    public static final int VALUE_SCHEDULE_DAY2_STS_SNA             = 255;

    public static final int VALUE_SCHEDULE_DAY3_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_DAY3_M               = 1;
    public static final int VALUE_SCHEDULE_DAY3_T               = 2;
    public static final int VALUE_SCHEDULE_DAY3_TM              = 3;
    public static final int VALUE_SCHEDULE_DAY3_W               = 4;
    public static final int VALUE_SCHEDULE_DAY3_WM              = 5;
    public static final int VALUE_SCHEDULE_DAY3_WT              = 6;
    public static final int VALUE_SCHEDULE_DAY3_WTM             = 7;
    public static final int VALUE_SCHEDULE_DAY3_TH              = 8;
    public static final int VALUE_SCHEDULE_DAY3_TH_M            = 9;
    public static final int VALUE_SCHEDULE_DAY3_TH_T            = 10;
    public static final int VALUE_SCHEDULE_DAY3_TH_T_M          = 11;
    public static final int VALUE_SCHEDULE_DAY3_TH_W            = 12;
    public static final int VALUE_SCHEDULE_DAY3_TH_W_M          = 13;
    public static final int VALUE_SCHEDULE_DAY3_TH_W_T          = 14;
    public static final int VALUE_SCHEDULE_DAY3_TH_W_T_M        = 15;
    public static final int VALUE_SCHEDULE_DAY3_F               = 16;
    public static final int VALUE_SCHEDULE_DAY3_FM              = 17;
    public static final int VALUE_SCHEDULE_DAY3_FT              = 18;
    public static final int VALUE_SCHEDULE_DAY3_FTM             = 19;
    public static final int VALUE_SCHEDULE_DAY3_FW              = 20;
    public static final int VALUE_SCHEDULE_DAY3_FWM             = 21;
    public static final int VALUE_SCHEDULE_DAY3_FWT             = 22;
    public static final int VALUE_SCHEDULE_DAY3_FWTM            = 23;
    public static final int VALUE_SCHEDULE_DAY3_F_TH            = 24;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_M          = 25;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_T          = 26;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_T_M        = 27;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_W          = 28;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_W_M        = 29;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_W_T        = 30;
    public static final int VALUE_SCHEDULE_DAY3_F_TH_W_T_M      = 31;
    public static final int VALUE_SCHEDULE_DAY3_S               = 32;
    public static final int VALUE_SCHEDULE_DAY3_SM              = 33;
    public static final int VALUE_SCHEDULE_DAY3_ST              = 34;
    public static final int VALUE_SCHEDULE_DAY3_STM             = 35;
    public static final int VALUE_SCHEDULE_DAY3_SW              = 36;
    public static final int VALUE_SCHEDULE_DAY3_SWM             = 37;
    public static final int VALUE_SCHEDULE_DAY3_SWT             = 38;
    public static final int VALUE_SCHEDULE_DAY3_SWTM            = 39;
    public static final int VALUE_SCHEDULE_DAY3_S_TH            = 40;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_M          = 41;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_T          = 42;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_T_M        = 43;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_W          = 44;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_W_M        = 45;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_W_T        = 46;
    public static final int VALUE_SCHEDULE_DAY3_S_TH_W_T_M      = 47;
    public static final int VALUE_SCHEDULE_DAY3_SF              = 48;
    public static final int VALUE_SCHEDULE_DAY3_SFM             = 49;
    public static final int VALUE_SCHEDULE_DAY3_SFT             = 50;
    public static final int VALUE_SCHEDULE_DAY3_SFTM            = 51;
    public static final int VALUE_SCHEDULE_DAY3_SFW             = 52;
    public static final int VALUE_SCHEDULE_DAY3_SFWM            = 53;
    public static final int VALUE_SCHEDULE_DAY3_SFWT            = 54;
    public static final int VALUE_SCHEDULE_DAY3_SFWTM           = 55;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH          = 56;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_M        = 57;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_T        = 58;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_T_M      = 59;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_W        = 60;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_W_M      = 61;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_W_T      = 62;
    public static final int VALUE_SCHEDULE_DAY3_S_F_TH_W_T_M    = 63;
    public static final int VALUE_SCHEDULE_DAY3_SA              = 64;
    public static final int VALUE_SCHEDULE_DAY3_SA_M            = 65;
    public static final int VALUE_SCHEDULE_DAY3_SA_T            = 66;
    public static final int VALUE_SCHEDULE_DAY3_SA_T_M          = 67;
    public static final int VALUE_SCHEDULE_DAY3_SA_W            = 68;
    public static final int VALUE_SCHEDULE_DAY3_SA_W_M          = 69;
    public static final int VALUE_SCHEDULE_DAY3_SA_W_T          = 70;
    public static final int VALUE_SCHEDULE_DAY3_SA_W_T_M        = 71;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH           = 72;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_M         = 73;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_T         = 74;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_T_M       = 75;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_W         = 76;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_W_M       = 77;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_W_T       = 78;
    public static final int VALUE_SCHEDULE_DAY3_SA_TH_W_T_M     = 79;
    public static final int VALUE_SCHEDULE_DAY3_SA_F            = 80;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_M          = 81;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_T          = 82;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_T_M        = 83;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_W          = 84;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_W_M        = 85;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_W_T        = 86;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_W_T_M      = 87;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH         = 88;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_M       = 89;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_T       = 90;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_T_M     = 91;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_W       = 92;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_W_M     = 93;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_W_T     = 94;
    public static final int VALUE_SCHEDULE_DAY3_SA_F_TH_W_T_M   = 95;
    public static final int VALUE_SCHEDULE_DAY3_SA_S            = 96;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_M          = 97;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_T          = 98;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_T_M        = 99;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_W          = 100;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_W_M        = 101;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_W_T        = 102;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_W_T_M      = 103;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH         = 104;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_M       = 105;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_T       = 106;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_T_M     = 107;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_W       = 108;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_W_M     = 109;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_W_T     = 110;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_TH_W_T_M   = 111;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F          = 112;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_M        = 113;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_T        = 114;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_T_M      = 115;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_W        = 116;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_W_M      = 117;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_W_T      = 118;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_W_T_M    = 119;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH       = 120;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_M     = 121;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_T     = 122;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_T_M   = 123;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_W     = 124;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_W_M   = 125;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_W_T   = 126;
    public static final int VALUE_SCHEDULE_DAY3_SA_S_F_TH_W_T_M = 127;
    public static final int VALUE_SCHEDULE_DAY3_SNA             = 255;

    public static final int VALUE_SCHEDULE_DAY3_STS_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_DAY3_STS_M               = 1;
    public static final int VALUE_SCHEDULE_DAY3_STS_T               = 2;
    public static final int VALUE_SCHEDULE_DAY3_STS_TM              = 3;
    public static final int VALUE_SCHEDULE_DAY3_STS_W               = 4;
    public static final int VALUE_SCHEDULE_DAY3_STS_WM              = 5;
    public static final int VALUE_SCHEDULE_DAY3_STS_WT              = 6;
    public static final int VALUE_SCHEDULE_DAY3_STS_WTM             = 7;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH              = 8;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_M            = 9;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_T            = 10;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_T_M          = 11;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_W            = 12;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_W_M          = 13;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_W_T          = 14;
    public static final int VALUE_SCHEDULE_DAY3_STS_TH_W_T_M        = 15;
    public static final int VALUE_SCHEDULE_DAY3_STS_F               = 16;
    public static final int VALUE_SCHEDULE_DAY3_STS_FM              = 17;
    public static final int VALUE_SCHEDULE_DAY3_STS_FT              = 18;
    public static final int VALUE_SCHEDULE_DAY3_STS_FTM             = 19;
    public static final int VALUE_SCHEDULE_DAY3_STS_FW              = 20;
    public static final int VALUE_SCHEDULE_DAY3_STS_FWM             = 21;
    public static final int VALUE_SCHEDULE_DAY3_STS_FWT             = 22;
    public static final int VALUE_SCHEDULE_DAY3_STS_FWTM            = 23;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH            = 24;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_M          = 25;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_T          = 26;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_T_M        = 27;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_W          = 28;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_W_M        = 29;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_W_T        = 30;
    public static final int VALUE_SCHEDULE_DAY3_STS_F_TH_W_T_M      = 31;
    public static final int VALUE_SCHEDULE_DAY3_STS_S               = 32;
    public static final int VALUE_SCHEDULE_DAY3_STS_SM              = 33;
    public static final int VALUE_SCHEDULE_DAY3_STS_ST              = 34;
    public static final int VALUE_SCHEDULE_DAY3_STS_STM             = 35;
    public static final int VALUE_SCHEDULE_DAY3_STS_SW              = 36;
    public static final int VALUE_SCHEDULE_DAY3_STS_SWM             = 37;
    public static final int VALUE_SCHEDULE_DAY3_STS_SWT             = 38;
    public static final int VALUE_SCHEDULE_DAY3_STS_SWTM            = 39;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH            = 40;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_M          = 41;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_T          = 42;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_T_M        = 43;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_W          = 44;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_W_M        = 45;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_W_T        = 46;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_TH_W_T_M      = 47;
    public static final int VALUE_SCHEDULE_DAY3_STS_SF              = 48;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFM             = 49;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFT             = 50;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFTM            = 51;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFW             = 52;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFWM            = 53;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFWT            = 54;
    public static final int VALUE_SCHEDULE_DAY3_STS_SFWTM           = 55;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH          = 56;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_M        = 57;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_T        = 58;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_T_M      = 59;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_W        = 60;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_W_M      = 61;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_W_T      = 62;
    public static final int VALUE_SCHEDULE_DAY3_STS_S_F_TH_W_T_M    = 63;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA              = 64;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_M            = 65;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_T            = 66;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_T_M          = 67;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_W            = 68;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_W_M          = 69;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_W_T          = 70;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_W_T_M        = 71;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH           = 72;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_M         = 73;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_T         = 74;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_T_M       = 75;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_W         = 76;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_W_M       = 77;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_W_T       = 78;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_TH_W_T_M     = 79;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F            = 80;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_M          = 81;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_T          = 82;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_T_M        = 83;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_W          = 84;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_W_M        = 85;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_W_T        = 86;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_W_T_M      = 87;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH         = 88;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_M       = 89;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_T       = 90;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_T_M     = 91;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_W       = 92;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_W_M     = 93;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_W_T     = 94;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_F_TH_W_T_M   = 95;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S            = 96;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_M          = 97;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_T          = 98;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_T_M        = 99;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_W          = 100;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_W_M        = 101;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_W_T        = 102;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_W_T_M      = 103;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH         = 104;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_M       = 105;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_T       = 106;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_T_M     = 107;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_W       = 108;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_W_M     = 109;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_W_T     = 110;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_TH_W_T_M   = 111;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F          = 112;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_M        = 113;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_T        = 114;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_T_M      = 115;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_W        = 116;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_W_M      = 117;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_W_T      = 118;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_W_T_M    = 119;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH       = 120;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_M     = 121;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_T     = 122;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_T_M   = 123;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_W     = 124;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_W_M   = 125;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_W_T   = 126;
    public static final int VALUE_SCHEDULE_DAY3_STS_SA_S_F_TH_W_T_M = 127;
    public static final int VALUE_SCHEDULE_DAY3_STS_SNA             = 255;

    public static final int VALUE_SCHEDULE_TYPE1_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_TYPE1_DEPARTURE_TIME  = 1;
    public static final int VALUE_SCHEDULE_TYPE1_CHARGE_INTERVAL = 2;
    public static final int VALUE_SCHEDULE_TYPE1_SNA             = 3;

    public static final int VALUE_SCHEDULE_TYPE1_STS_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_TYPE1_STS_DEPARTURE_TIME  = 1;
    public static final int VALUE_SCHEDULE_TYPE1_STS_CHARGE_INTERVAL = 2;
    public static final int VALUE_SCHEDULE_TYPE1_STS_SNA             = 3;

    public static final int VALUE_SCHEDULE_TYPE2_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_TYPE2_DEPARTURE_TIME  = 1;
    public static final int VALUE_SCHEDULE_TYPE2_CHARGE_INTERVAL = 2;
    public static final int VALUE_SCHEDULE_TYPE2_SNA             = 3;

    public static final int VALUE_SCHEDULE_TYPE2_STS_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_TYPE2_STS_DEPARTURE_TIME  = 1;
    public static final int VALUE_SCHEDULE_TYPE2_STS_CHARGE_INTERVAL = 2;
    public static final int VALUE_SCHEDULE_TYPE2_STS_SNA             = 3;

    public static final int VALUE_SCHEDULE_TYPE3_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_TYPE3_DEPARTURE_TIME  = 1;
    public static final int VALUE_SCHEDULE_TYPE3_CHARGE_INTERVAL = 2;
    public static final int VALUE_SCHEDULE_TYPE3_SNA             = 3;

    public static final int VALUE_SCHEDULE_TYPE3_STS_NO_SELECTION    = 0;
    public static final int VALUE_SCHEDULE_TYPE3_STS_DEPARTURE_TIME  = 1;
    public static final int VALUE_SCHEDULE_TYPE3_STS_CHARGE_INTERVAL = 2;
    public static final int VALUE_SCHEDULE_TYPE3_STS_SNA             = 3;

    public static final int VALUE_START_TIME_HR1_SNA = 2147483647;

    public static final int VALUE_START_TIME_HR1_STS_SNA = 2147483647;

    public static final int VALUE_START_TIME_HR2_SNA = 2147483647;

    public static final int VALUE_START_TIME_HR2_STS_SNA = 2147483647;

    public static final int VALUE_START_TIME_HR3_SNA = 2147483647;

    public static final int VALUE_START_TIME_HR3_STS_SNA = 2147483647;

    public static final int VALUE_START_TIME_MIN1_SNA = 2147483647;

    public static final int VALUE_START_TIME_MIN1_STS_SNA = 2147483647;

    public static final int VALUE_START_TIME_MIN2_SNA = 2147483647;

    public static final int VALUE_START_TIME_MIN2_STS_SNA = 2147483647;

    public static final int VALUE_START_TIME_MIN3_SNA = 2147483647;

    public static final int VALUE_START_TIME_MIN3_STS_SNA = 2147483647;

    /**
     * Gets the BatPwrUsage from the vehicle.
     * @base PN - RUPHEV
     * @return kW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBatPwrUsage() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BatPwrUsage.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBatPwrUsageChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BatPwrUsage.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBatPwrUsageChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BatPwrUsageDisp from the vehicle.
     * @base PN - RUPHEV
     * @return kW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBatPwrUsageDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BatPwrUsageDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBatPwrUsageDispChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BatPwrUsageDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBatPwrUsageDispChange(FcaIEVManagerCallback callback);

    /**
     * Request the Batt_CabinPriority1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetBatt_CabinPriority1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setBatt_CabinPriority1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Batt_CabinPriority1_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_BATT_CABINPRIORITY1_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBatt_CabinPriority1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Batt_CabinPriority1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBatt_CabinPriority1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Batt_CabinPriority1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBatt_CabinPriority1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Batt_CabinPriority2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetBatt_CabinPriority2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setBatt_CabinPriority2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Batt_CabinPriority2_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_BATT_CABINPRIORITY2_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBatt_CabinPriority2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Batt_CabinPriority2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBatt_CabinPriority2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Batt_CabinPriority2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBatt_CabinPriority2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Batt_CabinPriority3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetBatt_CabinPriority3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setBatt_CabinPriority3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Batt_CabinPriority3_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_BATT_CABINPRIORITY3_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBatt_CabinPriority3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Batt_CabinPriority3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBatt_CabinPriority3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Batt_CabinPriority3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBatt_CabinPriority3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Battery_charge_stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_BATTERY_CHARGE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBattery_charge_stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Battery_charge_stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBattery_charge_statChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Battery_charge_stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBattery_charge_statChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BatteryCurrentLevel from the vehicle.
     * @base ATL - BEV
     * @return Amp
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getBatteryCurrentLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BatteryCurrentLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBatteryCurrentLevelChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BatteryCurrentLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBatteryCurrentLevelChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMCellOverWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMCellOverWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMCellOverWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMCellOverWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMCellOverWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMCellOverWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMCellUnderWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMCellUnderWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMCellUnderWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMCellUnderWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMCellUnderWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMCellUnderWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMHighSOCWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMHighSOCWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMHighSOCWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMHighSOCWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMHighSOCWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMHighSOCWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMInsulWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMInsulWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMInsulWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMInsulWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMInsulWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMInsulWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMMaxTempWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMMaxTempWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMMaxTempWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMMaxTempWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMMaxTempWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMMaxTempWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMOverChrgWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMOverChrgWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMOverChrgWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMOverChrgWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMOverChrgWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMOverChrgWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMOverVoltWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMOverVoltWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMOverVoltWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMOverVoltWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMOverVoltWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMOverVoltWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the BPCMSOCLowWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getBPCMSOCLowWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BPCMSOCLowWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerBPCMSOCLowWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BPCMSOCLowWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterBPCMSOCLowWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the CabinPreCondReqStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_CABIN_PRE_COND_REQ_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getCabinPreCondReqStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CabinPreCondReqStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerCabinPreCondReqStatChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CabinPreCondReqStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterCabinPreCondReqStatChange(FcaIEVManagerCallback callback);

    /**
     * Request the ChargeNow of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetChargeNowFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setChargeNow(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the ChargeUntilFull1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetChargeUntilFull1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setChargeUntilFull1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ChargeUntilFull1_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_CHARGEUNTILFULL1_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getChargeUntilFull1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ChargeUntilFull1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerChargeUntilFull1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ChargeUntilFull1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterChargeUntilFull1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the ChargeUntilFull2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetChargeUntilFull2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setChargeUntilFull2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ChargeUntilFull2_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_CHARGEUNTILFULL2_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getChargeUntilFull2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ChargeUntilFull2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerChargeUntilFull2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ChargeUntilFull2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterChargeUntilFull2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the ChargeUntilFull3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetChargeUntilFull3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setChargeUntilFull3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ChargeUntilFull3_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_CHARGEUNTILFULL3_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getChargeUntilFull3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ChargeUntilFull3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerChargeUntilFull3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ChargeUntilFull3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterChargeUntilFull3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Gets the ChargingLevel from the vehicle.
     * @base ATLH - WL
     * @return VALUE_CHARGING_LEVEL
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getChargingLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ChargingLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerChargingLevelChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ChargingLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterChargingLevelChange(FcaIEVManagerCallback callback);

    /**
     * Gets the ChargingSysSts from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_CHARGING_SYS_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getChargingSysSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ChargingSysSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerChargingSysStsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ChargingSysSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterChargingSysStsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Do_Not_Repeat1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetDo_Not_Repeat1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setDo_Not_Repeat1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Do_Not_Repeat1_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_DO_NOT_REPEAT1_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getDo_Not_Repeat1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Do_Not_Repeat1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerDo_Not_Repeat1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Do_Not_Repeat1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterDo_Not_Repeat1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Do_Not_Repeat2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetDo_Not_Repeat2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setDo_Not_Repeat2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Do_Not_Repeat2_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_DO_NOT_REPEAT2_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getDo_Not_Repeat2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Do_Not_Repeat2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerDo_Not_Repeat2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Do_Not_Repeat2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterDo_Not_Repeat2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Do_Not_Repeat3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetDo_Not_Repeat3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setDo_Not_Repeat3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Do_Not_Repeat3_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_DO_NOT_REPEAT3_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getDo_Not_Repeat3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Do_Not_Repeat3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerDo_Not_Repeat3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Do_Not_Repeat3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterDo_Not_Repeat3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Electric_Dist_Kilometers from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getElectric_Dist_Kilometers() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Electric_Dist_Kilometers.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerElectric_Dist_KilometersChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Electric_Dist_Kilometers.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterElectric_Dist_KilometersChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Electric_Dist_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getElectric_Dist_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Electric_Dist_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerElectric_Dist_MilesChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Electric_Dist_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterElectric_Dist_MilesChange(FcaIEVManagerCallback callback);

    /**
     * Request the Enable_Schedule1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnable_Schedule1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnable_Schedule1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the Enable_Schedule2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnable_Schedule2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnable_Schedule2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the Enable_Schedule3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnable_Schedule3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnable_Schedule3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the End_Time_Hr1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnd_Time_Hr1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnd_Time_Hr1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the End_Time_Hr1_Sts from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEnd_Time_Hr1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to End_Time_Hr1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEnd_Time_Hr1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to End_Time_Hr1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEnd_Time_Hr1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the End_Time_Hr2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnd_Time_Hr2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnd_Time_Hr2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the End_Time_Hr2_Sts from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEnd_Time_Hr2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to End_Time_Hr2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEnd_Time_Hr2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to End_Time_Hr2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEnd_Time_Hr2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the End_Time_Hr3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnd_Time_Hr3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnd_Time_Hr3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the End_Time_Hr3_Sts from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEnd_Time_Hr3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to End_Time_Hr3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEnd_Time_Hr3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to End_Time_Hr3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEnd_Time_Hr3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the End_Time_Min1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnd_Time_Min1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnd_Time_Min1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the End_Time_Min1_Sts from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEnd_Time_Min1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to End_Time_Min1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEnd_Time_Min1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to End_Time_Min1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEnd_Time_Min1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the End_Time_Min2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnd_Time_Min2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnd_Time_Min2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the End_Time_Min2_Sts from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEnd_Time_Min2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to End_Time_Min2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEnd_Time_Min2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to End_Time_Min2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEnd_Time_Min2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the End_Time_Min3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEnd_Time_Min3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setEnd_Time_Min3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the End_Time_Min3_Sts from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEnd_Time_Min3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to End_Time_Min3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEnd_Time_Min3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to End_Time_Min3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEnd_Time_Min3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the ESaveReq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetESaveReqFailed() on error
     */
    void setESaveReq(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Est_HVBatSOC_HCP from the vehicle.
     * @base ATL - BEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getEst_HVBatSOC_HCP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Est_HVBatSOC_HCP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEst_HVBatSOC_HCPChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Est_HVBatSOC_HCP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEst_HVBatSOC_HCPChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Est_Range from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEst_Range() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Est_Range.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEst_RangeChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Est_Range.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEst_RangeChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Est_Range_ChrgStopTime from the vehicle.
     * @base ATL - BEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getEst_Range_ChrgStopTime() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Est_Range_ChrgStopTime.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEst_Range_ChrgStopTimeChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Est_Range_ChrgStopTime.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEst_Range_ChrgStopTimeChange(FcaIEVManagerCallback callback);

    /**
     * Gets the EstTimeofChrg_DC_Fast_100 from the vehicle.
     * @base ATL - BEV
     * @return Min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEstTimeofChrg_DC_Fast_100() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EstTimeofChrg_DC_Fast_100.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEstTimeofChrg_DC_Fast_100Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EstTimeofChrg_DC_Fast_100.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEstTimeofChrg_DC_Fast_100Change(FcaIEVManagerCallback callback);

    /**
     * Gets the EstTimeofChrg_DC_Fast_80 from the vehicle.
     * @base ATL - BEV
     * @return Min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEstTimeofChrg_DC_Fast_80() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EstTimeofChrg_DC_Fast_80.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEstTimeofChrg_DC_Fast_80Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EstTimeofChrg_DC_Fast_80.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEstTimeofChrg_DC_Fast_80Change(FcaIEVManagerCallback callback);

    /**
     * Gets the EstTimeofChrg_Lv1 from the vehicle.
     * @base PN - RUPHEV
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEstTimeofChrg_Lv1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EstTimeofChrg_Lv1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEstTimeofChrg_Lv1Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EstTimeofChrg_Lv1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEstTimeofChrg_Lv1Change(FcaIEVManagerCallback callback);

    /**
     * Gets the EstTimeofChrg_Lv2 from the vehicle.
     * @base PN - RUPHEV
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getEstTimeofChrg_Lv2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EstTimeofChrg_Lv2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerEstTimeofChrg_Lv2Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EstTimeofChrg_Lv2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterEstTimeofChrg_Lv2Change(FcaIEVManagerCallback callback);

    /**
     * Gets the Gas_Range from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getGas_Range() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Gas_Range.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerGas_RangeChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Gas_Range.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterGas_RangeChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HEV_EVT_MD from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHEV_EVT_MD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HEV_EVT_MD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHEV_EVT_MDChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HEV_EVT_MD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHEV_EVT_MDChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVACPwrUsageDisp from the vehicle.
     * @base PN - RUPHEV
     * @return kW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVACPwrUsageDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVACPwrUsageDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVACPwrUsageDispChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVACPwrUsageDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVACPwrUsageDispChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBat_CoolantLvlLo from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBat_CoolantLvlLo() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBat_CoolantLvlLo.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBat_CoolantLvlLoChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBat_CoolantLvlLo.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBat_CoolantLvlLoChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatCellVltMax from the vehicle.
     * @base PN - RUPHEV
     * @return V
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getHVBatCellVltMax() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatCellVltMax.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatCellVltMaxChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatCellVltMax.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatCellVltMaxChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatCellVltMin from the vehicle.
     * @base PN - RUPHEV
     * @return V
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getHVBatCellVltMin() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatCellVltMin.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatCellVltMinChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatCellVltMin.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatCellVltMinChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatCntctrStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_H_V_BAT_CNTCTR_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatCntctrStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatCntctrStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatCntctrStatChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatCntctrStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatCntctrStatChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatCrnt from the vehicle.
     * @base PN - RUPHEV
     * @return A
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getHVBatCrnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatCrnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatCrntChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatCrnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatCrntChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatIsolStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_H_V_BAT_ISOL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatIsolStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatIsolStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatIsolStatChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatIsolStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatIsolStatChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatMod_NumMaxVlt from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_HVBATMOD_NUMMAXVLT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatMod_NumMaxVlt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatMod_NumMaxVlt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatMod_NumMaxVltChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatMod_NumMaxVlt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatMod_NumMaxVltChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatMod_NumMinVlt from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_HVBATMOD_NUMMINVLT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatMod_NumMinVlt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatMod_NumMinVlt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatMod_NumMinVltChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatMod_NumMinVlt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatMod_NumMinVltChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatPk_CellNumMaxVlt from the vehicle.
     * @base PN - RUPHEV
     * @return V
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatPk_CellNumMaxVlt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatPk_CellNumMaxVlt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatPk_CellNumMaxVltChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatPk_CellNumMaxVlt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatPk_CellNumMaxVltChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatPk_CellNumMinVlt from the vehicle.
     * @base PN - RUPHEV
     * @return V
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatPk_CellNumMinVlt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatPk_CellNumMinVlt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatPk_CellNumMinVltChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatPk_CellNumMinVlt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatPk_CellNumMinVltChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatSOC_HCP from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getHVBatSOC_HCP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatSOC_HCP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatSOC_HCPChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatSOC_HCP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatSOC_HCPChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatSOCV_HCP from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVBatSOCV_HCP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatSOCV_HCP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatSOCV_HCPChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatSOCV_HCP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatSOCV_HCPChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVBatVlt from the vehicle.
     * @base PN - RUPHEV
     * @return V
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    float getHVBatVlt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVBatVlt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVBatVltChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVBatVlt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVBatVltChange(FcaIEVManagerCallback callback);

    /**
     * Gets the HVILWrn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHVILWrn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVILWrn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHVILWrnChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVILWrn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHVILWrnChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Hybrid_Dist_Kilometers from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHybrid_Dist_Kilometers() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Hybrid_Dist_Kilometers.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHybrid_Dist_KilometersChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Hybrid_Dist_Kilometers.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHybrid_Dist_KilometersChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Hybrid_Dist_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getHybrid_Dist_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Hybrid_Dist_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerHybrid_Dist_MilesChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Hybrid_Dist_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterHybrid_Dist_MilesChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Charge_End_Time_Hr from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Charge_End_Time_Hr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Charge_End_Time_Hr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Charge_End_Time_HrChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Charge_End_Time_Hr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Charge_End_Time_HrChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Charge_End_Time_Min from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Charge_End_Time_Min() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Charge_End_Time_Min.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Charge_End_Time_MinChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Charge_End_Time_Min.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Charge_End_Time_MinChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Charge_EndDay from the vehicle.
     * @base ATLH - WL
     * @return VALUE_NEXT_CHARGE_ENDDAY
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Charge_EndDay() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Charge_EndDay.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Charge_EndDayChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Charge_EndDay.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Charge_EndDayChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Charge_Start_Time_Hr from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Charge_Start_Time_Hr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Charge_Start_Time_Hr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Charge_Start_Time_HrChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Charge_Start_Time_Hr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Charge_Start_Time_HrChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Charge_Start_Time_Min from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Charge_Start_Time_Min() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Charge_Start_Time_Min.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Charge_Start_Time_MinChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Charge_Start_Time_Min.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Charge_Start_Time_MinChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Charge_StartDay from the vehicle.
     * @base ATLH - WL
     * @return VALUE_NEXT_CHARGE_STARTDAY
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Charge_StartDay() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Charge_StartDay.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Charge_StartDayChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Charge_StartDay.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Charge_StartDayChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Climate_Day from the vehicle.
     * @base ATLH - WL
     * @return VALUE_NEXT_CLIMATE_DAY
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Climate_Day() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Climate_Day.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Climate_DayChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Climate_Day.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Climate_DayChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Climate_Time_Hr from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Climate_Time_Hr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Climate_Time_Hr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Climate_Time_HrChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Climate_Time_Hr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Climate_Time_HrChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Next_Climate_Time_Min from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getNext_Climate_Time_Min() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Next_Climate_Time_Min.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerNext_Climate_Time_MinChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Next_Climate_Time_Min.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterNext_Climate_Time_MinChange(FcaIEVManagerCallback callback);

    /**
     * Gets the Schedule_Confirmed1 from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_CONFIRMED1
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Confirmed1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Confirmed1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Confirmed1Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Confirmed1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Confirmed1Change(FcaIEVManagerCallback callback);

    /**
     * Gets the Schedule_Confirmed2 from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_CONFIRMED2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Confirmed2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Confirmed2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Confirmed2Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Confirmed2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Confirmed2Change(FcaIEVManagerCallback callback);

    /**
     * Gets the Schedule_Confirmed3 from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_CONFIRMED3
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Confirmed3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Confirmed3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Confirmed3Change(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Confirmed3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Confirmed3Change(FcaIEVManagerCallback callback);

    /**
     * Request the Schedule_Day1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSchedule_Day1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSchedule_Day1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Schedule_Day1_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_DAY1_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Day1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Day1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Day1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Day1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Day1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Schedule_Day2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSchedule_Day2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSchedule_Day2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Schedule_Day2_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_DAY2_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Day2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Day2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Day2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Day2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Day2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Schedule_Day3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSchedule_Day3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSchedule_Day3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Schedule_Day3_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_DAY3_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Day3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Day3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Day3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Day3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Day3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Schedule_Type1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSchedule_Type1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSchedule_Type1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Schedule_Type1_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_TYPE1_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Type1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Type1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Type1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Type1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Type1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Schedule_Type2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSchedule_Type2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSchedule_Type2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Schedule_Type2_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_TYPE2_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Type2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Type2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Type2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Type2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Type2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Schedule_Type3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSchedule_Type3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSchedule_Type3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Schedule_Type3_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SCHEDULE_TYPE3_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getSchedule_Type3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Schedule_Type3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerSchedule_Type3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Schedule_Type3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterSchedule_Type3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Start_Time_Hr1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetStart_Time_Hr1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setStart_Time_Hr1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Start_Time_Hr1_Sts from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getStart_Time_Hr1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Start_Time_Hr1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerStart_Time_Hr1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Start_Time_Hr1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterStart_Time_Hr1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Start_Time_Hr2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetStart_Time_Hr2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setStart_Time_Hr2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Start_Time_Hr2_Sts from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getStart_Time_Hr2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Start_Time_Hr2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerStart_Time_Hr2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Start_Time_Hr2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterStart_Time_Hr2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Start_Time_Hr3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetStart_Time_Hr3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setStart_Time_Hr3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Start_Time_Hr3_Sts from the vehicle.
     * @base ATLH - WL
     * @return Hours
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getStart_Time_Hr3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Start_Time_Hr3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerStart_Time_Hr3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Start_Time_Hr3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterStart_Time_Hr3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Start_Time_Min1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetStart_Time_Min1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setStart_Time_Min1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Start_Time_Min1_Sts from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getStart_Time_Min1_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Start_Time_Min1_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerStart_Time_Min1_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Start_Time_Min1_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterStart_Time_Min1_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Start_Time_Min2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetStart_Time_Min2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setStart_Time_Min2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Start_Time_Min2_Sts from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getStart_Time_Min2_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Start_Time_Min2_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerStart_Time_Min2_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Start_Time_Min2_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterStart_Time_Min2_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Start_Time_Min3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetStart_Time_Min3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setStart_Time_Min3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Start_Time_Min3_Sts from the vehicle.
     * @base ATLH - WL
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getStart_Time_Min3_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Start_Time_Min3_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerStart_Time_Min3_StsChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Start_Time_Min3_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterStart_Time_Min3_StsChange(FcaIEVManagerCallback callback);

    /**
     * Request the Submit_Schedule1 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSubmit_Schedule1Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSubmit_Schedule1(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the Submit_Schedule2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSubmit_Schedule2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSubmit_Schedule2(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the Submit_Schedule3 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetSubmit_Schedule3Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_WRITE_HIGH
     */
    void setSubmit_Schedule3(int value, FcaIEVManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Total_Range from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getTotal_Range() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Total_Range.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerTotal_RangeChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Total_Range.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterTotal_RangeChange(FcaIEVManagerCallback callback);

    /**
     * Gets the TravelDistance from the vehicle.
     * @base ATL - MP
     * @return m
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    int getTravelDistance() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TravelDistance.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean registerTravelDistanceChange(FcaIEVManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TravelDistance.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_EV_READ_HIGH
     */
    boolean unregisterTravelDistanceChange(FcaIEVManagerCallback callback);

    /**
     * Callback interface to register IEVManager against.
     */
    public interface FcaIEVManagerCallback {
        default void onBatPwrUsageChange(int value) { }
        default void onBatPwrUsageDispChange(int value) { }
        default void onSetBatt_CabinPriority1Failed() { }
        default void onBatt_CabinPriority1_StsChange(int value) { }
        default void onSetBatt_CabinPriority2Failed() { }
        default void onBatt_CabinPriority2_StsChange(int value) { }
        default void onSetBatt_CabinPriority3Failed() { }
        default void onBatt_CabinPriority3_StsChange(int value) { }
        default void onBattery_charge_statChange(int value) { }
        default void onBatteryCurrentLevelChange(float value) { }
        default void onBPCMCellOverWrnChange(int value) { }
        default void onBPCMCellUnderWrnChange(int value) { }
        default void onBPCMHighSOCWrnChange(int value) { }
        default void onBPCMInsulWrnChange(int value) { }
        default void onBPCMMaxTempWrnChange(int value) { }
        default void onBPCMOverChrgWrnChange(int value) { }
        default void onBPCMOverVoltWrnChange(int value) { }
        default void onBPCMSOCLowWrnChange(int value) { }
        default void onCabinPreCondReqStatChange(int value) { }
        default void onSetChargeNowFailed() { }
        default void onSetChargeUntilFull1Failed() { }
        default void onChargeUntilFull1_StsChange(int value) { }
        default void onSetChargeUntilFull2Failed() { }
        default void onChargeUntilFull2_StsChange(int value) { }
        default void onSetChargeUntilFull3Failed() { }
        default void onChargeUntilFull3_StsChange(int value) { }
        default void onChargingLevelChange(int value) { }
        default void onChargingSysStsChange(int value) { }
        default void onSetDo_Not_Repeat1Failed() { }
        default void onDo_Not_Repeat1_StsChange(int value) { }
        default void onSetDo_Not_Repeat2Failed() { }
        default void onDo_Not_Repeat2_StsChange(int value) { }
        default void onSetDo_Not_Repeat3Failed() { }
        default void onDo_Not_Repeat3_StsChange(int value) { }
        default void onElectric_Dist_KilometersChange(int value) { }
        default void onElectric_Dist_MilesChange(int value) { }
        default void onSetEnable_Schedule1Failed() { }
        default void onSetEnable_Schedule2Failed() { }
        default void onSetEnable_Schedule3Failed() { }
        default void onSetEnd_Time_Hr1Failed() { }
        default void onEnd_Time_Hr1_StsChange(int value) { }
        default void onSetEnd_Time_Hr2Failed() { }
        default void onEnd_Time_Hr2_StsChange(int value) { }
        default void onSetEnd_Time_Hr3Failed() { }
        default void onEnd_Time_Hr3_StsChange(int value) { }
        default void onSetEnd_Time_Min1Failed() { }
        default void onEnd_Time_Min1_StsChange(int value) { }
        default void onSetEnd_Time_Min2Failed() { }
        default void onEnd_Time_Min2_StsChange(int value) { }
        default void onSetEnd_Time_Min3Failed() { }
        default void onEnd_Time_Min3_StsChange(int value) { }
        default void onSetESaveReqFailed() { }
        default void onEst_HVBatSOC_HCPChange(float value) { }
        default void onEst_RangeChange(int value) { }
        default void onEst_Range_ChrgStopTimeChange(float value) { }
        default void onEstTimeofChrg_DC_Fast_100Change(int value) { }
        default void onEstTimeofChrg_DC_Fast_80Change(int value) { }
        default void onEstTimeofChrg_Lv1Change(int value) { }
        default void onEstTimeofChrg_Lv2Change(int value) { }
        default void onGas_RangeChange(int value) { }
        default void onHEV_EVT_MDChange(int value) { }
        default void onHVACPwrUsageDispChange(int value) { }
        default void onHVBat_CoolantLvlLoChange(int value) { }
        default void onHVBatCellVltMaxChange(float value) { }
        default void onHVBatCellVltMinChange(float value) { }
        default void onHVBatCntctrStatChange(int value) { }
        default void onHVBatCrntChange(float value) { }
        default void onHVBatIsolStatChange(int value) { }
        default void onHVBatMod_NumMaxVltChange(int value) { }
        default void onHVBatMod_NumMinVltChange(int value) { }
        default void onHVBatPk_CellNumMaxVltChange(int value) { }
        default void onHVBatPk_CellNumMinVltChange(int value) { }
        default void onHVBatSOC_HCPChange(float value) { }
        default void onHVBatSOCV_HCPChange(int value) { }
        default void onHVBatVltChange(float value) { }
        default void onHVILWrnChange(int value) { }
        default void onHybrid_Dist_KilometersChange(int value) { }
        default void onHybrid_Dist_MilesChange(int value) { }
        default void onNext_Charge_End_Time_HrChange(int value) { }
        default void onNext_Charge_End_Time_MinChange(int value) { }
        default void onNext_Charge_EndDayChange(int value) { }
        default void onNext_Charge_Start_Time_HrChange(int value) { }
        default void onNext_Charge_Start_Time_MinChange(int value) { }
        default void onNext_Charge_StartDayChange(int value) { }
        default void onNext_Climate_DayChange(int value) { }
        default void onNext_Climate_Time_HrChange(int value) { }
        default void onNext_Climate_Time_MinChange(int value) { }
        default void onSchedule_Confirmed1Change(int value) { }
        default void onSchedule_Confirmed2Change(int value) { }
        default void onSchedule_Confirmed3Change(int value) { }
        default void onSetSchedule_Day1Failed() { }
        default void onSchedule_Day1_StsChange(int value) { }
        default void onSetSchedule_Day2Failed() { }
        default void onSchedule_Day2_StsChange(int value) { }
        default void onSetSchedule_Day3Failed() { }
        default void onSchedule_Day3_StsChange(int value) { }
        default void onSetSchedule_Type1Failed() { }
        default void onSchedule_Type1_StsChange(int value) { }
        default void onSetSchedule_Type2Failed() { }
        default void onSchedule_Type2_StsChange(int value) { }
        default void onSetSchedule_Type3Failed() { }
        default void onSchedule_Type3_StsChange(int value) { }
        default void onSetStart_Time_Hr1Failed() { }
        default void onStart_Time_Hr1_StsChange(int value) { }
        default void onSetStart_Time_Hr2Failed() { }
        default void onStart_Time_Hr2_StsChange(int value) { }
        default void onSetStart_Time_Hr3Failed() { }
        default void onStart_Time_Hr3_StsChange(int value) { }
        default void onSetStart_Time_Min1Failed() { }
        default void onStart_Time_Min1_StsChange(int value) { }
        default void onSetStart_Time_Min2Failed() { }
        default void onStart_Time_Min2_StsChange(int value) { }
        default void onSetStart_Time_Min3Failed() { }
        default void onStart_Time_Min3_StsChange(int value) { }
        default void onSetSubmit_Schedule1Failed() { }
        default void onSetSubmit_Schedule2Failed() { }
        default void onSetSubmit_Schedule3Failed() { }
        default void onTotal_RangeChange(int value) { }
        default void onTravelDistanceChange(int value) { }
    }
}
