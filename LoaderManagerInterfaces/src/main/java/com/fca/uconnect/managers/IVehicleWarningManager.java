package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleWarningManager
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
public interface IVehicleWarningManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_ABS_IND_STAT_OFF   = 0;
    public static final int VALUE_ABS_IND_STAT_CONT  = 1;
    public static final int VALUE_ABS_IND_STAT_BLINK = 2;
    public static final int VALUE_ABS_IND_STAT_SNA   = 3;

    public static final int VALUE_ABS_INDLMP_ON_RQ_OFF   = 0;
    public static final int VALUE_ABS_INDLMP_ON_RQ_CONT  = 1;
    public static final int VALUE_ABS_INDLMP_ON_RQ_BLINK = 2;
    public static final int VALUE_ABS_INDLMP_ON_RQ_SNA   = 3;

    public static final int VALUE_AC_STAT_OFF   = 0;
    public static final int VALUE_AC_STAT_CONT  = 1;
    public static final int VALUE_AC_STAT_BLINK = 2;
    public static final int VALUE_AC_STAT_SNA   = 3;

    public static final int VALUE_ACC_WARN_STAT_OFF   = 0;
    public static final int VALUE_ACC_WARN_STAT_CONT  = 1;
    public static final int VALUE_ACC_WARN_STAT_BLINK = 2;
    public static final int VALUE_ACC_WARN_STAT_SNA   = 3;

    public static final int VALUE_ADBLUE_FL_LVL_NO_WARNING     = 0;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_1 = 1;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_2 = 2;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_3 = 3;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_4 = 4;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_5 = 5;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_6 = 6;
    public static final int VALUE_ADBLUE_FL_LVL_WARNINGLEVEL_7 = 7;
    public static final int VALUE_ADBLUE_FL_LVL_SNA            = 15;

    public static final int VALUE_ADBLUE_STAT_NO_WARNING     = 0;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_1 = 1;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_2 = 2;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_3 = 3;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_4 = 4;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_5 = 5;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_6 = 6;
    public static final int VALUE_ADBLUE_STAT_WARNINGLEVEL_7 = 7;
    public static final int VALUE_ADBLUE_STAT_SNA            = 15;

    public static final int VALUE_AIR_BAG_STAT_OFF   = 0;
    public static final int VALUE_AIR_BAG_STAT_ON    = 1;
    public static final int VALUE_AIR_BAG_STAT_BLINK = 2;
    public static final int VALUE_AIR_BAG_STAT_SNA   = 3;

    public static final int VALUE_AIRBAG_IND_LAMP_OFF   = 0;
    public static final int VALUE_AIRBAG_IND_LAMP_CONT  = 1;
    public static final int VALUE_AIRBAG_IND_LAMP_BLINK = 2;
    public static final int VALUE_AIRBAG_IND_LAMP_SNA   = 3;

    public static final int VALUE_AUTOMATIC_OIL_CHANGE_NORMAL_OIL_PROPERTIES = 0;
    public static final int VALUE_AUTOMATIC_OIL_CHANGE_OIL_LIFE_RESET        = 1;
    public static final int VALUE_AUTOMATIC_OIL_CHANGE_CHANGE_OIL_REQUIRED   = 2;
    public static final int VALUE_AUTOMATIC_OIL_CHANGE_NOT_USED              = 3;

    public static final int VALUE_AWD_SERVICE_STAT_OFF   = 0;
    public static final int VALUE_AWD_SERVICE_STAT_CONT  = 1;
    public static final int VALUE_AWD_SERVICE_STAT_BLINK = 2;
    public static final int VALUE_AWD_SERVICE_STAT_SNA   = 3;

    public static final int VALUE_BRAKE_PAD_STAT_OFF   = 0;
    public static final int VALUE_BRAKE_PAD_STAT_CONT  = 1;
    public static final int VALUE_BRAKE_PAD_STAT_BLINK = 2;
    public static final int VALUE_BRAKE_PAD_STAT_SNA   = 3;

    public static final int VALUE_BRAKE_INDICATION_LAMP_STATUS_OFF   = 0;
    public static final int VALUE_BRAKE_INDICATION_LAMP_STATUS_CONT  = 1;
    public static final int VALUE_BRAKE_INDICATION_LAMP_STATUS_BLINK = 2;
    public static final int VALUE_BRAKE_INDICATION_LAMP_STATUS_SNA   = 3;

    public static final int VALUE_BRK_IND_STAT_OFF   = 0;
    public static final int VALUE_BRK_IND_STAT_CONT  = 1;
    public static final int VALUE_BRK_IND_STAT_BLINK = 2;
    public static final int VALUE_BRK_IND_STAT_SNA   = 3;

    public static final int VALUE_CARGO_LT_STAT_OFF   = 0;
    public static final int VALUE_CARGO_LT_STAT_CONT  = 1;
    public static final int VALUE_CARGO_LT_STAT_BLINK = 2;
    public static final int VALUE_CARGO_LT_STAT_SNA   = 3;

    public static final int VALUE_CATALYST_TEMP_STAT_OFF   = 0;
    public static final int VALUE_CATALYST_TEMP_STAT_CONT  = 1;
    public static final int VALUE_CATALYST_TEMP_STAT_BLINK = 2;
    public static final int VALUE_CATALYST_TEMP_STAT_SNA   = 3;

    public static final int VALUE_CRUISE_SET_STAT_OFF   = 0;
    public static final int VALUE_CRUISE_SET_STAT_CONT  = 1;
    public static final int VALUE_CRUISE_SET_STAT_BLINK = 2;
    public static final int VALUE_CRUISE_SET_STAT_SNA   = 3;

    public static final int VALUE_DAMPING_SYSTEM_STAT_OFF   = 0;
    public static final int VALUE_DAMPING_SYSTEM_STAT_CONT  = 1;
    public static final int VALUE_DAMPING_SYSTEM_STAT_BLINK = 2;
    public static final int VALUE_DAMPING_SYSTEM_STAT_SNA   = 3;

    public static final int VALUE_DEF_STAT_OFF   = 0;
    public static final int VALUE_DEF_STAT_CONT  = 1;
    public static final int VALUE_DEF_STAT_BLINK = 2;
    public static final int VALUE_DEF_STAT_SNA   = 3;

    public static final int VALUE_DPF_DEF_WARNING_STATUS_CLEAN = 0;
    public static final int VALUE_DPF_DEF_WARNING_STATUS_DIRTY = 1;

    public static final int VALUE_DRIVER_BELT_DRV_SEATBELT_OK  = 0;
    public static final int VALUE_DRIVER_BELT_DRV_SEATBELT_NOK = 1;
    public static final int VALUE_DRIVER_BELT_SEATBELT_FAIL    = 2;
    public static final int VALUE_DRIVER_BELT_SNA              = 3;

    public static final int VALUE_E_MODE_STS_ECO_OFF     = 0;
    public static final int VALUE_E_MODE_STS_ECO_ON      = 1;
    public static final int VALUE_E_MODE_STS_ECO_UNAVAIL = 2;
    public static final int VALUE_E_MODE_STS_SNA         = 3;

    public static final int VALUE_EBL_STAT_OFF   = 0;
    public static final int VALUE_EBL_STAT_CONT  = 1;
    public static final int VALUE_EBL_STAT_BLINK = 2;
    public static final int VALUE_EBL_STAT_SNA   = 3;

    public static final int VALUE_EC_MIRRSTAT_OFF = 0;
    public static final int VALUE_EC_MIRRSTAT_ON  = 1;
    public static final int VALUE_EC_MIRRSTAT_DNA = 2;
    public static final int VALUE_EC_MIRRSTAT_SNA = 3;

    public static final int VALUE_ECO_MODE_STAT_OFF   = 0;
    public static final int VALUE_ECO_MODE_STAT_CONT  = 1;
    public static final int VALUE_ECO_MODE_STAT_BLINK = 2;
    public static final int VALUE_ECO_MODE_STAT_SNA   = 3;

    public static final int VALUE_ELEC_STAB_STAT_OFF   = 0;
    public static final int VALUE_ELEC_STAB_STAT_CONT  = 1;
    public static final int VALUE_ELEC_STAB_STAT_BLINK = 2;
    public static final int VALUE_ELEC_STAB_STAT_SNA   = 3;

    public static final int VALUE_ELECTRIC_WRENCH_STAT_OFF   = 0;
    public static final int VALUE_ELECTRIC_WRENCH_STAT_CONT  = 1;
    public static final int VALUE_ELECTRIC_WRENCH_STAT_BLINK = 2;
    public static final int VALUE_ELECTRIC_WRENCH_STAT_SNA   = 3;

    public static final int VALUE_ENGINE_MIL_STAT_OFF   = 0;
    public static final int VALUE_ENGINE_MIL_STAT_CONT  = 1;
    public static final int VALUE_ENGINE_MIL_STAT_BLINK = 2;
    public static final int VALUE_ENGINE_MIL_STAT_SNA   = 3;

    public static final int VALUE_ENGINE_TEMP_STAT_OFF   = 0;
    public static final int VALUE_ENGINE_TEMP_STAT_CONT  = 1;
    public static final int VALUE_ENGINE_TEMP_STAT_BLINK = 2;
    public static final int VALUE_ENGINE_TEMP_STAT_SNA   = 3;

    public static final int VALUE_ENGINE_OIL_OVER_TEMP_IND_LMP_OFF   = 0;
    public static final int VALUE_ENGINE_OIL_OVER_TEMP_IND_LMP_ON    = 1;
    public static final int VALUE_ENGINE_OIL_OVER_TEMP_IND_LMP_FLASH = 2;
    public static final int VALUE_ENGINE_OIL_OVER_TEMP_SNA           = 3;

    public static final int VALUE_EPB_WARN_STAT_OFF   = 0;
    public static final int VALUE_EPB_WARN_STAT_CONT  = 1;
    public static final int VALUE_EPB_WARN_STAT_BLINK = 2;
    public static final int VALUE_EPB_WARN_STAT_SNA   = 3;

    public static final int VALUE_EPS_STAT_OFF   = 0;
    public static final int VALUE_EPS_STAT_CONT  = 1;
    public static final int VALUE_EPS_STAT_BLINK = 2;
    public static final int VALUE_EPS_STAT_SNA   = 3;

    public static final int VALUE_EPS_WARN_DISP_RQ_OK      = 0;
    public static final int VALUE_EPS_WARN_DISP_RQ_ERR     = 1;
    public static final int VALUE_EPS_WARN_DISP_RQ_ERR2    = 2;
    public static final int VALUE_EPS_WARN_DISP_RQ_SERV_HI = 3;
    public static final int VALUE_EPS_WARN_DISP_RQ_SNA     = 7;

    public static final int VALUE_ESC_CTRLLMP_INFO_OFF   = 0;
    public static final int VALUE_ESC_CTRLLMP_INFO_CONT  = 1;
    public static final int VALUE_ESC_CTRLLMP_INFO_BLINK = 2;
    public static final int VALUE_ESC_CTRLLMP_INFO_SNA   = 3;

    public static final int VALUE_ETC_CONTROL_STAT_OFF   = 0;
    public static final int VALUE_ETC_CONTROL_STAT_CONT  = 1;
    public static final int VALUE_ETC_CONTROL_STAT_BLINK = 2;
    public static final int VALUE_ETC_CONTROL_STAT_SNA   = 3;

    public static final int VALUE_ETC_IND_LMP_OFF   = 0;
    public static final int VALUE_ETC_IND_LMP_CONT  = 1;
    public static final int VALUE_ETC_IND_LMP_BLINK = 2;
    public static final int VALUE_ETC_IND_LMP_SNA   = 3;

    public static final int VALUE_FCW_SYSTEM_STAT_OFF   = 0;
    public static final int VALUE_FCW_SYSTEM_STAT_CONT  = 1;
    public static final int VALUE_FCW_SYSTEM_STAT_BLINK = 2;
    public static final int VALUE_FCW_SYSTEM_STAT_SNA   = 3;

    public static final int VALUE_FOUR_WD_SERVICE_STAT_OFF   = 0;
    public static final int VALUE_FOUR_WD_SERVICE_STAT_CONT  = 1;
    public static final int VALUE_FOUR_WD_SERVICE_STAT_BLINK = 2;
    public static final int VALUE_FOUR_WD_SERVICE_STAT_SNA   = 3;

    public static final int VALUE_FUEL_CAP_STAT_OFF   = 0;
    public static final int VALUE_FUEL_CAP_STAT_CONT  = 1;
    public static final int VALUE_FUEL_CAP_STAT_BLINK = 2;
    public static final int VALUE_FUEL_CAP_STAT_SNA   = 3;

    public static final int VALUE_FUEL_CUT_OFF_STAT_OFF   = 0;
    public static final int VALUE_FUEL_CUT_OFF_STAT_CONT  = 1;
    public static final int VALUE_FUEL_CUT_OFF_STAT_BLINK = 2;
    public static final int VALUE_FUEL_CUT_OFF_STAT_SNA   = 3;

    public static final int VALUE_FUNCTION_LAMP_OFF   = 0;
    public static final int VALUE_FUNCTION_LAMP_CONT  = 1;
    public static final int VALUE_FUNCTION_LAMP_BLINK = 2;
    public static final int VALUE_FUNCTION_LAMP_SNA   = 3;

    public static final int VALUE_HDLT_LVL_STAT_OFF   = 0;
    public static final int VALUE_HDLT_LVL_STAT_CONT  = 1;
    public static final int VALUE_HDLT_LVL_STAT_BLINK = 2;
    public static final int VALUE_HDLT_LVL_STAT_SNA   = 3;

    public static final int VALUE_HEV_LMP_RQ_OFF   = 0;
    public static final int VALUE_HEV_LMP_RQ_CONT  = 1;
    public static final int VALUE_HEV_LMP_RQ_BLINK = 2;
    public static final int VALUE_HEV_LMP_RQ_SNA   = 3;

    public static final int VALUE_HI_BEAM_STAT_OFF   = 0;
    public static final int VALUE_HI_BEAM_STAT_CONT  = 1;
    public static final int VALUE_HI_BEAM_STAT_BLINK = 2;
    public static final int VALUE_HI_BEAM_STAT_SNA   = 3;

    public static final int VALUE_HVY_EXH_STAT_OFF   = 0;
    public static final int VALUE_HVY_EXH_STAT_CONT  = 1;
    public static final int VALUE_HVY_EXH_STAT_BLINK = 2;
    public static final int VALUE_HVY_EXH_STAT_SNA   = 3;

    public static final int VALUE_LANE_SENSE_STAT_OFF   = 0;
    public static final int VALUE_LANE_SENSE_STAT_CONT  = 1;
    public static final int VALUE_LANE_SENSE_STAT_BLINK = 2;
    public static final int VALUE_LANE_SENSE_STAT_SNA   = 3;

    public static final int VALUE_LDW_LEDCONTROLSTS_OFF   = 0;
    public static final int VALUE_LDW_LEDCONTROLSTS_CONT  = 1;
    public static final int VALUE_LDW_LEDCONTROLSTS_BLINK = 2;
    public static final int VALUE_LDW_LEDCONTROLSTS_SNA   = 3;

    public static final int VALUE_OIL_LEVEL_STAT_OFF   = 0;
    public static final int VALUE_OIL_LEVEL_STAT_CONT  = 1;
    public static final int VALUE_OIL_LEVEL_STAT_BLINK = 2;
    public static final int VALUE_OIL_LEVEL_STAT_SNA   = 3;

    public static final int VALUE_OIL_PRESSURE_STAT_OFF   = 0;
    public static final int VALUE_OIL_PRESSURE_STAT_CONT  = 1;
    public static final int VALUE_OIL_PRESSURE_STAT_BLINK = 2;
    public static final int VALUE_OIL_PRESSURE_STAT_SNA   = 3;

    public static final int VALUE_OIL_TEMP_STAT_OFF   = 0;
    public static final int VALUE_OIL_TEMP_STAT_CONT  = 1;
    public static final int VALUE_OIL_TEMP_STAT_BLINK = 2;
    public static final int VALUE_OIL_TEMP_STAT_SNA   = 3;

    public static final int VALUE_O_I_L_TEMP_CHIME_NONE   = 0;
    public static final int VALUE_O_I_L_TEMP_CHIME_SINGLE = 1;
    public static final int VALUE_O_I_L_TEMP_CHIME_SLOW   = 2;
    public static final int VALUE_O_I_L_TEMP_CHIME_FAST   = 3;

    public static final int VALUE_OVER_TEMP_STAT_OFF   = 0;
    public static final int VALUE_OVER_TEMP_STAT_CONT  = 1;
    public static final int VALUE_OVER_TEMP_STAT_BLINK = 2;
    public static final int VALUE_OVER_TEMP_STAT_SNA   = 3;

    public static final int VALUE_PASSENGER_B_E_L_T_PSG_SEATBELT_OK  = 0;
    public static final int VALUE_PASSENGER_B_E_L_T_PSG_SEATBELT_NOK = 1;
    public static final int VALUE_PASSENGER_B_E_L_T_SEATBELT_FAIL    = 2;
    public static final int VALUE_PASSENGER_B_E_L_T_SNA              = 3;

    public static final int VALUE_PPPA_STAT_OFF   = 0;
    public static final int VALUE_PPPA_STAT_CONT  = 1;
    public static final int VALUE_PPPA_STAT_BLINK = 2;
    public static final int VALUE_PPPA_STAT_SNA   = 3;

    public static final int VALUE_PTS_STAT_OFF   = 0;
    public static final int VALUE_PTS_STAT_CONT  = 1;
    public static final int VALUE_PTS_STAT_BLINK = 2;
    public static final int VALUE_PTS_STAT_SNA   = 3;

    public static final int VALUE_RECIRC_STAT_OFF   = 0;
    public static final int VALUE_RECIRC_STAT_CONT  = 1;
    public static final int VALUE_RECIRC_STAT_BLINK = 2;
    public static final int VALUE_RECIRC_STAT_SNA   = 3;

    public static final int VALUE_SELECT_SPEED_STATUS_OFF                       = 0;
    public static final int VALUE_SELECT_SPEED_STATUS_SELECT_SPEED_MODE         = 1;
    public static final int VALUE_SELECT_SPEED_STATUS_SELECT_SPEED_MODE_INHIBIT = 2;
    public static final int VALUE_SELECT_SPEED_STATUS_SNA                       = 3;

    public static final int VALUE_SEL_SPD_LMP_OFF   = 0;
    public static final int VALUE_SEL_SPD_LMP_CONT  = 1;
    public static final int VALUE_SEL_SPD_LMP_BLINK = 2;
    public static final int VALUE_SEL_SPD_LMP_SNA   = 3;

    public static final int VALUE_SERVICE_ACC_STAT_OFF   = 0;
    public static final int VALUE_SERVICE_ACC_STAT_CONT  = 1;
    public static final int VALUE_SERVICE_ACC_STAT_BLINK = 2;
    public static final int VALUE_SERVICE_ACC_STAT_SNA   = 3;

    public static final int VALUE_SERVICE_STAT_OFF   = 0;
    public static final int VALUE_SERVICE_STAT_CONT  = 1;
    public static final int VALUE_SERVICE_STAT_BLINK = 2;
    public static final int VALUE_SERVICE_STAT_SNA   = 3;

    public static final int VALUE_SP_ST_SW_STAT_OFF   = 0;
    public static final int VALUE_SP_ST_SW_STAT_CONT  = 1;
    public static final int VALUE_SP_ST_SW_STAT_BLINK = 2;
    public static final int VALUE_SP_ST_SW_STAT_SNA   = 3;

    public static final int VALUE_SRS_INDLMP_RQ_OFF   = 0;
    public static final int VALUE_SRS_INDLMP_RQ_CONT  = 1;
    public static final int VALUE_SRS_INDLMP_RQ_BLINK = 2;
    public static final int VALUE_SRS_INDLMP_RQ_SNA   = 3;

    public static final int VALUE_SRS_LMP_STAT_SRS_LMP_OFF   = 0;
    public static final int VALUE_SRS_LMP_STAT_SRS_LMP_ON    = 1;
    public static final int VALUE_SRS_LMP_STAT_SRS_LMP_ON_IC = 2;
    public static final int VALUE_SRS_LMP_STAT_SNA           = 3;

    public static final int VALUE_STOP_START_STAT_OFF   = 0;
    public static final int VALUE_STOP_START_STAT_CONT  = 1;
    public static final int VALUE_STOP_START_STAT_BLINK = 2;
    public static final int VALUE_STOP_START_STAT_SNA   = 3;

    public static final int VALUE_TCASE_LAMP_STATUS_OFF   = 0;
    public static final int VALUE_TCASE_LAMP_STATUS_CONT  = 1;
    public static final int VALUE_TCASE_LAMP_STATUS_BLINK = 2;
    public static final int VALUE_TCASE_LAMP_STATUS_SNA   = 3;

    public static final int VALUE_THEFT_ALARM_STAT_OFF   = 0;
    public static final int VALUE_THEFT_ALARM_STAT_CONT  = 1;
    public static final int VALUE_THEFT_ALARM_STAT_BLINK = 2;
    public static final int VALUE_THEFT_ALARM_STAT_SNA   = 3;

    public static final int VALUE_TIRE_PRESSURE_STAT_OFF   = 0;
    public static final int VALUE_TIRE_PRESSURE_STAT_CONT  = 1;
    public static final int VALUE_TIRE_PRESSURE_STAT_BLINK = 2;
    public static final int VALUE_TIRE_PRESSURE_STAT_SNA   = 3;

    public static final int VALUE_TORQUE_STAT_OFF   = 0;
    public static final int VALUE_TORQUE_STAT_CONT  = 1;
    public static final int VALUE_TORQUE_STAT_BLINK = 2;
    public static final int VALUE_TORQUE_STAT_SNA   = 3;

    public static final int VALUE_TOW_HAUL_STAT_OFF   = 0;
    public static final int VALUE_TOW_HAUL_STAT_CONT  = 1;
    public static final int VALUE_TOW_HAUL_STAT_BLINK = 2;
    public static final int VALUE_TOW_HAUL_STAT_SNA   = 3;

    public static final int VALUE_TPM_INDLMPONRQ_IND_LMP_OFF   = 0;
    public static final int VALUE_TPM_INDLMPONRQ_IND_LMP_ON    = 1;
    public static final int VALUE_TPM_INDLMPONRQ_IND_LMP_FLASH = 2;
    public static final int VALUE_TPM_INDLMPONRQ_SNA           = 3;

    public static final int VALUE_TX_WARN2_NONE    = 0;
    public static final int VALUE_TX_WARN2_WARN_1  = 1;
    public static final int VALUE_TX_WARN2_WARN_2  = 2;
    public static final int VALUE_TX_WARN2_WARN_3  = 3;
    public static final int VALUE_TX_WARN2_WARN_4  = 4;
    public static final int VALUE_TX_WARN2_WARN_5  = 5;
    public static final int VALUE_TX_WARN2_WARN_6  = 6;
    public static final int VALUE_TX_WARN2_WARN_7  = 7;
    public static final int VALUE_TX_WARN2_WARN_8  = 8;
    public static final int VALUE_TX_WARN2_WARN_9  = 9;
    public static final int VALUE_TX_WARN2_WARN_10 = 10;
    public static final int VALUE_TX_WARN2_WARN_11 = 11;
    public static final int VALUE_TX_WARN2_WARN_12 = 12;
    public static final int VALUE_TX_WARN2_WARN_13 = 13;
    public static final int VALUE_TX_WARN2_WARN_14 = 14;
    public static final int VALUE_TX_WARN2_WARN_15 = 15;
    public static final int VALUE_TX_WARN2_WARN_17 = 17;
    public static final int VALUE_TX_WARN2_WARN_18 = 18;
    public static final int VALUE_TX_WARN2_WARN_19 = 19;
    public static final int VALUE_TX_WARN2_WARN_20 = 20;
    public static final int VALUE_TX_WARN2_WARN_21 = 21;
    public static final int VALUE_TX_WARN2_WARN_22 = 22;
    public static final int VALUE_TX_WARN2_WARN_23 = 23;
    public static final int VALUE_TX_WARN2_WARN_24 = 24;
    public static final int VALUE_TX_WARN2_WARN_25 = 25;
    public static final int VALUE_TX_WARN2_WARN_31 = 31;
    public static final int VALUE_TX_WARN2_WARN_32 = 32;
    public static final int VALUE_TX_WARN2_WARN_33 = 33;
    public static final int VALUE_TX_WARN2_WARN_34 = 34;
    public static final int VALUE_TX_WARN2_WARN_35 = 35;
    public static final int VALUE_TX_WARN2_WARN_36 = 36;
    public static final int VALUE_TX_WARN2_WARN_37 = 37;
    public static final int VALUE_TX_WARN2_WARN_38 = 38;
    public static final int VALUE_TX_WARN2_WARN_39 = 39;
    public static final int VALUE_TX_WARN2_WARN_40 = 40;
    public static final int VALUE_TX_WARN2_WARN_41 = 41;
    public static final int VALUE_TX_WARN2_WARN_42 = 42;
    public static final int VALUE_TX_WARN2_WARN_43 = 43;
    public static final int VALUE_TX_WARN2_WARN_44 = 44;
    public static final int VALUE_TX_WARN2_WARN_45 = 45;
    public static final int VALUE_TX_WARN2_WARN_46 = 46;
    public static final int VALUE_TX_WARN2_WARN_47 = 47;
    public static final int VALUE_TX_WARN2_WARN_48 = 48;
    public static final int VALUE_TX_WARN2_WARN_49 = 49;
    public static final int VALUE_TX_WARN2_WARN_50 = 50;
    public static final int VALUE_TX_WARN2_WARN_51 = 51;
    public static final int VALUE_TX_WARN2_WARN_52 = 52;
    public static final int VALUE_TX_WARN2_WARN_53 = 53;
    public static final int VALUE_TX_WARN2_WARN_54 = 54;
    public static final int VALUE_TX_WARN2_WARN_55 = 55;
    public static final int VALUE_TX_WARN2_WARN_56 = 56;
    public static final int VALUE_TX_WARN2_WARN_57 = 57;
    public static final int VALUE_TX_WARN2_WARN_58 = 58;
    public static final int VALUE_TX_WARN2_WARN_59 = 59;
    public static final int VALUE_TX_WARN2_WARN_60 = 60;
    public static final int VALUE_TX_WARN2_WARN_61 = 61;
    public static final int VALUE_TX_WARN2_WARN_62 = 62;
    public static final int VALUE_TX_WARN2_WARN_63 = 63;
    public static final int VALUE_TX_WARN2_WARN_64 = 64;
    public static final int VALUE_TX_WARN2_WARN_65 = 65;
    public static final int VALUE_TX_WARN2_WARN_66 = 66;
    public static final int VALUE_TX_WARN2_WARN_67 = 67;
    public static final int VALUE_TX_WARN2_WARN_68 = 68;
    public static final int VALUE_TX_WARN2_WARN_69 = 69;
    public static final int VALUE_TX_WARN2_WARN_70 = 70;
    public static final int VALUE_TX_WARN2_WARN_71 = 71;
    public static final int VALUE_TX_WARN2_WARN_72 = 72;
    public static final int VALUE_TX_WARN2_SNA     = 255;

    public static final int VALUE_WATER_IN_FUEL_STAT_OFF   = 0;
    public static final int VALUE_WATER_IN_FUEL_STAT_CONT  = 1;
    public static final int VALUE_WATER_IN_FUEL_STAT_BLINK = 2;
    public static final int VALUE_WATER_IN_FUEL_STAT_SNA   = 3;

    /**
     * Gets the ABS_BrkEvt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getABS_BrkEvt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ABS_BrkEvt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerABS_BrkEvtChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ABS_BrkEvt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterABS_BrkEvtChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ABS_IND_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ABS_IND_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getABS_IND_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ABS_IND_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerABS_IND_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ABS_IND_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterABS_IND_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ABS_IndLmp_On_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ABS_INDLMP_ON_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getABS_IndLmp_On_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ABS_IndLmp_On_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerABS_IndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ABS_IndLmp_On_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterABS_IndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the AC_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_AC_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAC_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AC_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAC_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AC_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAC_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ACC_WARN_STAT from the vehicle.
     * @base ATL -MP
     * @return VALUE_ACC_WARN_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getACC_WARN_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ACC_WARN_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerACC_WARN_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ACC_WARN_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterACC_WARN_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Adblue_FL_LVL from the vehicle.
     * @base ATL - MP
     * @return VALUE_ADBLUE_FL_LVL
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAdblue_FL_LVL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Adblue_FL_LVL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAdblue_FL_LVLChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Adblue_FL_LVL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAdblue_FL_LVLChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Adblue_Stat from the vehicle.
     * @base ATL - MP
     * @return VALUE_ADBLUE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAdblue_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Adblue_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAdblue_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Adblue_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAdblue_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the AHBFault from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAHBFault() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AHBFault.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAHBFaultChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AHBFault.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAHBFaultChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the AIR_BAG_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_AIR_BAG_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAIR_BAG_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AIR_BAG_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAIR_BAG_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AIR_BAG_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAIR_BAG_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the AirbagIndLamp from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_AIRBAG_IND_LAMP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAirbagIndLamp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AirbagIndLamp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAirbagIndLampChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AirbagIndLamp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAirbagIndLampChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ASCM_Srv from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getASCM_Srv() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ASCM_Srv.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerASCM_SrvChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ASCM_Srv.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterASCM_SrvChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ASCM_SysFail from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getASCM_SysFail() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ASCM_SysFail.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerASCM_SysFailChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ASCM_SysFail.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterASCM_SysFailChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the AutomaticOilChange from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_AUTOMATIC_OIL_CHANGE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAutomaticOilChange() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AutomaticOilChange.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAutomaticOilChangeChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AutomaticOilChange.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAutomaticOilChangeChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the AWD_service_stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_AWD_SERVICE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getAWD_service_stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AWD_service_stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerAWD_service_statChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AWD_service_stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterAWD_service_statChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Batt_ST_Crit from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getBatt_ST_Crit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Batt_ST_Crit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerBatt_ST_CritChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Batt_ST_Crit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterBatt_ST_CritChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the BoostVacGauge from the vehicle.
     * @base ATL - MP
     * @return mbar
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getBoostVacGauge() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BoostVacGauge.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerBoostVacGaugeChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BoostVacGauge.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterBoostVacGaugeChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the BRAKE_PAD_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_BRAKE_PAD_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getBRAKE_PAD_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BRAKE_PAD_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerBRAKE_PAD_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BRAKE_PAD_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterBRAKE_PAD_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the BrakeIndicationLampStatus from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_BRAKE_INDICATION_LAMP_STATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getBrakeIndicationLampStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BrakeIndicationLampStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerBrakeIndicationLampStatusChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BrakeIndicationLampStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterBrakeIndicationLampStatusChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the BRK_IND_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_BRK_IND_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getBRK_IND_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BRK_IND_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerBRK_IND_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BRK_IND_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterBRK_IND_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the BrkPdl_Flt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getBrkPdl_Flt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BrkPdl_Flt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerBrkPdl_FltChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BrkPdl_Flt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterBrkPdl_FltChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the CARGO_LT_STAT from the vehicle.
     * @base ATL -MP
     * @return VALUE_CARGO_LT_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getCARGO_LT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CARGO_LT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerCARGO_LT_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CARGO_LT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterCARGO_LT_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the CATALYST_TEMP_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_CATALYST_TEMP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getCATALYST_TEMP_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CATALYST_TEMP_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerCATALYST_TEMP_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CATALYST_TEMP_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterCATALYST_TEMP_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ChrgSysFault from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getChrgSysFault() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ChrgSysFault.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerChrgSysFaultChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ChrgSysFault.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterChrgSysFaultChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the CHRGSystemFail from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getCHRGSystemFail() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CHRGSystemFail.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerCHRGSystemFailChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CHRGSystemFail.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterCHRGSystemFailChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Cruise_Lamp_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getCruise_Lamp_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Cruise_Lamp_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerCruise_Lamp_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Cruise_Lamp_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterCruise_Lamp_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the CRUISE_SET_STAT from the vehicle.
     * @base ATL -MP
     * @return VALUE_CRUISE_SET_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getCRUISE_SET_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CRUISE_SET_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerCRUISE_SET_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CRUISE_SET_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterCRUISE_SET_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Damping_system_stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_DAMPING_SYSTEM_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getDamping_system_stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Damping_system_stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerDamping_system_statChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Damping_system_stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterDamping_system_statChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Day_Night_Mode from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getDay_Night_Mode() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Day_Night_Mode.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerDay_Night_ModeChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Day_Night_Mode.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterDay_Night_ModeChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Def_stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_DEF_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getDef_stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Def_stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerDef_statChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Def_stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterDef_statChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the DpfDefWarningStatus from the vehicle.
     * @base ATL - MP
     * @return VALUE_DPF_DEF_WARNING_STATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getDpfDefWarningStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DpfDefWarningStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerDpfDefWarningStatusChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DpfDefWarningStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterDpfDefWarningStatusChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the DriverBelt from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_DRIVER_BELT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getDriverBelt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DriverBelt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerDriverBeltChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DriverBelt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterDriverBeltChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the DRV_AJAR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getDRV_AJAR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DRV_AJAR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerDRV_AJARChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DRV_AJAR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterDRV_AJARChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the E_Mode_Sts from the vehicle.
     * @base PNNAWD
     * @return VALUE_E_MODE_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getE_Mode_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to E_Mode_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerE_Mode_StsChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to E_Mode_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterE_Mode_StsChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EBL_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_EBL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEBL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EBL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEBL_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EBL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEBL_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EC_MirrStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_EC_MIRRSTAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEC_MirrStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EC_MirrStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEC_MirrStatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EC_MirrStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEC_MirrStatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ECO_MODE_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_ECO_MODE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getECO_MODE_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ECO_MODE_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerECO_MODE_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ECO_MODE_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterECO_MODE_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ELEC_STAB_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ELEC_STAB_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getELEC_STAB_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ELEC_STAB_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerELEC_STAB_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ELEC_STAB_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterELEC_STAB_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Electric_Wrench_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ELECTRIC_WRENCH_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getElectric_Wrench_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Electric_Wrench_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerElectric_Wrench_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Electric_Wrench_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterElectric_Wrench_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Engine_MIL_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ENGINE_MIL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEngine_MIL_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Engine_MIL_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEngine_MIL_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Engine_MIL_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEngine_MIL_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Engine_Temp_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ENGINE_TEMP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEngine_Temp_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Engine_Temp_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEngine_Temp_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Engine_Temp_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEngine_Temp_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EngineOilOverTemp from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ENGINE_OIL_OVER_TEMP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEngineOilOverTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineOilOverTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEngineOilOverTempChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineOilOverTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEngineOilOverTempChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EngOilIndLmp_On_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEngOilIndLmp_On_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngOilIndLmp_On_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEngOilIndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngOilIndLmp_On_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEngOilIndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EPB_WARN_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_EPB_WARN_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEPB_WARN_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EPB_WARN_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEPB_WARN_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EPB_WARN_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEPB_WARN_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EPS_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_EPS_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEPS_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EPS_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEPS_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EPS_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEPS_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EPS_Warn_Disp_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_EPS_WARN_DISP_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEPS_Warn_Disp_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EPS_Warn_Disp_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEPS_Warn_Disp_RqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EPS_Warn_Disp_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEPS_Warn_Disp_RqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ErrSys_1 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getErrSys_1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ErrSys_1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerErrSys_1Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ErrSys_1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterErrSys_1Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ErrSys_2 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getErrSys_2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ErrSys_2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerErrSys_2Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ErrSys_2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterErrSys_2Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ErrSys_3 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getErrSys_3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ErrSys_3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerErrSys_3Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ErrSys_3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterErrSys_3Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ErrSys_4 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getErrSys_4() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ErrSys_4.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerErrSys_4Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ErrSys_4.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterErrSys_4Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ErrSys_5 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getErrSys_5() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ErrSys_5.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerErrSys_5Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ErrSys_5.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterErrSys_5Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ESC_CtrlLmp_Info from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ESC_CTRLLMP_INFO
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getESC_CtrlLmp_Info() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESC_CtrlLmp_Info.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerESC_CtrlLmp_InfoChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESC_CtrlLmp_Info.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterESC_CtrlLmp_InfoChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ESC_OFF_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getESC_OFF_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESC_OFF_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerESC_OFF_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESC_OFF_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterESC_OFF_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ESCActive_Timer from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getESCActive_Timer() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESCActive_Timer.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerESCActive_TimerChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESCActive_Timer.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterESCActive_TimerChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ESP_Off_IndLmp_On_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getESP_Off_IndLmp_On_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESP_Off_IndLmp_On_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerESP_Off_IndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESP_Off_IndLmp_On_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterESP_Off_IndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ETC_Control_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ETC_CONTROL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getETC_Control_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ETC_Control_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerETC_Control_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ETC_Control_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterETC_Control_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the ETC_IND_LMP from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ETC_IND_LMP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getETC_IND_LMP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ETC_IND_LMP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerETC_IND_LMPChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ETC_IND_LMP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterETC_IND_LMPChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the EXH_BRK_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getEXH_BRK_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EXH_BRK_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerEXH_BRK_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EXH_BRK_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterEXH_BRK_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the FCW_System_Stat from the vehicle.
     * @base ATL - MP
     * @return VALUE_FCW_SYSTEM_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFCW_System_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FCW_System_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFCW_System_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FCW_System_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFCW_System_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Four_WD_Service_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_FOUR_WD_SERVICE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFour_WD_Service_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Four_WD_Service_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFour_WD_Service_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Four_WD_Service_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFour_WD_Service_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the FT_FOG_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFT_FOG_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_FOG_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFT_FOG_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_FOG_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFT_FOG_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Fuel_Cap_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_FUEL_CAP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFuel_Cap_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Fuel_Cap_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFuel_Cap_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Fuel_Cap_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFuel_Cap_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the FUEL_CUT_OFF_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_FUEL_CUT_OFF_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFUEL_CUT_OFF_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FUEL_CUT_OFF_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFUEL_CUT_OFF_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FUEL_CUT_OFF_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFUEL_CUT_OFF_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the FuelLvlLow from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFuelLvlLow() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FuelLvlLow.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFuelLvlLowChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FuelLvlLow.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFuelLvlLowChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the FunctionLamp from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_FUNCTION_LAMP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getFunctionLamp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FunctionLamp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerFunctionLampChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FunctionLamp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterFunctionLampChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the HDLT_LVL_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_HDLT_LVL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getHDLT_LVL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDLT_LVL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerHDLT_LVL_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDLT_LVL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterHDLT_LVL_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the HEV_LMP_RQ from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_HEV_LMP_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getHEV_LMP_RQ() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HEV_LMP_RQ.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerHEV_LMP_RQChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HEV_LMP_RQ.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterHEV_LMP_RQChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the HI_BEAM_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_HI_BEAM_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getHI_BEAM_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HI_BEAM_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerHI_BEAM_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HI_BEAM_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterHI_BEAM_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the HVY_EXH_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_HVY_EXH_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getHVY_EXH_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HVY_EXH_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerHVY_EXH_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HVY_EXH_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterHVY_EXH_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Lane_Sense_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_LANE_SENSE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getLane_Sense_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Lane_Sense_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerLane_Sense_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Lane_Sense_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterLane_Sense_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the LDW_LEDControlSts from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_LDW_LEDCONTROLSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getLDW_LEDControlSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LDW_LEDControlSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerLDW_LEDControlStsChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LDW_LEDControlSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterLDW_LEDControlStsChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the LHTurnLightFault_1 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getLHTurnLightFault_1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LHTurnLightFault_1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerLHTurnLightFault_1Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LHTurnLightFault_1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterLHTurnLightFault_1Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the LHTurnLightFault_2 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getLHTurnLightFault_2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LHTurnLightFault_2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerLHTurnLightFault_2Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LHTurnLightFault_2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterLHTurnLightFault_2Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the LIFT_GATE_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getLIFT_GATE_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LIFT_GATE_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerLIFT_GATE_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LIFT_GATE_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterLIFT_GATE_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the MIL_OnRq_BPCM from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getMIL_OnRq_BPCM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MIL_OnRq_BPCM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerMIL_OnRq_BPCMChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MIL_OnRq_BPCM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterMIL_OnRq_BPCMChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the MilLampStat from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getMilLampStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MilLampStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerMilLampStatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MilLampStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterMilLampStatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the OIL_IND_LMP_FLSH from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getOIL_IND_LMP_FLSH() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OIL_IND_LMP_FLSH.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerOIL_IND_LMP_FLSHChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OIL_IND_LMP_FLSH.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterOIL_IND_LMP_FLSHChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the OIL_LEVEL_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_OIL_LEVEL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getOIL_LEVEL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OIL_LEVEL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerOIL_LEVEL_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OIL_LEVEL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterOIL_LEVEL_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Oil_Pressure_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_OIL_PRESSURE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getOil_Pressure_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Oil_Pressure_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerOil_Pressure_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Oil_Pressure_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterOil_Pressure_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Oil_Temp_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_OIL_TEMP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getOil_Temp_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Oil_Temp_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerOil_Temp_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Oil_Temp_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterOil_Temp_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the OILTempChime from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_O_I_L_TEMP_CHIME
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getOILTempChime() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OILTempChime.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerOILTempChimeChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OILTempChime.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterOILTempChimeChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Over_Temp_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_OVER_TEMP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getOver_Temp_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Over_Temp_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerOver_Temp_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Over_Temp_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterOver_Temp_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the PARK_LMP_ON from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getPARK_LMP_ON() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PARK_LMP_ON.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerPARK_LMP_ONChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PARK_LMP_ON.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterPARK_LMP_ONChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the PassengerBELT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PASSENGER_B_E_L_T
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getPassengerBELT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PassengerBELT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerPassengerBELTChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PassengerBELT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterPassengerBELTChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the POS_LIGHT_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getPOS_LIGHT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to POS_LIGHT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerPOS_LIGHT_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to POS_LIGHT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterPOS_LIGHT_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the PPPA_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PPPA_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getPPPA_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PPPA_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerPPPA_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PPPA_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterPPPA_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the PreHtIndLmp_On_Rq from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getPreHtIndLmp_On_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PreHtIndLmp_On_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerPreHtIndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PreHtIndLmp_On_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterPreHtIndLmp_On_RqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the PTS_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PTS_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getPTS_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PTS_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerPTS_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PTS_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterPTS_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the RECIRC_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_RECIRC_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getRECIRC_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RECIRC_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerRECIRC_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RECIRC_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterRECIRC_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the RHTurnLightFault_1 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getRHTurnLightFault_1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RHTurnLightFault_1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerRHTurnLightFault_1Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RHTurnLightFault_1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterRHTurnLightFault_1Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the RHTurnLightFault_2 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getRHTurnLightFault_2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RHTurnLightFault_2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerRHTurnLightFault_2Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RHTurnLightFault_2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterRHTurnLightFault_2Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the RunFlatTireLow from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getRunFlatTireLow() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RunFlatTireLow.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerRunFlatTireLowChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RunFlatTireLow.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterRunFlatTireLowChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the SelectSpeedStatus from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SELECT_SPEED_STATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getSelectSpeedStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SelectSpeedStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerSelectSpeedStatusChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SelectSpeedStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterSelectSpeedStatusChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the SelSpdLmp from the vehicle.
     * @base ATLH - WL
     * @return VALUE_SEL_SPD_LMP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getSelSpdLmp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SelSpdLmp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerSelSpdLmpChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SelSpdLmp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterSelSpdLmpChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Service_ACC_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SERVICE_ACC_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getService_ACC_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Service_ACC_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerService_ACC_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Service_ACC_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterService_ACC_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Service_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SERVICE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getService_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Service_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerService_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Service_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterService_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the SpStSwStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SP_ST_SW_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getSpStSwStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SpStSwStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerSpStSwStatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SpStSwStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterSpStSwStatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the SRS_IndLmp_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SRS_INDLMP_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getSRS_IndLmp_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRS_IndLmp_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerSRS_IndLmp_RqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRS_IndLmp_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterSRS_IndLmp_RqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the SRS_LMP_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SRS_LMP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getSRS_LMP_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRS_LMP_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerSRS_LMP_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRS_LMP_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterSRS_LMP_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the STOP_START_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_STOP_START_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getSTOP_START_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to STOP_START_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerSTOP_START_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to STOP_START_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterSTOP_START_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the TcaseLampStatus from the vehicle.
     * @base PN - WD
     * @return VALUE_TCASE_LAMP_STATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTcaseLampStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TcaseLampStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTcaseLampStatusChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TcaseLampStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTcaseLampStatusChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the THEFT_ALARM_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_THEFT_ALARM_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTHEFT_ALARM_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to THEFT_ALARM_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTHEFT_ALARM_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to THEFT_ALARM_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTHEFT_ALARM_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Tire_Pressure_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TIRE_PRESSURE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTire_Pressure_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Tire_Pressure_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTire_Pressure_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Tire_Pressure_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTire_Pressure_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Torque_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TORQUE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTorque_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Torque_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTorque_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Torque_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTorque_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the TOW_HAUL_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_TOW_HAUL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTOW_HAUL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TOW_HAUL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTOW_HAUL_STATChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TOW_HAUL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTOW_HAUL_STATChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the TPM_IndLmpOnRq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TPM_INDLMPONRQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTPM_IndLmpOnRq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TPM_IndLmpOnRq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTPM_IndLmpOnRqChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TPM_IndLmpOnRq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTPM_IndLmpOnRqChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the TransOverTemp from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTransOverTemp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TransOverTemp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTransOverTempChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TransOverTemp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTransOverTempChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the TrnsLampStat from the vehicle.
     * @base PN -WD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTrnsLampStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TrnsLampStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTrnsLampStatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TrnsLampStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTrnsLampStatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the TX_WARN2 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TX_WARN2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getTX_WARN2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TX_WARN2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerTX_WARN2Change(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TX_WARN2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterTX_WARN2Change(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the WarningLightEvent from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getWarningLightEvent() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WarningLightEvent.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerWarningLightEventChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WarningLightEvent.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterWarningLightEventChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Gets the Water_In_Fuel_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_WATER_IN_FUEL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    int getWater_In_Fuel_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Water_In_Fuel_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean registerWater_In_Fuel_StatChange(FcaIVehicleWarningManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Water_In_Fuel_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHWARNING_READ_LOW
     */
    boolean unregisterWater_In_Fuel_StatChange(FcaIVehicleWarningManagerCallback callback);

    /**
     * Callback interface to register IVehicleWarningManager against.
     */
    public interface FcaIVehicleWarningManagerCallback {
        default void onABS_BrkEvtChange(int value) { }
        default void onABS_IND_STATChange(int value) { }
        default void onABS_IndLmp_On_RqChange(int value) { }
        default void onAC_StatChange(int value) { }
        default void onACC_WARN_STATChange(int value) { }
        default void onAdblue_FL_LVLChange(int value) { }
        default void onAdblue_StatChange(int value) { }
        default void onAHBFaultChange(int value) { }
        default void onAIR_BAG_STATChange(int value) { }
        default void onAirbagIndLampChange(int value) { }
        default void onASCM_SrvChange(int value) { }
        default void onASCM_SysFailChange(int value) { }
        default void onAutomaticOilChangeChange(int value) { }
        default void onAWD_service_statChange(int value) { }
        default void onBatt_ST_CritChange(int value) { }
        default void onBoostVacGaugeChange(int value) { }
        default void onBRAKE_PAD_STATChange(int value) { }
        default void onBrakeIndicationLampStatusChange(int value) { }
        default void onBRK_IND_STATChange(int value) { }
        default void onBrkPdl_FltChange(int value) { }
        default void onCARGO_LT_STATChange(int value) { }
        default void onCATALYST_TEMP_STATChange(int value) { }
        default void onChrgSysFaultChange(int value) { }
        default void onCHRGSystemFailChange(int value) { }
        default void onCruise_Lamp_StatChange(int value) { }
        default void onCRUISE_SET_STATChange(int value) { }
        default void onDamping_system_statChange(int value) { }
        default void onDay_Night_ModeChange(int value) { }
        default void onDef_statChange(int value) { }
        default void onDpfDefWarningStatusChange(int value) { }
        default void onDriverBeltChange(int value) { }
        default void onDRV_AJARChange(int value) { }
        default void onE_Mode_StsChange(int value) { }
        default void onEBL_STATChange(int value) { }
        default void onEC_MirrStatChange(int value) { }
        default void onECO_MODE_STATChange(int value) { }
        default void onELEC_STAB_STATChange(int value) { }
        default void onElectric_Wrench_StatChange(int value) { }
        default void onEngine_MIL_StatChange(int value) { }
        default void onEngine_Temp_StatChange(int value) { }
        default void onEngineOilOverTempChange(int value) { }
        default void onEngOilIndLmp_On_RqChange(int value) { }
        default void onEPB_WARN_STATChange(int value) { }
        default void onEPS_StatChange(int value) { }
        default void onEPS_Warn_Disp_RqChange(int value) { }
        default void onErrSys_1Change(int value) { }
        default void onErrSys_2Change(int value) { }
        default void onErrSys_3Change(int value) { }
        default void onErrSys_4Change(int value) { }
        default void onErrSys_5Change(int value) { }
        default void onESC_CtrlLmp_InfoChange(int value) { }
        default void onESC_OFF_STATChange(int value) { }
        default void onESCActive_TimerChange(int value) { }
        default void onESP_Off_IndLmp_On_RqChange(int value) { }
        default void onETC_Control_StatChange(int value) { }
        default void onETC_IND_LMPChange(int value) { }
        default void onEXH_BRK_STATChange(int value) { }
        default void onFCW_System_StatChange(int value) { }
        default void onFour_WD_Service_StatChange(int value) { }
        default void onFT_FOG_STATChange(int value) { }
        default void onFuel_Cap_StatChange(int value) { }
        default void onFUEL_CUT_OFF_STATChange(int value) { }
        default void onFuelLvlLowChange(int value) { }
        default void onFunctionLampChange(int value) { }
        default void onHDLT_LVL_STATChange(int value) { }
        default void onHEV_LMP_RQChange(int value) { }
        default void onHI_BEAM_STATChange(int value) { }
        default void onHVY_EXH_STATChange(int value) { }
        default void onLane_Sense_StatChange(int value) { }
        default void onLDW_LEDControlStsChange(int value) { }
        default void onLHTurnLightFault_1Change(int value) { }
        default void onLHTurnLightFault_2Change(int value) { }
        default void onLIFT_GATE_STATChange(int value) { }
        default void onMIL_OnRq_BPCMChange(int value) { }
        default void onMilLampStatChange(int value) { }
        default void onOIL_IND_LMP_FLSHChange(int value) { }
        default void onOIL_LEVEL_STATChange(int value) { }
        default void onOil_Pressure_StatChange(int value) { }
        default void onOil_Temp_StatChange(int value) { }
        default void onOILTempChimeChange(int value) { }
        default void onOver_Temp_StatChange(int value) { }
        default void onPARK_LMP_ONChange(int value) { }
        default void onPassengerBELTChange(int value) { }
        default void onPOS_LIGHT_STATChange(int value) { }
        default void onPPPA_STATChange(int value) { }
        default void onPreHtIndLmp_On_RqChange(int value) { }
        default void onPTS_STATChange(int value) { }
        default void onRECIRC_STATChange(int value) { }
        default void onRHTurnLightFault_1Change(int value) { }
        default void onRHTurnLightFault_2Change(int value) { }
        default void onRunFlatTireLowChange(int value) { }
        default void onSelectSpeedStatusChange(int value) { }
        default void onSelSpdLmpChange(int value) { }
        default void onService_ACC_StatChange(int value) { }
        default void onService_StatChange(int value) { }
        default void onSpStSwStatChange(int value) { }
        default void onSRS_IndLmp_RqChange(int value) { }
        default void onSRS_LMP_STATChange(int value) { }
        default void onSTOP_START_STATChange(int value) { }
        default void onTcaseLampStatusChange(int value) { }
        default void onTHEFT_ALARM_STATChange(int value) { }
        default void onTire_Pressure_StatChange(int value) { }
        default void onTorque_StatChange(int value) { }
        default void onTOW_HAUL_STATChange(int value) { }
        default void onTPM_IndLmpOnRqChange(int value) { }
        default void onTransOverTempChange(int value) { }
        default void onTrnsLampStatChange(int value) { }
        default void onTX_WARN2Change(int value) { }
        default void onWarningLightEventChange(int value) { }
        default void onWater_In_Fuel_StatChange(int value) { }
    }
}
