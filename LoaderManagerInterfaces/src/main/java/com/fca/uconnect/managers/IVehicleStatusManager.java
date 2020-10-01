package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleStatusManager
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
public interface IVehicleStatusManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_ADS_MODE_REQ_DEFAULT = 0;
    public static final int VALUE_ADS_MODE_REQ_DM1     = 1;
    public static final int VALUE_ADS_MODE_REQ_DM2     = 2;
    public static final int VALUE_ADS_MODE_REQ_DM3     = 3;
    public static final int VALUE_ADS_MODE_REQ_MODE_1  = 4;
    public static final int VALUE_ADS_MODE_REQ_MODE_2  = 5;
    public static final int VALUE_ADS_MODE_REQ_MODE_3  = 6;
    public static final int VALUE_ADS_MODE_REQ_SNA     = 7;

    public static final int VALUE_ADS_SRVSYS_FALSE = 0;
    public static final int VALUE_ADS_SRVSYS_TRUE  = 1;

    public static final int VALUE_A_S_R_ACTIVE_NOT_ACTIVE = 0;
    public static final int VALUE_A_S_R_ACTIVE_ACTIVE     = 1;

    public static final int VALUE_AVG_FUEL_LEVEL_SNA = 511;

    public static final int VALUE_BRAKE_PEDAL_UPSTOP = 0;
    public static final int VALUE_BRAKE_PEDAL_PSD    = 1;
    public static final int VALUE_BRAKE_PEDAL_NDEF2  = 2;
    public static final int VALUE_BRAKE_PEDAL_SNA    = 3;

    public static final int VALUE_COOLENT_LEVEL_STAT_OFF   = 0;
    public static final int VALUE_COOLENT_LEVEL_STAT_CONT  = 1;
    public static final int VALUE_COOLENT_LEVEL_STAT_BLINK = 2;
    public static final int VALUE_COOLENT_LEVEL_STAT_SNA   = 3;

    public static final int VALUE_CUST_KEY_IN_IGN_CUST_KEY_DEFAULT         = 0;
    public static final int VALUE_CUST_KEY_IN_IGN_CUST_KEY_NOT_IN_IGNITION = 1;
    public static final int VALUE_CUST_KEY_IN_IGN_CUST_KEY_IN_IGNITION     = 2;
    public static final int VALUE_CUST_KEY_IN_IGN_SNA                      = 3;

    public static final int VALUE_DAYS_TO_SERVICE_SNA = 2147483647;

    public static final int VALUE_ECO_INDEX_ON_I_P_C_SNA = 127;

    public static final int VALUE_E_L_D_ACTIVE_NOT_ACTIVE = 0;
    public static final int VALUE_E_L_D_ACTIVE_ACTIVE     = 1;

    public static final int VALUE_ENG_DRVMDRQ_NORMAL     = 0;
    public static final int VALUE_ENG_DRVMDRQ_ECO        = 1;
    public static final int VALUE_ENG_DRVMDRQ_SPORT      = 2;
    public static final int VALUE_ENG_DRVMDRQ_TRACK      = 3;
    public static final int VALUE_ENG_DRVMDRQ_SPORT_PLUS = 4;
    public static final int VALUE_ENG_DRVMDRQ_NP         = 6;
    public static final int VALUE_ENG_DRVMDRQ_SNA        = 7;

    public static final int VALUE_ENG_COOL_TEMP_SNA = 255;

    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL1  = 0;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL2  = 1;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL3  = 2;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL4  = 3;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL5  = 4;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL6  = 5;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL7  = 6;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL8  = 7;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL9  = 8;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL10 = 9;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL11 = 10;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL12 = 11;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL13 = 12;
    public static final int VALUE_ENGINE_OIL_LEVEL_LEVEL14 = 13;
    public static final int VALUE_ENGINE_OIL_LEVEL_SNA     = 31;

    public static final int VALUE_ENGRUN_STAT_STOP        = 0;
    public static final int VALUE_ENGRUN_STAT_START       = 1;
    public static final int VALUE_ENGRUN_STAT_IDLE_UNSTBL = 2;
    public static final int VALUE_ENGRUN_STAT_IDLE_STBL   = 3;
    public static final int VALUE_ENGRUN_STAT_UNLIMITED   = 4;
    public static final int VALUE_ENGRUN_STAT_LIMITED     = 5;
    public static final int VALUE_ENGRUN_STAT_NDEF6       = 6;
    public static final int VALUE_ENGRUN_STAT_SNA         = 7;

    public static final int VALUE_EPS_MODE_REQ_DEFAULT = 0;
    public static final int VALUE_EPS_MODE_REQ_DM1     = 1;
    public static final int VALUE_EPS_MODE_REQ_DM2     = 2;
    public static final int VALUE_EPS_MODE_REQ_DM3     = 3;
    public static final int VALUE_EPS_MODE_REQ_MODE_1  = 4;
    public static final int VALUE_EPS_MODE_REQ_MODE_2  = 5;
    public static final int VALUE_EPS_MODE_REQ_MODE_3  = 6;
    public static final int VALUE_EPS_MODE_REQ_SNA     = 7;

    public static final int VALUE_ESC_SFT_BTN_STATUS_ON          = 0;
    public static final int VALUE_ESC_SFT_BTN_STATUS_PARTIAL_1   = 1;
    public static final int VALUE_ESC_SFT_BTN_STATUS_PARTIAL_2   = 2;
    public static final int VALUE_ESC_SFT_BTN_STATUS_OFF         = 3;
    public static final int VALUE_ESC_SFT_BTN_STATUS_NOT_PRESSED = 4;
    public static final int VALUE_ESC_SFT_BTN_STATUS_SNOW        = 5;
    public static final int VALUE_ESC_SFT_BTN_STATUS_SNA         = 7;

    public static final int VALUE_FUEL_TYPE_UNLEADED = 0;
    public static final int VALUE_FUEL_TYPE_DIESEL   = 1;
    public static final int VALUE_FUEL_TYPE_FLEX     = 2;
    public static final int VALUE_FUEL_TYPE_CNG      = 3;
    public static final int VALUE_FUEL_TYPE_SNA      = 7;

    public static final int VALUE_H_D_C_AUTO_DISABLED_HDCAUTODISABLED_ON  = 0;
    public static final int VALUE_H_D_C_AUTO_DISABLED_HDCAUTODISABLED_OFF = 1;

    public static final int VALUE_H_D_C_AUTO_DISABLED_BRAKES_HDCAUTODISABLEDBRAKES_ON  = 0;
    public static final int VALUE_H_D_C_AUTO_DISABLED_BRAKES_HDCAUTODISABLEDBRAKES_OFF = 1;

    public static final int VALUE_H_D_C_DISABLED_HDCDISABLED_ON  = 0;
    public static final int VALUE_H_D_C_DISABLED_HDCDISABLED_OFF = 1;

    public static final int VALUE_H_D_C_ENABLED_HDCENABLED_ON  = 0;
    public static final int VALUE_H_D_C_ENABLED_HDCENABLED_OFF = 1;

    public static final int VALUE_H_D_C_INTERVENTION_HDCINTERVENTION_ON  = 0;
    public static final int VALUE_H_D_C_INTERVENTION_HDCINTERVENTION_OFF = 1;

    public static final int VALUE_H_D_C_UNAVAILABLE4_W_DLOW_HDCUNAVAILABLE4WDLOW_ON  = 0;
    public static final int VALUE_H_D_C_UNAVAILABLE4_W_DLOW_HDCUNAVAILABLE4WDLOW_OFF = 1;

    public static final int VALUE_HP_MODE_SEL_NONE  = 0;
    public static final int VALUE_HP_MODE_SEL_VALET = 1;
    public static final int VALUE_HP_MODE_SEL_BLACK = 2;
    public static final int VALUE_HP_MODE_SEL_RED   = 3;
    public static final int VALUE_HP_MODE_SEL_SNA   = 7;

    public static final int VALUE_HP_MODE_STS_NONE  = 0;
    public static final int VALUE_HP_MODE_STS_VALET = 1;
    public static final int VALUE_HP_MODE_STS_BLACK = 2;
    public static final int VALUE_HP_MODE_STS_RED   = 3;
    public static final int VALUE_HP_MODE_STS_SNA   = 7;

    public static final int VALUE_H_T_SHT_OFF_VLV_REQ_OPEN  = 0;
    public static final int VALUE_H_T_SHT_OFF_VLV_REQ_CLOSE = 1;

    public static final int VALUE_IGN_POS_IGN_LK      = 0;
    public static final int VALUE_IGN_POS_IGN_OFF_ACC = 3;
    public static final int VALUE_IGN_POS_IGN_RUN     = 4;
    public static final int VALUE_IGN_POS_IGN_START   = 5;
    public static final int VALUE_IGN_POS_SNA         = 7;

    public static final int VALUE_MEMRQ_FOBNUM_FOB_DEFAULT = 0;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_1       = 1;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_2       = 2;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_3       = 3;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_4       = 4;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_5       = 5;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_6       = 6;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_7       = 7;
    public static final int VALUE_MEMRQ_FOBNUM_FOB_8       = 8;
    public static final int VALUE_MEMRQ_FOBNUM_SNA         = 15;

    public static final int VALUE_MRM_STATUS_NOT_ACTIVE                  = 0;
    public static final int VALUE_MRM_STATUS_MRM_IN_PROCESS              = 1;
    public static final int VALUE_MRM_STATUS_VEHICLE_SECURE_REQUEST      = 2;
    public static final int VALUE_MRM_STATUS_VEHICLE_SECUREMENT_COMPLETE = 3;
    public static final int VALUE_MRM_STATUS_CANCELED                    = 4;
    public static final int VALUE_MRM_STATUS_SNA                         = 7;

    public static final int VALUE_MRM_STATUS_C2_NOT_ACTIVE                  = 0;
    public static final int VALUE_MRM_STATUS_C2_MRM_IN_PROCESS              = 1;
    public static final int VALUE_MRM_STATUS_C2_VEHICLE_SECURE_REQUEST      = 2;
    public static final int VALUE_MRM_STATUS_C2_VEHICLE_SECUREMENT_COMPLETE = 3;
    public static final int VALUE_MRM_STATUS_C2_CANCELED                    = 4;
    public static final int VALUE_MRM_STATUS_C2_SNA                         = 7;

    public static final int VALUE_OPERATIONAL_MODE_STS_INITIALIZATION          = 0;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_OFF_WITHOUTKEY = 1;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_OFF            = 2;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_ACC            = 3;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_ON             = 4;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_PRE_START      = 5;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_START          = 6;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_CRANKING       = 7;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_ON_ENGON       = 8;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_PRE_ACC        = 9;
    public static final int VALUE_OPERATIONAL_MODE_STS_IGNITION_PRE_OFF        = 10;
    public static final int VALUE_OPERATIONAL_MODE_STS_AUTOMATIC_CRANKING      = 11;
    public static final int VALUE_OPERATIONAL_MODE_STS_AUTOMATIC_STOP          = 12;
    public static final int VALUE_OPERATIONAL_MODE_STS_KEY_AUTHENTICATED       = 13;
    public static final int VALUE_OPERATIONAL_MODE_STS_NOT_USED                = 14;
    public static final int VALUE_OPERATIONAL_MODE_STS_SNA                     = 15;

    public static final int VALUE_POWER_MODE_IGN_LK      = 0;
    public static final int VALUE_POWER_MODE_IGN_OFF_ACC = 3;
    public static final int VALUE_POWER_MODE_IGN_RUN     = 4;
    public static final int VALUE_POWER_MODE_IGN_START   = 5;
    public static final int VALUE_POWER_MODE_SNA         = 7;

    public static final int VALUE_POWERTRAIN_PRPLSN_ACTV_OFF    = 0;
    public static final int VALUE_POWERTRAIN_PRPLSN_ACTV_ACTIVE = 1;

    public static final int VALUE_REMST_INHIBIT_INHIBIT_DEFAULT       = 0;
    public static final int VALUE_REMST_INHIBIT_TIME_OUT_RUN          = 1;
    public static final int VALUE_REMST_INHIBIT_TIME_OUT_CUST_MODE    = 2;
    public static final int VALUE_REMST_INHIBIT_KEY_IN_RUN            = 3;
    public static final int VALUE_REMST_INHIBIT_DRV_DOOR_AJAR         = 4;
    public static final int VALUE_REMST_INHIBIT_PASS_DOOR_AJAR        = 5;
    public static final int VALUE_REMST_INHIBIT_LR_DOOR_AJR           = 6;
    public static final int VALUE_REMST_INHIBIT_RR_DOOR_AJAR          = 7;
    public static final int VALUE_REMST_INHIBIT_FAIL_COUNTER          = 9;
    public static final int VALUE_REMST_INHIBIT_LOW_RPM_SHUTDOWN      = 10;
    public static final int VALUE_REMST_INHIBIT_KEY_IN_IGN            = 11;
    public static final int VALUE_REMST_INHIBIT_BRAKE_PRESSED         = 12;
    public static final int VALUE_REMST_INHIBIT_HAZARD_LAMP_ON        = 13;
    public static final int VALUE_REMST_INHIBIT_NOT_IN_PARK           = 14;
    public static final int VALUE_REMST_INHIBIT_VEH_SPEED_HIGH        = 15;
    public static final int VALUE_REMST_INHIBIT_HOOD_AJAR             = 16;
    public static final int VALUE_REMST_INHIBIT_TRUNK_LIFTGATE        = 17;
    public static final int VALUE_REMST_INHIBIT_VTA_ALARM             = 18;
    public static final int VALUE_REMST_INHIBIT_PANIC_MODE            = 19;
    public static final int VALUE_REMST_INHIBIT_BATT_VOLT_HIGH        = 20;
    public static final int VALUE_REMST_INHIBIT_BATT_VOLT_LOW         = 21;
    public static final int VALUE_REMST_INHIBIT_POWER_LOSS            = 22;
    public static final int VALUE_REMST_INHIBIT_MIL_ON                = 23;
    public static final int VALUE_REMST_INHIBIT_OIL_PRESSURE_LOW      = 24;
    public static final int VALUE_REMST_INHIBIT_COOLANT_TEMP_HIGH     = 25;
    public static final int VALUE_REMST_INHIBIT_RPM_HIGH              = 26;
    public static final int VALUE_REMST_INHIBIT_CRANK_NO_START        = 27;
    public static final int VALUE_REMST_INHIBIT_REMOTE_OFF_RQ         = 28;
    public static final int VALUE_REMST_INHIBIT_RS_DISABLED_PREV      = 29;
    public static final int VALUE_REMST_INHIBIT_NOT_CONFIGURED        = 30;
    public static final int VALUE_REMST_INHIBIT_NO_HOOD_SWITCH        = 31;
    public static final int VALUE_REMST_INHIBIT_NO_AUTO_TRANS         = 32;
    public static final int VALUE_REMST_INHIBIT_NOT_ENABLED           = 33;
    public static final int VALUE_REMST_INHIBIT_INVALID_SKIM_KEY      = 34;
    public static final int VALUE_REMST_INHIBIT_IGN_SNA               = 35;
    public static final int VALUE_REMST_INHIBIT_IGN_NOT_LOCK          = 36;
    public static final int VALUE_REMST_INHIBIT_GLOW_PLUG_TIMEOUT     = 37;
    public static final int VALUE_REMST_INHIBIT_LOW_FUEL              = 38;
    public static final int VALUE_REMST_INHIBIT_ETC_LAMP_ON           = 39;
    public static final int VALUE_REMST_INHIBIT_LOGISTIC_MODE         = 40;
    public static final int VALUE_REMST_INHIBIT_COLD_START_LAMP       = 41;
    public static final int VALUE_REMST_INHIBIT_ESL_NOT_UNLOCK        = 42;
    public static final int VALUE_REMST_INHIBIT_RFHUB_HS_FAIL         = 43;
    public static final int VALUE_REMST_INHIBIT_PSA_NOT_ACTIVE        = 44;
    public static final int VALUE_REMST_INHIBIT_ABORT_CRANKING_ENABLE = 45;
    public static final int VALUE_REMST_INHIBIT_SNA                   = 255;

    public static final int VALUE_SHIFT_IN_PROGRESS_NO_SHIFTINPROGRESS = 0;
    public static final int VALUE_SHIFT_IN_PROGRESS_SHIFTINPROGRESS    = 1;

    public static final int VALUE_SPEEDOMETER_SNA = 2147483647;

    public static final int VALUE_SWAYBAR_STS_UNLOCKED = 0;
    public static final int VALUE_SWAYBAR_STS_LOCKED   = 1;
    public static final int VALUE_SWAYBAR_STS_S_I_P    = 2;
    public static final int VALUE_SWAYBAR_STS_SNA      = 3;

    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM0  = 0;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM1  = 1;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM2  = 2;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM3  = 3;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM4  = 4;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM5  = 5;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM6  = 6;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM7  = 7;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM8  = 8;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM9  = 9;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM10 = 10;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM11 = 11;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM12 = 12;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM13 = 13;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_TM14 = 14;
    public static final int VALUE_SWAY_BAR_E_V_I_C_DISPLAY_SNA  = 15;

    public static final int VALUE_TELEMATIC_POWER_SLEEP             = 0;
    public static final int VALUE_TELEMATIC_POWER_STANDBY           = 1;
    public static final int VALUE_TELEMATIC_POWER_TIMED             = 2;
    public static final int VALUE_TELEMATIC_POWER_IDLE              = 3;
    public static final int VALUE_TELEMATIC_POWER_FULL_OPERATION    = 4;
    public static final int VALUE_TELEMATIC_POWER_LOGISTIC_ON       = 5;
    public static final int VALUE_TELEMATIC_POWER_BENCH             = 6;
    public static final int VALUE_TELEMATIC_POWER_PARTIAL_OPERATION = 7;

    public static final int VALUE_T_P_M_ACTIVITY_STS_TPM_ENABLED  = 0;
    public static final int VALUE_T_P_M_ACTIVITY_STS_TPM_DISABLED = 1;

    public static final int VALUE_T_S_C_ACTIVE_NOT_ACTIVE = 0;
    public static final int VALUE_T_S_C_ACTIVE_ACTIVE     = 1;

    public static final int VALUE_TX_FAULT_OK  = 0;
    public static final int VALUE_TX_FAULT_TPF = 1;
    public static final int VALUE_TX_FAULT_SNA = 3;

    public static final int VALUE_WAKE_RSN_NETWORK         = 0;
    public static final int VALUE_WAKE_RSN_CAN_C           = 1;
    public static final int VALUE_WAKE_RSN_CAN_I           = 2;
    public static final int VALUE_WAKE_RSN_LIN_ONE         = 3;
    public static final int VALUE_WAKE_RSN_LIN_TWO         = 4;
    public static final int VALUE_WAKE_RSN_LIN_THREE       = 5;
    public static final int VALUE_WAKE_RSN_DRV_AJAR        = 6;
    public static final int VALUE_WAKE_RSN_PSG_AJAR        = 7;
    public static final int VALUE_WAKE_RSN_L_R_AJAR        = 8;
    public static final int VALUE_WAKE_RSN_R_R_AJAR        = 9;
    public static final int VALUE_WAKE_RSN_TLG_AJAR        = 10;
    public static final int VALUE_WAKE_RSN_FG_AJAR         = 11;
    public static final int VALUE_WAKE_RSN_HOOD_AJAR       = 12;
    public static final int VALUE_WAKE_RSN_HRD_TOP_STEALTH = 13;
    public static final int VALUE_WAKE_RSN_TK_FG_SW        = 14;
    public static final int VALUE_WAKE_RSN_DRV_LK_SW       = 15;
    public static final int VALUE_WAKE_RSN_PASS_LK_SW      = 16;
    public static final int VALUE_WAKE_RSN_HAZARD_SW       = 17;
    public static final int VALUE_WAKE_RSN_SS_SW           = 18;
    public static final int VALUE_WAKE_RSN_BRK_SW          = 19;
    public static final int VALUE_WAKE_RSN_HL_SW           = 20;
    public static final int VALUE_WAKE_RSN_PD_SW           = 21;
    public static final int VALUE_WAKE_RSN_CARGO_SW        = 22;
    public static final int VALUE_WAKE_RSN_CON_LAMP_LD     = 23;
    public static final int VALUE_WAKE_RSN_REFUEL          = 24;
    public static final int VALUE_WAKE_RSN_ELCM            = 25;
    public static final int VALUE_WAKE_RSN_SNA             = 255;

    public static final int VALUE_WINDSHIELD_FLUID_STAT_OFF   = 0;
    public static final int VALUE_WINDSHIELD_FLUID_STAT_CONST = 1;
    public static final int VALUE_WINDSHIELD_FLUID_STAT_BLINK = 2;
    public static final int VALUE_WINDSHIELD_FLUID_STAT_SNA   = 3;

    public static final int VALUE_WIRELESS_PAD_STS_NO_CHARGING     = 0;
    public static final int VALUE_WIRELESS_PAD_STS_CHARGING        = 1;
    public static final int VALUE_WIRELESS_PAD_STS_FAIL_PRESENT    = 2;
    public static final int VALUE_WIRELESS_PAD_STS_PHONE_CHARGED   = 3;
    public static final int VALUE_WIRELESS_PAD_STS_PHONE_DETECTION = 4;
    public static final int VALUE_WIRELESS_PAD_STS_SEARCHING       = 5;
    public static final int VALUE_WIRELESS_PAD_STS_FOREING_DETECT  = 6;

    public static final int VALUE_WTRFUELINDLMP_ON_RQ_WATER_NOT_PRESENT = 0;
    public static final int VALUE_WTRFUELINDLMP_ON_RQ_WATER_PRESENT     = 1;

    /**
     * Request the ADS_MODE_REQ of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetADS_MODE_REQFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setADS_MODE_REQ(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ADS_SrvSys from the vehicle.
     * @base ATLH - WL
     * @return VALUE_ADS_SRVSYS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getADS_SrvSys() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ADS_SrvSys.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerADS_SrvSysChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ADS_SrvSys.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterADS_SrvSysChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the ASRActive from the vehicle.
     * @base ATL - MP
     * @return VALUE_A_S_R_ACTIVE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getASRActive() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ASRActive.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerASRActiveChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ASRActive.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterASRActiveChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the AvgFuelLevel from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getAvgFuelLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AvgFuelLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerAvgFuelLevelChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AvgFuelLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterAvgFuelLevelChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the Battery from the vehicle.
     * @base PN - RUPHEV
     * @return Volts
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getBattery() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Battery.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerBatteryChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Battery.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterBatteryChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the BrakePedal from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_BRAKE_PEDAL
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getBrakePedal() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BrakePedal.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerBrakePedalChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BrakePedal.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterBrakePedalChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the BrkTrq from the vehicle.
     * @base PN - RUPHEV
     * @return Nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getBrkTrq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BrkTrq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerBrkTrqChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BrkTrq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterBrkTrqChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the COOLENT_LEVEL_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COOLENT_LEVEL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getCOOLENT_LEVEL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to COOLENT_LEVEL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerCOOLENT_LEVEL_STATChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to COOLENT_LEVEL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterCOOLENT_LEVEL_STATChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the CustKeyInIgn from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_CUST_KEY_IN_IGN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getCustKeyInIgn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CustKeyInIgn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerCustKeyInIgnChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CustKeyInIgn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterCustKeyInIgnChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the DaysToService from the vehicle.
     * @base PN - MASPN
     * @return Day
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getDaysToService() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DaysToService.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerDaysToServiceChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DaysToService.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterDaysToServiceChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the DistanceToService from the vehicle.
     * @base ATL - MP
     * @return km or mi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getDistanceToService() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DistanceToService.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerDistanceToServiceChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DistanceToService.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterDistanceToServiceChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the DriverPowerReq from the vehicle.
     * @base ATL - MP
     * @return KW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getDriverPowerReq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DriverPowerReq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerDriverPowerReqChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DriverPowerReq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterDriverPowerReqChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the EcoIndexOnIPC of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEcoIndexOnIPCFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setEcoIndexOnIPC(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ELDActive from the vehicle.
     * @base ATL - MP
     * @return VALUE_E_L_D_ACTIVE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getELDActive() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ELDActive.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerELDActiveChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ELDActive.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterELDActiveChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the ElecClntHtrInletTemp from the vehicle.
     * @base PN - RUPHEV
     * @return C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getElecClntHtrInletTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ElecClntHtrInletTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerElecClntHtrInletTempChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ElecClntHtrInletTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterElecClntHtrInletTempChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the ElecCoolantHtrPwr from the vehicle.
     * @base PN - RUPHEV
     * @return kW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    float getElecCoolantHtrPwr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ElecCoolantHtrPwr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerElecCoolantHtrPwrChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ElecCoolantHtrPwr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterElecCoolantHtrPwrChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the Eng_DrvMdRq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEng_DrvMdRqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setEng_DrvMdRq(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the EngCoolTemp from the vehicle.
     * @base PN - RUPHEV
     * @return °C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getEngCoolTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngCoolTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerEngCoolTempChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngCoolTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterEngCoolTempChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the EngineOilLevel from the vehicle.
     * @base Alfa
     * @return VALUE_ENGINE_OIL_LEVEL
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getEngineOilLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineOilLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerEngineOilLevelChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineOilLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterEngineOilLevelChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the EngineOilMin from the vehicle.
     * @base Alfa
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getEngineOilMin() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineOilMin.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerEngineOilMinChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineOilMin.
     * @param callback
     * @return boolean value to determine success
     */
    boolean unregisterEngineOilMinChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the EngineOilOverfill from the vehicle.
     * @base Alfa
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getEngineOilOverfill() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineOilOverfill.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerEngineOilOverfillChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineOilOverfill.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterEngineOilOverfillChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the EngineOilTemp from the vehicle.
     * @base PN - RUPHEV
     * @return °C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getEngineOilTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineOilTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerEngineOilTempChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineOilTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterEngineOilTempChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the EngRun_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ENGRUN_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getEngRun_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngRun_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerEngRun_StatChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngRun_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterEngRun_StatChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the EPS_MODE_REQ of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEPS_MODE_REQFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setEPS_MODE_REQ(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ErrSys_7 from the vehicle.
     * @base WD Only
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getErrSys_7() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ErrSys_7.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerErrSys_7Change(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ErrSys_7.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterErrSys_7Change(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the ESC_Sft_btn_status of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetESC_Sft_btn_statusFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setESC_Sft_btn_status(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ExhaustTemperature from the vehicle.
     * @base ATL - MP
     * @return C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getExhaustTemperature() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ExhaustTemperature.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerExhaustTemperatureChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ExhaustTemperature.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterExhaustTemperatureChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the ExternalLightSensorLevel from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getExternalLightSensorLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ExternalLightSensorLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerExternalLightSensorLevelChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ExternalLightSensorLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterExternalLightSensorLevelChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the FRfShVlvSts from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getFRfShVlvSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FRfShVlvSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerFRfShVlvStsChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FRfShVlvSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterFRfShVlvStsChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the FuelCons from the vehicle.
     * @base PN - RUPHEV
     * @return µl/100ms
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getFuelCons() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FuelCons.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerFuelConsChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FuelCons.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterFuelConsChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the FuelType from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_FUEL_TYPE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getFuelType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FuelType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerFuelTypeChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FuelType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterFuelTypeChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the GF_Charge from the vehicle.
     * @base PN - RUPHEV
     * @return mg/cycle/cyl
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getGF_Charge() throws PropertyNotSupported;

    /**
     * Registers listening to changes to GF_Charge.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerGF_ChargeChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to GF_Charge.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterGF_ChargeChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HDCAutoDisabled from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_AUTO_DISABLED
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHDCAutoDisabled() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCAutoDisabled.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHDCAutoDisabledChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCAutoDisabled.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHDCAutoDisabledChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HDCAutoDisabledBrakes from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_AUTO_DISABLED_BRAKES
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHDCAutoDisabledBrakes() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCAutoDisabledBrakes.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHDCAutoDisabledBrakesChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCAutoDisabledBrakes.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHDCAutoDisabledBrakesChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HDCDisabled from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_DISABLED
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHDCDisabled() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCDisabled.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHDCDisabledChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCDisabled.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHDCDisabledChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HDCEnabled from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_ENABLED
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHDCEnabled() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCEnabled.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHDCEnabledChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCEnabled.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHDCEnabledChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HDCIntervention from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_INTERVENTION
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHDCIntervention() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCIntervention.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHDCInterventionChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCIntervention.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHDCInterventionChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HDCUnavailable4WDlow from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_UNAVAILABLE4_W_DLOW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHDCUnavailable4WDlow() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCUnavailable4WDlow.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHDCUnavailable4WDlowChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCUnavailable4WDlow.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHDCUnavailable4WDlowChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the HP_MODE_SEL of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetHP_MODE_SELFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setHP_MODE_SEL(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the HP_MODE_STS from the vehicle.
     * @base WD Only
     * @return VALUE_HP_MODE_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHP_MODE_STS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HP_MODE_STS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHP_MODE_STSChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HP_MODE_STS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHP_MODE_STSChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HTAuxPmpMontrngRPM from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHTAuxPmpMontrngRPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HTAuxPmpMontrngRPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHTAuxPmpMontrngRPMChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HTAuxPmpMontrngRPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHTAuxPmpMontrngRPMChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HTAuxPmpRPMAct from the vehicle.
     * @base PN - RUPHEV
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHTAuxPmpRPMAct() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HTAuxPmpRPMAct.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHTAuxPmpRPMActChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HTAuxPmpRPMAct.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHTAuxPmpRPMActChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HTCabVlvPosn from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHTCabVlvPosn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HTCabVlvPosn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHTCabVlvPosnChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HTCabVlvPosn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHTCabVlvPosnChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the HTShtOffVlvReq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_H_T_SHT_OFF_VLV_REQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getHTShtOffVlvReq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HTShtOffVlvReq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerHTShtOffVlvReqChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HTShtOffVlvReq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterHTShtOffVlvReqChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IBS_I_BATT from the vehicle.
     * @base PN - RUPHEV
     * @return I_RANGE res.
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getIBS_I_BATT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IBS_I_BATT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIBS_I_BATTChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IBS_I_BATT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIBS_I_BATTChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IBS_SOC from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getIBS_SOC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IBS_SOC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIBS_SOCChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IBS_SOC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIBS_SOCChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IBS_T_BATT from the vehicle.
     * @base PN - RUPHEV
     * @return °C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getIBS_T_BATT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IBS_T_BATT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIBS_T_BATTChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IBS_T_BATT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIBS_T_BATTChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IBS_V_BATT from the vehicle.
     * @base PN - RUPHEV
     * @return Volts
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getIBS_V_BATT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IBS_V_BATT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIBS_V_BATTChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IBS_V_BATT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIBS_V_BATTChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IGN_OFF_TIME_LNG from the vehicle.
     * @base PN - RUPHEV
     * @return min
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getIGN_OFF_TIME_LNG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IGN_OFF_TIME_LNG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIGN_OFF_TIME_LNGChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IGN_OFF_TIME_LNG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIGN_OFF_TIME_LNGChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IgnPos from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_IGN_POS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getIgnPos() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IgnPos.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIgnPosChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IgnPos.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIgnPosChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IntkAirTemp from the vehicle.
     * @base PN - RUPHEV
     * @return °C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getIntkAirTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IntkAirTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerIntkAirTempChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IntkAirTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterIntkAirTempChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the IsolationResistance from the vehicle.
     * @base PN - RUPHEV
     * @return kOhm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getIsolationResistance() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IsolationResistance.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerIsolationResistanceChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IsolationResistance.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterIsolationResistanceChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the Launch_Sft_Btn_status of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetLaunch_Sft_Btn_statusFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setLaunch_Sft_Btn_status(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the LOBEAM_ON from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getLOBEAM_ON() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LOBEAM_ON.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerLOBEAM_ONChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LOBEAM_ON.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterLOBEAM_ONChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the LT_EXH_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getLT_EXH_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LT_EXH_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerLT_EXH_STATChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LT_EXH_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterLT_EXH_STATChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the LTR_CoolantTemp from the vehicle.
     * @base WD Only
     * @return C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getLTR_CoolantTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LTR_CoolantTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerLTR_CoolantTempChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LTR_CoolantTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterLTR_CoolantTempChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the MAP_ENG from the vehicle.
     * @base PN - RUPHEV
     * @return kPa
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getMAP_ENG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MAP_ENG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerMAP_ENGChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MAP_ENG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterMAP_ENGChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the MdsAct from the vehicle.
     * @base PN -WD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getMdsAct() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MdsAct.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerMdsActChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MdsAct.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterMdsActChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the MemRq_FobNum from the vehicle.
     * @base ATL - BEV
     * @return VALUE_MEMRQ_FOBNUM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getMemRq_FobNum() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MemRq_FobNum.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerMemRq_FobNumChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MemRq_FobNum.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterMemRq_FobNumChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the MRM_Status from the vehicle.
     * @base ATL NA WL
     * @return VALUE_MRM_STATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getMRM_Status() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MRM_Status.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerMRM_StatusChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MRM_Status.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterMRM_StatusChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the MRM_Status_C2 from the vehicle.
     * @base ATL NA WL
     * @return VALUE_MRM_STATUS_C2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getMRM_Status_C2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MRM_Status_C2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerMRM_Status_C2Change(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MRM_Status_C2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterMRM_Status_C2Change(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the MtrPwrUsageDisp from the vehicle.
     * @base ATL - BEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getMtrPwrUsageDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MtrPwrUsageDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerMtrPwrUsageDispChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MtrPwrUsageDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterMtrPwrUsageDispChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the NAT_GAS_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getNAT_GAS_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to NAT_GAS_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerNAT_GAS_STATChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to NAT_GAS_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterNAT_GAS_STATChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the Odometer from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getOdometer() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Odometer.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerOdometerChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Odometer.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterOdometerChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the OIL_PRESS from the vehicle.
     * @base PN - RUPHEV
     * @return kPaG
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getOIL_PRESS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OIL_PRESS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerOIL_PRESSChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OIL_PRESS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterOIL_PRESSChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the OilLifeLeft from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getOilLifeLeft() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OilLifeLeft.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerOilLifeLeftChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OilLifeLeft.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterOilLifeLeftChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the OperationalModeSts from the vehicle.
     * @base BEV MP
     * @return VALUE_OPERATIONAL_MODE_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getOperationalModeSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OperationalModeSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerOperationalModeStsChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OperationalModeSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterOperationalModeStsChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the PowerMode from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_POWER_MODE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getPowerMode() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PowerMode.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerPowerModeChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PowerMode.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterPowerModeChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the PowertrainPrplsnActv from the vehicle.
     * @base ATL - BEV
     * @return VALUE_POWERTRAIN_PRPLSN_ACTV
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getPowertrainPrplsnActv() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PowertrainPrplsnActv.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerPowertrainPrplsnActvChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PowertrainPrplsnActv.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterPowertrainPrplsnActvChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the RAD_FAN1_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getRAD_FAN1_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RAD_FAN1_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerRAD_FAN1_STATChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RAD_FAN1_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterRAD_FAN1_STATChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the RemoteStart from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getRemoteStart() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RemoteStart.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerRemoteStartChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RemoteStart.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterRemoteStartChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the RemSt_Inhibit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_REMST_INHIBIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getRemSt_Inhibit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RemSt_Inhibit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerRemSt_InhibitChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RemSt_Inhibit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterRemSt_InhibitChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the ShiftInProgress from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SHIFT_IN_PROGRESS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getShiftInProgress() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ShiftInProgress.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerShiftInProgressChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ShiftInProgress.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterShiftInProgressChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the Speedometer from the vehicle.
     * @base PN - RUPHEV
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    float getSpeedometer() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Speedometer.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerSpeedometerChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Speedometer.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterSpeedometerChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the SwayBar_Sts from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SWAYBAR_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getSwayBar_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SwayBar_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerSwayBar_StsChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SwayBar_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterSwayBar_StsChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the SwayBarEVICDisplay from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SWAY_BAR_E_V_I_C_DISPLAY
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getSwayBarEVICDisplay() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SwayBarEVICDisplay.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerSwayBarEVICDisplayChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SwayBarEVICDisplay.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterSwayBarEVICDisplayChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Request the Telematic_Power of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetTelematic_PowerFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_WRITE_HIGH
     */
    void setTelematic_Power(int value, FcaIVehicleStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the TPMActivitySts from the vehicle.
     * @base ATL - MP
     * @return VALUE_T_P_M_ACTIVITY_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getTPMActivitySts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TPMActivitySts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerTPMActivityStsChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TPMActivitySts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterTPMActivityStsChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the TSCActive from the vehicle.
     * @base ATL - MP
     * @return VALUE_T_S_C_ACTIVE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getTSCActive() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TSCActive.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerTSCActiveChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TSCActive.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterTSCActiveChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the TX_FAULT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TX_FAULT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getTX_FAULT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TX_FAULT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerTX_FAULTChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TX_FAULT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterTX_FAULTChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the TX_TEMP from the vehicle.
     * @base PN - RUPHEV
     * @return °C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getTX_TEMP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TX_TEMP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerTX_TEMPChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TX_TEMP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterTX_TEMPChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the VehSpd_MPH from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getVehSpd_MPH() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehSpd_MPH.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerVehSpd_MPHChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehSpd_MPH.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterVehSpd_MPHChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the WakeRsn from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_WAKE_RSN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getWakeRsn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WakeRsn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerWakeRsnChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WakeRsn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean unregisterWakeRsnChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the Windshield_Fluid_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_WINDSHIELD_FLUID_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getWindshield_Fluid_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Windshield_Fluid_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerWindshield_Fluid_StatChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Windshield_Fluid_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterWindshield_Fluid_StatChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the WirelessPadSts from the vehicle.
     * @base Alfa
     * @return VALUE_WIRELESS_PAD_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    int getWirelessPadSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WirelessPadSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean registerWirelessPadStsChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WirelessPadSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterWirelessPadStsChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Gets the WtrFuelIndLmp_On_Rq from the vehicle.
     * @base ATL - MP
     * @return VALUE_WTRFUELINDLMP_ON_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    int getWtrFuelIndLmp_On_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WtrFuelIndLmp_On_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_HIGH
     */
    boolean registerWtrFuelIndLmp_On_RqChange(FcaIVehicleStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WtrFuelIndLmp_On_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHSTATUS_READ_LOW
     */
    boolean unregisterWtrFuelIndLmp_On_RqChange(FcaIVehicleStatusManagerCallback callback);

    /**
     * Callback interface to register IVehicleStatusManager against.
     */
    public interface FcaIVehicleStatusManagerCallback {
        default void onSetADS_MODE_REQFailed() { }
        default void onADS_SrvSysChange(int value) { }
        default void onASRActiveChange(int value) { }
        default void onAvgFuelLevelChange(int value) { }
        default void onBatteryChange(float value) { }
        default void onBrakePedalChange(int value) { }
        default void onBrkTrqChange(int value) { }
        default void onCOOLENT_LEVEL_STATChange(int value) { }
        default void onCustKeyInIgnChange(int value) { }
        default void onDaysToServiceChange(int value) { }
        default void onDistanceToServiceChange(int value) { }
        default void onDriverPowerReqChange(float value) { }
        default void onSetEcoIndexOnIPCFailed() { }
        default void onELDActiveChange(int value) { }
        default void onElecClntHtrInletTempChange(int value) { }
        default void onElecCoolantHtrPwrChange(float value) { }
        default void onSetEng_DrvMdRqFailed() { }
        default void onEngCoolTempChange(int value) { }
        default void onEngineOilLevelChange(int value) { }
        default void onEngineOilMinChange(int value) { }
        default void onEngineOilOverfillChange(int value) { }
        default void onEngineOilTempChange(int value) { }
        default void onEngRun_StatChange(int value) { }
        default void onSetEPS_MODE_REQFailed() { }
        default void onErrSys_7Change(int value) { }
        default void onSetESC_Sft_btn_statusFailed() { }
        default void onExhaustTemperatureChange(int value) { }
        default void onExternalLightSensorLevelChange(int value) { }
        default void onFRfShVlvStsChange(int value) { }
        default void onFuelConsChange(float value) { }
        default void onFuelTypeChange(int value) { }
        default void onGF_ChargeChange(float value) { }
        default void onHDCAutoDisabledChange(int value) { }
        default void onHDCAutoDisabledBrakesChange(int value) { }
        default void onHDCDisabledChange(int value) { }
        default void onHDCEnabledChange(int value) { }
        default void onHDCInterventionChange(int value) { }
        default void onHDCUnavailable4WDlowChange(int value) { }
        default void onSetHP_MODE_SELFailed() { }
        default void onHP_MODE_STSChange(int value) { }
        default void onHTAuxPmpMontrngRPMChange(int value) { }
        default void onHTAuxPmpRPMActChange(int value) { }
        default void onHTCabVlvPosnChange(int value) { }
        default void onHTShtOffVlvReqChange(int value) { }
        default void onIBS_I_BATTChange(int value) { }
        default void onIBS_SOCChange(int value) { }
        default void onIBS_T_BATTChange(int value) { }
        default void onIBS_V_BATTChange(float value) { }
        default void onIGN_OFF_TIME_LNGChange(int value) { }
        default void onIgnPosChange(int value) { }
        default void onIntkAirTempChange(int value) { }
        default void onIsolationResistanceChange(int value) { }
        default void onSetLaunch_Sft_Btn_statusFailed() { }
        default void onLOBEAM_ONChange(int value) { }
        default void onLT_EXH_STATChange(int value) { }
        default void onLTR_CoolantTempChange(int value) { }
        default void onMAP_ENGChange(float value) { }
        default void onMdsActChange(int value) { }
        default void onMemRq_FobNumChange(int value) { }
        default void onMRM_StatusChange(int value) { }
        default void onMRM_Status_C2Change(int value) { }
        default void onMtrPwrUsageDispChange(float value) { }
        default void onNAT_GAS_STATChange(float value) { }
        default void onOdometerChange(int value) { }
        default void onOIL_PRESSChange(int value) { }
        default void onOilLifeLeftChange(int value) { }
        default void onOperationalModeStsChange(int value) { }
        default void onPowerModeChange(int value) { }
        default void onPowertrainPrplsnActvChange(int value) { }
        default void onRAD_FAN1_STATChange(int value) { }
        default void onRemoteStartChange(int value) { }
        default void onRemSt_InhibitChange(int value) { }
        default void onShiftInProgressChange(int value) { }
        default void onSpeedometerChange(float value) { }
        default void onSwayBar_StsChange(int value) { }
        default void onSwayBarEVICDisplayChange(int value) { }
        default void onSetTelematic_PowerFailed() { }
        default void onTPMActivityStsChange(int value) { }
        default void onTSCActiveChange(int value) { }
        default void onTX_FAULTChange(int value) { }
        default void onTX_TEMPChange(int value) { }
        default void onVehSpd_MPHChange(int value) { }
        default void onWakeRsnChange(int value) { }
        default void onWindshield_Fluid_StatChange(int value) { }
        default void onWirelessPadStsChange(int value) { }
        default void onWtrFuelIndLmp_On_RqChange(int value) { }
    }
}
