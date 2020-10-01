package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleDriveStatusManager
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
public interface IVehicleDriveStatusManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_ACCEL_PDL_POSN_SNA = 2147483647;

    public static final int VALUE_ADC_STAT_MODE_1 = 0;
    public static final int VALUE_ADC_STAT_MODE_2 = 1;
    public static final int VALUE_ADC_STAT_MODE_3 = 2;
    public static final int VALUE_ADC_STAT_SNA    = 3;

    public static final int VALUE_ASCM_HMI_STAT_NONE                    = 0;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_REDSPD             = 1;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_LVLNPRMT           = 2;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_COOLDN             = 3;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_DR                 = 4;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_SRV                = 5;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_SYSFAIL            = 6;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_VLST               = 7;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_TJM_DISP           = 8;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_LOWCLR             = 9;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_HIGHLR             = 10;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_TM_DISP            = 11;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_WAL_DISP           = 12;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_AERODSLB           = 14;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_LNP_SPEED          = 15;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_LNP_MAXPAYLOAD     = 16;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_LNP_MINLOAD        = 17;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_LNP_LIMITEDPAYLOAD = 18;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_BDL_ENBL           = 19;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_BDL_COMPLETE       = 20;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_BDL_UNSUCC         = 21;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_EEHNA              = 22;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_START_STOP         = 23;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_PARK               = 24;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_AERO               = 25;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_NVL                = 26;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_OR1                = 27;
    public static final int VALUE_ASCM_HMI_STAT_ASCM_ORL2               = 28;
    public static final int VALUE_ASCM_HMI_STAT_SNA                     = 32;

    public static final int VALUE_ASCM_STAT_NO_MESS = 0;
    public static final int VALUE_ASCM_STAT_DUMP    = 1;
    public static final int VALUE_ASCM_STAT_PARK    = 2;
    public static final int VALUE_ASCM_STAT_AERO    = 3;
    public static final int VALUE_ASCM_STAT_NVL     = 4;
    public static final int VALUE_ASCM_STAT_OR1     = 5;
    public static final int VALUE_ASCM_STAT_ORL2    = 6;
    public static final int VALUE_ASCM_STAT_EEHNA   = 7;
    public static final int VALUE_ASCM_STAT_RAISE   = 8;
    public static final int VALUE_ASCM_STAT_LOWER   = 9;
    public static final int VALUE_ASCM_STAT_RL_INT  = 10;
    public static final int VALUE_ASCM_STAT_SRVS    = 11;
    public static final int VALUE_ASCM_STAT_AERO2   = 12;
    public static final int VALUE_ASCM_STAT_SNA     = 15;

    public static final int VALUE_BRAKE_FLUID_OK        = 0;
    public static final int VALUE_BRAKE_FLUID_LOW_LEVEL = 1;

    public static final int VALUE_DRIVE_STYLE_STS_NORMAL      = 0;
    public static final int VALUE_DRIVE_STYLE_STS_CITY        = 1;
    public static final int VALUE_DRIVE_STYLE_STS_SPORT_FUN   = 2;
    public static final int VALUE_DRIVE_STYLE_STS_WINTER_RACE = 3;
    public static final int VALUE_DRIVE_STYLE_STS_ECO         = 4;
    public static final int VALUE_DRIVE_STYLE_STS_TRACPLUS    = 5;
    public static final int VALUE_DRIVE_STYLE_STS_TREKKING    = 6;
    public static final int VALUE_DRIVE_STYLE_STS_AUTO        = 7;
    public static final int VALUE_DRIVE_STYLE_STS_SNOW        = 8;
    public static final int VALUE_DRIVE_STYLE_STS_SAND        = 9;
    public static final int VALUE_DRIVE_STYLE_STS_MUD         = 10;
    public static final int VALUE_DRIVE_STYLE_STS_ROCK        = 11;
    public static final int VALUE_DRIVE_STYLE_STS_RACE        = 12;
    public static final int VALUE_DRIVE_STYLE_STS_SAND_MUD    = 13;
    public static final int VALUE_DRIVE_STYLE_STS_SNA         = 31;

    public static final int VALUE_DRV_RQ_SHFT_R_O_T_INIT  = 0;
    public static final int VALUE_DRV_RQ_SHFT_R_O_T_PARK  = 1;
    public static final int VALUE_DRV_RQ_SHFT_R_O_T_REV   = 2;
    public static final int VALUE_DRV_RQ_SHFT_R_O_T_NEUT  = 3;
    public static final int VALUE_DRV_RQ_SHFT_R_O_T_DRIVE = 4;
    public static final int VALUE_DRV_RQ_SHFT_R_O_T_FIFTH = 5;
    public static final int VALUE_DRV_RQ_SHFT_R_O_T_SNA   = 7;

    public static final int VALUE_ECON_SHFT_RQ_NO_GEARSHIFT_SUGGESTION_BY_ECM  = 0;
    public static final int VALUE_ECON_SHFT_RQ_DOWNSHIFT_SUGGESTION_BY_ECM     = 1;
    public static final int VALUE_ECON_SHFT_RQ_UPSHIFT_SUGGESTION_BY_ECM       = 2;
    public static final int VALUE_ECON_SHFT_RQ_STRATEGY_NOT_AVAILABLE_ECM_FAIL = 3;

    public static final int VALUE_E_MODE_SW_PSD_DEFAULT    = 0;
    public static final int VALUE_E_MODE_SW_PSD_SW_NOT_PSD = 1;
    public static final int VALUE_E_MODE_SW_PSD_SW_PSD     = 2;
    public static final int VALUE_E_MODE_SW_PSD_SNA        = 3;

    public static final int VALUE_ENGINE_R_P_M_SNA = 65535;

    public static final int VALUE_E_P_B_HOLD_STS_REL       = 0;
    public static final int VALUE_E_P_B_HOLD_STS_APPLIED   = 1;
    public static final int VALUE_E_P_B_HOLD_STS_APPLYING  = 2;
    public static final int VALUE_E_P_B_HOLD_STS_RELEASING = 3;
    public static final int VALUE_E_P_B_HOLD_STS_DC        = 4;
    public static final int VALUE_E_P_B_HOLD_STS_BSU       = 5;

    public static final int VALUE_EPS_MODE_STAT_MODE_1 = 0;
    public static final int VALUE_EPS_MODE_STAT_MODE_2 = 1;
    public static final int VALUE_EPS_MODE_STAT_MODE_3 = 2;
    public static final int VALUE_EPS_MODE_STAT_LAST   = 3;
    public static final int VALUE_EPS_MODE_STAT_SNA    = 7;

    public static final int VALUE_ESS_ENG_ST_ENS_STOPPED     = 1;
    public static final int VALUE_ESS_ENG_ST_ENS_RQ_ST       = 2;
    public static final int VALUE_ESS_ENG_ST_ENS_RUN         = 3;
    public static final int VALUE_ESS_ENG_ST_ENS_STOP_PEND   = 4;
    public static final int VALUE_ESS_ENG_ST_ENS_ST_PRTCT    = 5;
    public static final int VALUE_ESS_ENG_ST_ENS_ST_INH      = 6;
    public static final int VALUE_ESS_ENG_ST_ENS_DSBL        = 7;
    public static final int VALUE_ESS_ENG_ST_ENS_IHB_LATCH   = 8;
    public static final int VALUE_ESS_ENG_ST_ENS_STARTING    = 9;
    public static final int VALUE_ESS_ENG_ST_KEY_START       = 10;
    public static final int VALUE_ESS_ENG_ST_ENS_CHANGE_MIND = 11;
    public static final int VALUE_ESS_ENG_ST_SNA             = 15;

    public static final int VALUE_FT_RRCOUPLINGTRQ_ACTUAL_SNA = 2147483647;

    public static final int VALUE_FT_RRCOUPLINGTRQ_DESIRED_SNA = 2147483647;

    public static final int VALUE_FUEL_LEVEL_SNA = 2147483647;

    public static final int VALUE_GLOB_DRV_MD_RQ_NONE     = 0;
    public static final int VALUE_GLOB_DRV_MD_RQ_AUTO     = 1;
    public static final int VALUE_GLOB_DRV_MD_RQ_SPORT    = 2;
    public static final int VALUE_GLOB_DRV_MD_RQ_TRACK    = 3;
    public static final int VALUE_GLOB_DRV_MD_RQ_SNOW     = 4;
    public static final int VALUE_GLOB_DRV_MD_RQ_VALET    = 5;
    public static final int VALUE_GLOB_DRV_MD_RQ_ROCK     = 6;
    public static final int VALUE_GLOB_DRV_MD_RQ_TOW      = 7;
    public static final int VALUE_GLOB_DRV_MD_RQ_ECO      = 8;
    public static final int VALUE_GLOB_DRV_MD_RQ_LAUNCH   = 9;
    public static final int VALUE_GLOB_DRV_MD_RQ_ALL      = 10;
    public static final int VALUE_GLOB_DRV_MD_RQ_CUSTOM   = 11;
    public static final int VALUE_GLOB_DRV_MD_RQ_MUD      = 12;
    public static final int VALUE_GLOB_DRV_MD_RQ_SAND     = 13;
    public static final int VALUE_GLOB_DRV_MD_RQ_PLUS     = 14;
    public static final int VALUE_GLOB_DRV_MD_RQ_ICE      = 15;
    public static final int VALUE_GLOB_DRV_MD_RQ_DYNAMIC  = 16;
    public static final int VALUE_GLOB_DRV_MD_RQ_OFFROAD  = 17;
    public static final int VALUE_GLOB_DRV_MD_RQ_BAJA     = 18;
    public static final int VALUE_GLOB_DRV_MD_RQ_MUD_SAND = 19;
    public static final int VALUE_GLOB_DRV_MD_RQ_SNA      = 31;

    public static final int VALUE_GLOB_DRV_MD_STS_NONE    = 0;
    public static final int VALUE_GLOB_DRV_MD_STS_AUTO    = 1;
    public static final int VALUE_GLOB_DRV_MD_STS_SPORT   = 2;
    public static final int VALUE_GLOB_DRV_MD_STS_TRACK   = 3;
    public static final int VALUE_GLOB_DRV_MD_STS_SNOW    = 4;
    public static final int VALUE_GLOB_DRV_MD_STS_VALET   = 5;
    public static final int VALUE_GLOB_DRV_MD_STS_ROCK    = 6;
    public static final int VALUE_GLOB_DRV_MD_STS_TOW     = 7;
    public static final int VALUE_GLOB_DRV_MD_STS_ECO     = 8;
    public static final int VALUE_GLOB_DRV_MD_STS_LAUNCH  = 9;
    public static final int VALUE_GLOB_DRV_MD_STS_ALL     = 10;
    public static final int VALUE_GLOB_DRV_MD_STS_CUSTOM  = 11;
    public static final int VALUE_GLOB_DRV_MD_STS_MUD     = 12;
    public static final int VALUE_GLOB_DRV_MD_STS_SAND    = 13;
    public static final int VALUE_GLOB_DRV_MD_STS_PLUS    = 14;
    public static final int VALUE_GLOB_DRV_MD_STS_ICE     = 15;
    public static final int VALUE_GLOB_DRV_MD_STS_DYNAMIC = 16;
    public static final int VALUE_GLOB_DRV_MD_STS_OFFROAD = 17;
    public static final int VALUE_GLOB_DRV_MD_STS_SNA     = 31;

    public static final int VALUE_GR_TARGET_N       = 0;
    public static final int VALUE_GR_TARGET_D1      = 1;
    public static final int VALUE_GR_TARGET_D2      = 2;
    public static final int VALUE_GR_TARGET_D3      = 3;
    public static final int VALUE_GR_TARGET_D4      = 4;
    public static final int VALUE_GR_TARGET_D5      = 5;
    public static final int VALUE_GR_TARGET_D6      = 6;
    public static final int VALUE_GR_TARGET_D7      = 7;
    public static final int VALUE_GR_TARGET_D8      = 8;
    public static final int VALUE_GR_TARGET_D2P     = 9;
    public static final int VALUE_GR_TARGET_D9      = 10;
    public static final int VALUE_GR_TARGET_R       = 11;
    public static final int VALUE_GR_TARGET_R2      = 12;
    public static final int VALUE_GR_TARGET_P       = 13;
    public static final int VALUE_GR_TARGET_ABBRUCH = 14;
    public static final int VALUE_GR_TARGET_SNA     = 15;

    public static final int VALUE_H_D_C_USER_FD_BCK_ON    = 0;
    public static final int VALUE_H_D_C_USER_FD_BCK_OFF   = 1;
    public static final int VALUE_H_D_C_USER_FD_BCK_BLINK = 2;
    public static final int VALUE_H_D_C_USER_FD_BCK_SNA   = 3;

    public static final int VALUE_HILL_DES_STAT_HDC_UNAVL       = 0;
    public static final int VALUE_HILL_DES_STAT_HDC_ACT         = 1;
    public static final int VALUE_HILL_DES_STAT_HDC_AVL         = 2;
    public static final int VALUE_HILL_DES_STAT_HDC_THRML_DEACT = 3;

    public static final int VALUE_HYBRID_DRIVE_MODE_STS_DRIVE_MODE_UNAVAILABLE = 0;
    public static final int VALUE_HYBRID_DRIVE_MODE_STS_HYBRID                 = 1;
    public static final int VALUE_HYBRID_DRIVE_MODE_STS_SPORT                  = 2;
    public static final int VALUE_HYBRID_DRIVE_MODE_STS_E_SAVE                 = 4;
    public static final int VALUE_HYBRID_DRIVE_MODE_STS_ELECTRIC               = 8;
    public static final int VALUE_HYBRID_DRIVE_MODE_STS_SNA                    = 15;

    public static final int VALUE_INSTANTANEOUS_FUEL_CONSUMPTION1_SNA = 15;

    public static final int VALUE_INSTANTANEOUS_FUEL_CONSUMPTION2_SNA = 15;

    public static final int VALUE_INSTANTANEOUS_FUEL_CONSUMPTION3_SNA = 15;

    public static final int VALUE_KEY_IN_IGN_KEY_DEF        = 0;
    public static final int VALUE_KEY_IN_IGN_KEY_NOT_IN_IGN = 1;
    public static final int VALUE_KEY_IN_IGN_KEY_IN_IGN     = 2;
    public static final int VALUE_KEY_IN_IGN_SNA            = 3;

    public static final int VALUE_LAUNCH_RPM_SELECTED_SETTING2_DEFAULT = 0;

    public static final int VALUE_LHF_SPIN_STAND_STILL = 0;
    public static final int VALUE_LHF_SPIN_FORWARD     = 1;
    public static final int VALUE_LHF_SPIN_BACKWARD    = 2;
    public static final int VALUE_LHF_SPIN_SNA         = 3;

    public static final int VALUE_L_H_F_WHEEL_SPEED_SNA = 2147483647;

    public static final int VALUE_LHR_SPIN_STAND_STILL = 0;
    public static final int VALUE_LHR_SPIN_FORWARD     = 1;
    public static final int VALUE_LHR_SPIN_BACKWARD    = 2;
    public static final int VALUE_LHR_SPIN_SNA         = 3;

    public static final int VALUE_L_H_R_WHEEL_SPEED_SNA = 2147483647;

    public static final int VALUE_LWS_SPEED_SNA = 2147483647;

    public static final int VALUE_OVER_STEERING_SNA = 2147483647;

    public static final int VALUE_PADDLES_MODE_REQ_NONE = 0;
    public static final int VALUE_PADDLES_MODE_REQ_DIS  = 1;
    public static final int VALUE_PADDLES_MODE_REQ_EN   = 2;
    public static final int VALUE_PADDLES_MODE_REQ_SNA  = 3;

    public static final int VALUE_PITCH_ANGLE_SNA = 2147483647;

    public static final int VALUE_PRND_STAT_LVR_P = 0;
    public static final int VALUE_PRND_STAT_LVR_R = 1;
    public static final int VALUE_PRND_STAT_LVR_N = 2;
    public static final int VALUE_PRND_STAT_LVR_D = 4;
    public static final int VALUE_PRND_STAT_NOT_R = 5;
    public static final int VALUE_PRND_STAT_SNA   = 7;

    public static final int VALUE_PRNDL_DISP_BLANK = 32;
    public static final int VALUE_PRNDL_DISP_ONE   = 49;
    public static final int VALUE_PRNDL_DISP_TWO   = 50;
    public static final int VALUE_PRNDL_DISP_THREE = 51;
    public static final int VALUE_PRNDL_DISP_FOUR  = 52;
    public static final int VALUE_PRNDL_DISP_FIVE  = 53;
    public static final int VALUE_PRNDL_DISP_SIX   = 54;
    public static final int VALUE_PRNDL_DISP_SEVEN = 55;
    public static final int VALUE_PRNDL_DISP_EIGHT = 56;
    public static final int VALUE_PRNDL_DISP_NINE  = 57;
    public static final int VALUE_PRNDL_DISP_A     = 65;
    public static final int VALUE_PRNDL_DISP_D     = 68;
    public static final int VALUE_PRNDL_DISP_F     = 70;
    public static final int VALUE_PRNDL_DISP_L     = 76;
    public static final int VALUE_PRNDL_DISP_M     = 77;
    public static final int VALUE_PRNDL_DISP_N     = 78;
    public static final int VALUE_PRNDL_DISP_P     = 80;
    public static final int VALUE_PRNDL_DISP_R     = 82;
    public static final int VALUE_PRNDL_DISP_S     = 83;
    public static final int VALUE_PRNDL_DISP_DS    = 128;
    public static final int VALUE_PRNDL_DISP_D2    = 130;
    public static final int VALUE_PRNDL_DISP_D3    = 131;
    public static final int VALUE_PRNDL_DISP_D4    = 132;
    public static final int VALUE_PRNDL_DISP_D5    = 133;
    public static final int VALUE_PRNDL_DISP_SNOW  = 135;
    public static final int VALUE_PRNDL_DISP_NOT_N = 254;
    public static final int VALUE_PRNDL_DISP_SNA   = 255;

    public static final int VALUE_PSI_GR1_RPM_SNA = 31;

    public static final int VALUE_PSI_GR1_RPM_SET_SNA = 31;

    public static final int VALUE_PSI_GR2_RPM_SNA = 31;

    public static final int VALUE_PSI_GR2_RPM_SET_SNA = 31;

    public static final int VALUE_PSI_GR3_RPM_SNA = 31;

    public static final int VALUE_PSI_GR3_RPM_SET_SNA = 31;

    public static final int VALUE_PSI_GR4_RPM_SNA = 31;

    public static final int VALUE_PSI_GR4_RPM_SET_SNA = 31;

    public static final int VALUE_PSI_GR5_RPM_SNA = 31;

    public static final int VALUE_PSI_GR5_RPM_SET_SNA = 31;

    public static final int VALUE_PSI_MAX_RPM_SNA = 31;

    public static final int VALUE_PSI_RQ_NONE    = 0;
    public static final int VALUE_PSI_RQ_DISABLE = 1;
    public static final int VALUE_PSI_RQ_ENABLE  = 2;
    public static final int VALUE_PSI_RQ_SNA     = 3;

    public static final int VALUE_PWRTRNHV_ISOLSTAT_N_S  = 0;
    public static final int VALUE_PWRTRNHV_ISOLSTAT_PASS = 1;
    public static final int VALUE_PWRTRNHV_ISOLSTAT_FAIL = 2;
    public static final int VALUE_PWRTRNHV_ISOLSTAT_INV  = 3;

    public static final int VALUE_RADIOTRACTIONCONTROL_IND_OFF = 0;
    public static final int VALUE_RADIOTRACTIONCONTROL_IND_ON  = 1;
    public static final int VALUE_RADIOTRACTIONCONTROL_IND_SNA = 3;

    public static final int VALUE_RHF_SPIN_STAND_STILL = 0;
    public static final int VALUE_RHF_SPIN_FORWARD     = 1;
    public static final int VALUE_RHF_SPIN_BACKWARD    = 2;
    public static final int VALUE_RHF_SPIN_SNA         = 3;

    public static final int VALUE_R_H_F_WHEEL_SPEED_SNA = 2147483647;

    public static final int VALUE_RHR_SPIN_STAND_STILL = 0;
    public static final int VALUE_RHR_SPIN_FORWARD     = 1;
    public static final int VALUE_RHR_SPIN_BACKWARD    = 2;
    public static final int VALUE_RHR_SPIN_SNA         = 3;

    public static final int VALUE_R_H_R_WHEEL_SPEED_SNA = 2147483647;

    public static final int VALUE_ROLL_ANGLE_SNA = 2147483647;

    public static final int VALUE_RR_LK_TRQ_SNA = 255;

    public static final int VALUE_SHFT_PROG_LOW            = 1;
    public static final int VALUE_SHFT_PROG_SSC            = 2;
    public static final int VALUE_SHFT_PROG_HDC            = 3;
    public static final int VALUE_SHFT_PROG_TRACK          = 4;
    public static final int VALUE_SHFT_PROG_VALET          = 5;
    public static final int VALUE_SHFT_PROG_SNOW           = 7;
    public static final int VALUE_SHFT_PROG_MUD            = 11;
    public static final int VALUE_SHFT_PROG_SAND           = 12;
    public static final int VALUE_SHFT_PROG_SKIP_SHFT      = 16;
    public static final int VALUE_SHFT_PROG_UPSHIFT_IND_RQ = 24;
    public static final int VALUE_SHFT_PROG_BLANK          = 32;
    public static final int VALUE_SHFT_PROG_E_MODE         = 64;
    public static final int VALUE_SHFT_PROG_A              = 65;
    public static final int VALUE_SHFT_PROG_M              = 77;
    public static final int VALUE_SHFT_PROG_S              = 83;
    public static final int VALUE_SHFT_PROG_W              = 87;
    public static final int VALUE_SHFT_PROG_TX_RACE        = 249;
    public static final int VALUE_SHFT_PROG_SPORT_PLUS     = 250;
    public static final int VALUE_SHFT_PROG_TX_SPORT       = 251;
    public static final int VALUE_SHFT_PROG_TX_NORM        = 252;
    public static final int VALUE_SHFT_PROG_OD_OFF         = 253;
    public static final int VALUE_SHFT_PROG_TX_TOW         = 254;
    public static final int VALUE_SHFT_PROG_SNA            = 255;

    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_NO_SELECTION_ACTIVE_OR_AVAILABLE = 0;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_P                                = 1;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_R                                = 2;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_N                                = 3;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_D                                = 4;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_L                                = 5;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_TIP_AUTOSTICK                    = 6;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_PLUS                             = 7;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_MINUS                            = 8;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_SPORT                            = 9;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_NOT_USED                         = 10;
    public static final int VALUE_SHIFT_LEVER_POSITION_REQ_SNA                              = 15;

    public static final int VALUE_SLOPE_SNA = 2147483647;

    public static final int VALUE_TCASE_STAT_SH_IPG = 0;
    public static final int VALUE_TCASE_STAT_4LO    = 1;
    public static final int VALUE_TCASE_STAT_4HI    = 2;
    public static final int VALUE_TCASE_STAT_2WD    = 3;
    public static final int VALUE_TCASE_STAT_N      = 4;
    public static final int VALUE_TCASE_STAT_AUTO   = 5;
    public static final int VALUE_TCASE_STAT_PT     = 6;
    public static final int VALUE_TCASE_STAT_SNA    = 7;

    public static final int VALUE_TCASEAWD_DRVMDRQ_NONE   = 0;
    public static final int VALUE_TCASEAWD_DRVMDRQ_AUTO   = 1;
    public static final int VALUE_TCASEAWD_DRVMDRQ_SPORT  = 2;
    public static final int VALUE_TCASEAWD_DRVMDRQ_TRACK  = 3;
    public static final int VALUE_TCASEAWD_DRVMDRQ_SNOW   = 4;
    public static final int VALUE_TCASEAWD_DRVMDRQ_VALET  = 5;
    public static final int VALUE_TCASEAWD_DRVMDRQ_ROCK   = 6;
    public static final int VALUE_TCASEAWD_DRVMDRQ_TOW    = 7;
    public static final int VALUE_TCASEAWD_DRVMDRQ_NORMAL = 8;
    public static final int VALUE_TCASEAWD_DRVMDRQ_ICE    = 9;
    public static final int VALUE_TCASEAWD_DRVMDRQ_ALL    = 10;
    public static final int VALUE_TCASEAWD_DRVMDRQ_MORS   = 11;
    public static final int VALUE_TCASEAWD_DRVMDRQ_MUD    = 12;
    public static final int VALUE_TCASEAWD_DRVMDRQ_SAND   = 13;
    public static final int VALUE_TCASEAWD_DRVMDRQ_SNA    = 15;

    public static final int VALUE_TERRAINMODESTAT_ECM_AUTO       = 0;
    public static final int VALUE_TERRAINMODESTAT_ECM_AUTO_FAULT = 1;
    public static final int VALUE_TERRAINMODESTAT_ECM_ROCK       = 2;
    public static final int VALUE_TERRAINMODESTAT_ECM_TRACK      = 3;
    public static final int VALUE_TERRAINMODESTAT_ECM_SNOW       = 4;
    public static final int VALUE_TERRAINMODESTAT_ECM_SPORT      = 8;
    public static final int VALUE_TERRAINMODESTAT_ECM_MUD_SAND   = 9;
    public static final int VALUE_TERRAINMODESTAT_ECM_MUD        = 10;
    public static final int VALUE_TERRAINMODESTAT_ECM_SAND       = 11;
    public static final int VALUE_TERRAINMODESTAT_ECM_VALET      = 12;
    public static final int VALUE_TERRAINMODESTAT_ECM_CUSTOM     = 13;
    public static final int VALUE_TERRAINMODESTAT_ECM_TOW        = 14;
    public static final int VALUE_TERRAINMODESTAT_ECM_BAJA       = 16;
    public static final int VALUE_TERRAINMODESTAT_ECM_SNA        = 31;

    public static final int VALUE_TIRE_F_L_NORMAL = 0;
    public static final int VALUE_TIRE_F_L_LOW    = 1;
    public static final int VALUE_TIRE_F_L_HIGH   = 2;
    public static final int VALUE_TIRE_F_L_SNA    = 3;

    public static final int VALUE_TIRE_F_R_NORMAL = 0;
    public static final int VALUE_TIRE_F_R_LOW    = 1;
    public static final int VALUE_TIRE_F_R_HIGH   = 2;
    public static final int VALUE_TIRE_F_R_SNA    = 3;

    public static final int VALUE_TIRE_R_L_NORMAL = 0;
    public static final int VALUE_TIRE_R_L_LOW    = 1;
    public static final int VALUE_TIRE_R_L_HIGH   = 2;
    public static final int VALUE_TIRE_R_L_SNA    = 3;

    public static final int VALUE_TIRE_R_R_NORMAL = 0;
    public static final int VALUE_TIRE_R_R_LOW    = 1;
    public static final int VALUE_TIRE_R_R_HIGH   = 2;
    public static final int VALUE_TIRE_R_R_SNA    = 3;

    public static final int VALUE_TIRE_SPR_NORMAL = 0;
    public static final int VALUE_TIRE_SPR_LOW    = 1;
    public static final int VALUE_TIRE_SPR_HIGH   = 2;
    public static final int VALUE_TIRE_SPR_SNA    = 3;

    public static final int VALUE_TRANSMISSION_TYPE_MANUAL    = 0;
    public static final int VALUE_TRANSMISSION_TYPE_AUTOMATIC = 1;

    public static final int VALUE_TRNS_DRVMDREQ_NP     = 0;
    public static final int VALUE_TRNS_DRVMDREQ_STREET = 1;
    public static final int VALUE_TRNS_DRVMDREQ_VALET  = 2;
    public static final int VALUE_TRNS_DRVMDREQ_SPORT  = 3;
    public static final int VALUE_TRNS_DRVMDREQ_S_PLUS = 4;
    public static final int VALUE_TRNS_DRVMDREQ_TRACK  = 5;
    public static final int VALUE_TRNS_DRVMDREQ_ECO    = 6;
    public static final int VALUE_TRNS_DRVMDREQ_SNOW   = 7;
    public static final int VALUE_TRNS_DRVMDREQ_ROCK   = 8;
    public static final int VALUE_TRNS_DRVMDREQ_TOW    = 9;
    public static final int VALUE_TRNS_DRVMDREQ_DRAG   = 10;
    public static final int VALUE_TRNS_DRVMDREQ_MUD    = 11;
    public static final int VALUE_TRNS_DRVMDREQ_SAND   = 12;
    public static final int VALUE_TRNS_DRVMDREQ_BAJA   = 13;
    public static final int VALUE_TRNS_DRVMDREQ_SNA    = 15;

    public static final int VALUE_UNDER_STEERING_SNA = 2147483647;

    public static final int VALUE_VEHACCEL_X_SNA = 2147483647;

    public static final int VALUE_VEHACCEL_Y_SNA = 2147483647;

    public static final int VALUE_WHLRPM_FL_SNA = 2147483647;

    public static final int VALUE_WHLRPM_FR_SNA = 2147483647;

    public static final int VALUE_WHLRPM_RL_SNA = 2147483647;

    public static final int VALUE_WHLRPM_RR_SNA = 2147483647;

    public static final int VALUE_YAW_RATE_SNA = 2147483647;

    /**
     * Gets the AccelPdlPosn from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getAccelPdlPosn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AccelPdlPosn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerAccelPdlPosnChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AccelPdlPosn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterAccelPdlPosnChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ActlAccelPdlPosn from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getActlAccelPdlPosn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ActlAccelPdlPosn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerActlAccelPdlPosnChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ActlAccelPdlPosn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterActlAccelPdlPosnChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ADC_Stat from the vehicle.
     * @base PNNAWD
     * @return VALUE_ADC_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getADC_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ADC_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerADC_StatChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ADC_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterADC_StatChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ASCM_HMI_Stat from the vehicle.
     * @base ATLH - WL
     * @return VALUE_ASCM_HMI_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getASCM_HMI_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ASCM_HMI_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerASCM_HMI_StatChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ASCM_HMI_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterASCM_HMI_StatChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ASCM_Stat from the vehicle.
     * @base PN - MASPN
     * @return VALUE_ASCM_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getASCM_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ASCM_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerASCM_StatChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ASCM_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterASCM_StatChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Avg_Fuel_Econ from the vehicle.
     * @base PN - RUPHEV
     * @return kmpl
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getAvg_Fuel_Econ() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Avg_Fuel_Econ.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerAvg_Fuel_EconChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Avg_Fuel_Econ.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterAvg_Fuel_EconChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the AvgFuelEcon from the vehicle.
     * @base ATL -MP
     * @return l/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getAvgFuelEcon() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AvgFuelEcon.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerAvgFuelEconChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AvgFuelEcon.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterAvgFuelEconChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the BrakeFluid from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_BRAKE_FLUID
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getBrakeFluid() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BrakeFluid.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerBrakeFluidChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BrakeFluid.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterBrakeFluidChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the BrkPrss_TMC from the vehicle.
     * @base PN - RUPHEV
     * @return bar
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getBrkPrss_TMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BrkPrss_TMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerBrkPrss_TMCChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BrkPrss_TMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterBrkPrss_TMCChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the DRIVE_STYLE_SELECTOR from the vehicle.
     * @base ATL - MP
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getDRIVE_STYLE_SELECTOR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DRIVE_STYLE_SELECTOR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerDRIVE_STYLE_SELECTORChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DRIVE_STYLE_SELECTOR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterDRIVE_STYLE_SELECTORChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the DriveStyleSts from the vehicle.
     * @base ATL - MP
     * @return VALUE_DRIVE_STYLE_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getDriveStyleSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DriveStyleSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerDriveStyleStsChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DriveStyleSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterDriveStyleStsChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the DrvMdHMI_3 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getDrvMdHMI_3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DrvMdHMI_3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerDrvMdHMI_3Change(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DrvMdHMI_3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterDrvMdHMI_3Change(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the DrvMdHMI_4 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getDrvMdHMI_4() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DrvMdHMI_4.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerDrvMdHMI_4Change(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DrvMdHMI_4.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterDrvMdHMI_4Change(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the DrvRqShftROT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_DRV_RQ_SHFT_R_O_T
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getDrvRqShftROT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DrvRqShftROT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerDrvRqShftROTChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DrvRqShftROT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterDrvRqShftROTChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the Dsbl_Loss_Of_Com of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetDsbl_Loss_Of_ComFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setDsbl_Loss_Of_Com(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the EconShftRq from the vehicle.
     * @base PN - WD
     * @return VALUE_ECON_SHFT_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getEconShftRq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EconShftRq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerEconShftRqChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EconShftRq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterEconShftRqChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the EModeSwPsd of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEModeSwPsdFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setEModeSwPsd(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the EngineRPM from the vehicle.
     * @base PN - RUPHEV
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getEngineRPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineRPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerEngineRPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineRPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterEngineRPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the EPBHoldSts from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_E_P_B_HOLD_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getEPBHoldSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EPBHoldSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerEPBHoldStsChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EPBHoldSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterEPBHoldStsChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the EPS_MODE_STAT from the vehicle.
     * @base PNNAWD
     * @return VALUE_EPS_MODE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getEPS_MODE_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EPS_MODE_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerEPS_MODE_STATChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EPS_MODE_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterEPS_MODE_STATChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ESS_ENG_ST from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ESS_ENG_ST
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getESS_ENG_ST() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESS_ENG_ST.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerESS_ENG_STChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESS_ENG_ST.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterESS_ENG_STChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Ft_RrCouplingTrq_Actual from the vehicle.
     * @base ATL - MP
     * @return Nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getFt_RrCouplingTrq_Actual() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Ft_RrCouplingTrq_Actual.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerFt_RrCouplingTrq_ActualChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Ft_RrCouplingTrq_Actual.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterFt_RrCouplingTrq_ActualChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Ft_RrCouplingTrq_Desired from the vehicle.
     * @base ATL - MP
     * @return Nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getFt_RrCouplingTrq_Desired() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Ft_RrCouplingTrq_Desired.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerFt_RrCouplingTrq_DesiredChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Ft_RrCouplingTrq_Desired.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterFt_RrCouplingTrq_DesiredChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the FtAxlePrcntgAWD from the vehicle.
     * @base PN - MASPN
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getFtAxlePrcntgAWD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FtAxlePrcntgAWD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerFtAxlePrcntgAWDChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FtAxlePrcntgAWD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterFtAxlePrcntgAWDChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the FuelLevel from the vehicle.
     * @base ATL -MP
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getFuelLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FuelLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerFuelLevelChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FuelLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterFuelLevelChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the GlobDrvMdRq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetGlobDrvMdRqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setGlobDrvMdRq(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the GlobDrvMdSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_GLOB_DRV_MD_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getGlobDrvMdSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to GlobDrvMdSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerGlobDrvMdStsChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to GlobDrvMdSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterGlobDrvMdStsChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Gr_Target from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_GR_TARGET
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getGr_Target() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Gr_Target.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerGr_TargetChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Gr_Target.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterGr_TargetChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the HDCUserFdBck from the vehicle.
     * @base ATL - MP
     * @return VALUE_H_D_C_USER_FD_BCK
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getHDCUserFdBck() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HDCUserFdBck.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerHDCUserFdBckChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HDCUserFdBck.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterHDCUserFdBckChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the HILL_DES_STAT from the vehicle.
     * @base PN - MASPN
     * @return VALUE_HILL_DES_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getHILL_DES_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HILL_DES_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerHILL_DES_STATChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HILL_DES_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterHILL_DES_STATChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the HybridDriveModeSts from the vehicle.
     * @base ATL - WL
     * @return VALUE_HYBRID_DRIVE_MODE_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getHybridDriveModeSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HybridDriveModeSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerHybridDriveModeStsChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HybridDriveModeSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterHybridDriveModeStsChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Inst_Fuel_Econ from the vehicle.
     * @base PN - RUPHEV
     * @return kmpl
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getInst_Fuel_Econ() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Inst_Fuel_Econ.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerInst_Fuel_EconChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Inst_Fuel_Econ.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterInst_Fuel_EconChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the InstantaneousFuelConsumption1 from the vehicle.
     * @base ATL - MP
     * @return VALUE_INSTANTANEOUS_FUEL_CONSUMPTION1
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getInstantaneousFuelConsumption1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to InstantaneousFuelConsumption1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerInstantaneousFuelConsumption1Change(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to InstantaneousFuelConsumption1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterInstantaneousFuelConsumption1Change(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the InstantaneousFuelConsumption2 from the vehicle.
     * @base ATL - MP
     * @return VALUE_INSTANTANEOUS_FUEL_CONSUMPTION2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getInstantaneousFuelConsumption2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to InstantaneousFuelConsumption2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerInstantaneousFuelConsumption2Change(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to InstantaneousFuelConsumption2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterInstantaneousFuelConsumption2Change(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the InstantaneousFuelConsumption3 from the vehicle.
     * @base ATL - MP
     * @return VALUE_INSTANTANEOUS_FUEL_CONSUMPTION3
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getInstantaneousFuelConsumption3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to InstantaneousFuelConsumption3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerInstantaneousFuelConsumption3Change(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to InstantaneousFuelConsumption3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterInstantaneousFuelConsumption3Change(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the KeyInIgn from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_KEY_IN_IGN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getKeyInIgn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to KeyInIgn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerKeyInIgnChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to KeyInIgn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterKeyInIgnChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LatAcceleration from the vehicle.
     * @base PN - RUPHEV
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getLatAcceleration() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LatAcceleration.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLatAccelerationChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LatAcceleration.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLatAccelerationChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the Launch_RPM_Selected_Setting2 of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetLaunch_RPM_Selected_Setting2Failed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setLaunch_RPM_Selected_Setting2(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the LaunchRPMsetting2_ESC from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getLaunchRPMsetting2_ESC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LaunchRPMsetting2_ESC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLaunchRPMsetting2_ESCChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LaunchRPMsetting2_ESC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLaunchRPMsetting2_ESCChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LHF_Spin from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_LHF_SPIN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getLHF_Spin() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LHF_Spin.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLHF_SpinChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LHF_Spin.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLHF_SpinChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LHFWheelSpeed from the vehicle.
     * @base ATL - MP
     * @return km/hr
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getLHFWheelSpeed() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LHFWheelSpeed.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLHFWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LHFWheelSpeed.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLHFWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LHR_Spin from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_LHR_SPIN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getLHR_Spin() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LHR_Spin.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLHR_SpinChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LHR_Spin.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLHR_SpinChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LHRWheelSpeed from the vehicle.
     * @base ATL - MP
     * @return km/hr
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getLHRWheelSpeed() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LHRWheelSpeed.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLHRWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LHRWheelSpeed.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLHRWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LongAcceleration from the vehicle.
     * @base PN - RUPHEV
     * @return m / s^2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getLongAcceleration() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LongAcceleration.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLongAccelerationChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LongAcceleration.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLongAccelerationChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LT_DIST from the vehicle.
     * @base PN - RUPHEV
     * @return cm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getLT_DIST() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LT_DIST.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLT_DISTChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LT_DIST.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLT_DISTChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the LwsSpeed from the vehicle.
     * @base ATL - MP
     * @return degrees / s
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getLwsSpeed() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LwsSpeed.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerLwsSpeedChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LwsSpeed.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterLwsSpeedChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the OverSteering from the vehicle.
     * @base ATL - MP
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getOverSteering() throws PropertyNotSupported;

    /**
     * Registers listening to changes to OverSteering.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerOverSteeringChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to OverSteering.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterOverSteeringChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PaddlesModeReq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPaddlesModeReqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPaddlesModeReq(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PARK_BRAKE_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPARK_BRAKE_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PARK_BRAKE_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPARK_BRAKE_STATChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PARK_BRAKE_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPARK_BRAKE_STATChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the PARK_BRK_EGD from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPARK_BRK_EGD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PARK_BRK_EGD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPARK_BRK_EGDChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PARK_BRK_EGD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPARK_BRK_EGDChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the PitchAngle from the vehicle.
     * @base ATL - MP
     * @return °
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPitchAngle() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PitchAngle.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPitchAngleChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PitchAngle.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPitchAngleChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the PRND_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PRND_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPRND_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PRND_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPRND_STATChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PRND_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPRND_STATChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the PRNDL_DISP from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PRNDL_DISP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPRNDL_DISP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PRNDL_DISP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPRNDL_DISPChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PRNDL_DISP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPRNDL_DISPChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the PSI_EnableSts from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_EnableSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_EnableSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_EnableStsChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_EnableSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_EnableStsChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the PSI_Gr1_RPM from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_Gr1_RPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_Gr1_RPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_Gr1_RPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_Gr1_RPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_Gr1_RPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PSI_Gr1_RPM_SET of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_Gr1_RPM_SETFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_Gr1_RPM_SET(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PSI_Gr2_RPM from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_Gr2_RPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_Gr2_RPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_Gr2_RPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_Gr2_RPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_Gr2_RPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PSI_Gr2_RPM_SET of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_Gr2_RPM_SETFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_Gr2_RPM_SET(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PSI_Gr3_RPM from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_Gr3_RPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_Gr3_RPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_Gr3_RPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_Gr3_RPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_Gr3_RPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PSI_Gr3_RPM_SET of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_Gr3_RPM_SETFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_Gr3_RPM_SET(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PSI_Gr4_RPM from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_Gr4_RPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_Gr4_RPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_Gr4_RPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_Gr4_RPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_Gr4_RPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PSI_Gr4_RPM_SET of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_Gr4_RPM_SETFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_Gr4_RPM_SET(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PSI_Gr5_RPM from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_Gr5_RPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_Gr5_RPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_Gr5_RPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_Gr5_RPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_Gr5_RPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PSI_Gr5_RPM_SET of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_Gr5_RPM_SETFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_Gr5_RPM_SET(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PSI_Max_RPM from the vehicle.
     * @base PNNAWD
     * @return rpm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPSI_Max_RPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSI_Max_RPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPSI_Max_RPMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSI_Max_RPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPSI_Max_RPMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the PSI_RPM_Reset of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_RPM_ResetFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_RPM_Reset(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the PSI_Rq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPSI_RqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setPSI_Rq(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PwrtrnHV_IsolStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PWRTRNHV_ISOLSTAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getPwrtrnHV_IsolStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PwrtrnHV_IsolStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerPwrtrnHV_IsolStatChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PwrtrnHV_IsolStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterPwrtrnHV_IsolStatChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RadioTractionControl_Ind from the vehicle.
     * @base PNNAWD
     * @return VALUE_RADIOTRACTIONCONTROL_IND
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getRadioTractionControl_Ind() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RadioTractionControl_Ind.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRadioTractionControl_IndChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RadioTractionControl_Ind.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRadioTractionControl_IndChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ReverseGearStatus from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getReverseGearStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ReverseGearStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerReverseGearStatusChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ReverseGearStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterReverseGearStatusChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RHF_Spin from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_RHF_SPIN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getRHF_Spin() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RHF_Spin.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRHF_SpinChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RHF_Spin.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRHF_SpinChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RHFWheelSpeed from the vehicle.
     * @base ATL - MP
     * @return km/hr
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getRHFWheelSpeed() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RHFWheelSpeed.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRHFWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RHFWheelSpeed.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRHFWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RHR_Spin from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_RHR_SPIN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getRHR_Spin() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RHR_Spin.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRHR_SpinChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RHR_Spin.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRHR_SpinChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RHRWheelSpeed from the vehicle.
     * @base ATL - MP
     * @return km/hr
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getRHRWheelSpeed() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RHRWheelSpeed.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRHRWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RHRWheelSpeed.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRHRWheelSpeedChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RollAngle from the vehicle.
     * @base ATL - MP
     * @return °
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getRollAngle() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RollAngle.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRollAngleChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RollAngle.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRollAngleChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RrLkTrq from the vehicle.
     * @base ATLH - WL
     * @return NM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getRrLkTrq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RrLkTrq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRrLkTrqChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RrLkTrq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRrLkTrqChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the RT_DIST from the vehicle.
     * @base PN - RUPHEV
     * @return cm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getRT_DIST() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RT_DIST.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerRT_DISTChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RT_DIST.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterRT_DISTChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the SHFT_PROG from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SHFT_PROG
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getSHFT_PROG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SHFT_PROG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerSHFT_PROGChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SHFT_PROG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterSHFT_PROGChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the ShiftLeverPositionReq from the vehicle.
     * @base ATL - MP
     * @return VALUE_SHIFT_LEVER_POSITION_REQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getShiftLeverPositionReq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ShiftLeverPositionReq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerShiftLeverPositionReqChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ShiftLeverPositionReq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterShiftLeverPositionReqChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Slope from the vehicle.
     * @base ATL - MP
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getSlope() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Slope.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerSlopeChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Slope.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterSlopeChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the STR_DIR_LT_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getSTR_DIR_LT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to STR_DIR_LT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerSTR_DIR_LT_STATChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to STR_DIR_LT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterSTR_DIR_LT_STATChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TCASE_STAT from the vehicle.
     * @base PN -WD
     * @return VALUE_TCASE_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTCASE_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TCASE_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTCASE_STATChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TCASE_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTCASE_STATChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the TCaseAWD_DrvMdRq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetTCaseAWD_DrvMdRqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setTCaseAWD_DrvMdRq(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the TerrainModeStat_ECM from the vehicle.
     * @base ATLH - WL
     * @return VALUE_TERRAINMODESTAT_ECM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTerrainModeStat_ECM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TerrainModeStat_ECM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTerrainModeStat_ECMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TerrainModeStat_ECM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTerrainModeStat_ECMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TireFL from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TIRE_F_L
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTireFL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TireFL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTireFLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TireFL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTireFLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TireFR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TIRE_F_R
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTireFR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TireFR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTireFRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TireFR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTireFRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TirePressFL from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTirePressFL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TirePressFL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTirePressFLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TirePressFL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTirePressFLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TirePressFR from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTirePressFR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TirePressFR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTirePressFRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TirePressFR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTirePressFRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TirePressRL from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTirePressRL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TirePressRL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTirePressRLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TirePressRL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTirePressRLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TirePressRR from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTirePressRR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TirePressRR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTirePressRRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TirePressRR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTirePressRRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TirePressSpr from the vehicle.
     * @base PN - MASPN
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTirePressSpr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TirePressSpr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTirePressSprChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TirePressSpr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTirePressSprChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TireRL from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TIRE_R_L
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTireRL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TireRL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTireRLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TireRL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTireRLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TireRR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TIRE_R_R
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTireRR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TireRR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTireRRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TireRR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTireRRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TireSpr from the vehicle.
     * @base PN - MASPN
     * @return VALUE_TIRE_SPR
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTireSpr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TireSpr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTireSprChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TireSpr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTireSprChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the TransmissionType from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TRANSMISSION_TYPE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTransmissionType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TransmissionType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTransmissionTypeChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TransmissionType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTransmissionTypeChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Request the Trns_DrvMdReq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetTrns_DrvMdReqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_WRITE_HIGH
     */
    void setTrns_DrvMdReq(int value, FcaIVehicleDriveStatusManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the TYRE_PRESSURE_SYSTEM from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getTYRE_PRESSURE_SYSTEM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TYRE_PRESSURE_SYSTEM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerTYRE_PRESSURE_SYSTEMChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TYRE_PRESSURE_SYSTEM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterTYRE_PRESSURE_SYSTEMChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the UnderSteering from the vehicle.
     * @base ATL - MP
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getUnderSteering() throws PropertyNotSupported;

    /**
     * Registers listening to changes to UnderSteering.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerUnderSteeringChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to UnderSteering.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterUnderSteeringChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehAccel_X from the vehicle.
     * @base PN - RUPHEV
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehAccel_X() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehAccel_X.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehAccel_XChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehAccel_X.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehAccel_XChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehAccel_X_Offset from the vehicle.
     * @base PN - RUPHEV
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehAccel_X_Offset() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehAccel_X_Offset.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehAccel_X_OffsetChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehAccel_X_Offset.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehAccel_X_OffsetChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehAccel_Y from the vehicle.
     * @base PN - RUPHEV
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehAccel_Y() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehAccel_Y.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehAccel_YChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehAccel_Y.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehAccel_YChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehAccel_Y_Offset from the vehicle.
     * @base PN - RUPHEV
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehAccel_Y_Offset() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehAccel_Y_Offset.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehAccel_Y_OffsetChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehAccel_Y_Offset.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehAccel_Y_OffsetChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehPerfAccel_X from the vehicle.
     * @base WD Only
     * @return m/s^2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehPerfAccel_X() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehPerfAccel_X.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehPerfAccel_XChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehPerfAccel_X.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehPerfAccel_XChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehPerfAccel_Y from the vehicle.
     * @base WD Only
     * @return m/s^2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehPerfAccel_Y() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehPerfAccel_Y.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehPerfAccel_YChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehPerfAccel_Y.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehPerfAccel_YChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehPerfAccelPeak_X_Neg from the vehicle.
     * @base PN -WD
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehPerfAccelPeak_X_Neg() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehPerfAccelPeak_X_Neg.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehPerfAccelPeak_X_NegChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehPerfAccelPeak_X_Neg.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehPerfAccelPeak_X_NegChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehPerfAccelPeak_X_Pos from the vehicle.
     * @base PN -WD
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehPerfAccelPeak_X_Pos() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehPerfAccelPeak_X_Pos.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehPerfAccelPeak_X_PosChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehPerfAccelPeak_X_Pos.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehPerfAccelPeak_X_PosChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehPerfAccelPeak_Y_Neg from the vehicle.
     * @base PN -WD
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehPerfAccelPeak_Y_Neg() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehPerfAccelPeak_Y_Neg.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehPerfAccelPeak_Y_NegChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehPerfAccelPeak_Y_Neg.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehPerfAccelPeak_Y_NegChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehPerfAccelPeak_Y_Pos from the vehicle.
     * @base PN -WD
     * @return m/s²
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getVehPerfAccelPeak_Y_Pos() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehPerfAccelPeak_Y_Pos.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehPerfAccelPeak_Y_PosChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehPerfAccelPeak_Y_Pos.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehPerfAccelPeak_Y_PosChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the VehSpdDisp from the vehicle.
     * @base PN - RUPHEV
     * @return Speed Units
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getVehSpdDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VehSpdDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerVehSpdDispChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VehSpdDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterVehSpdDispChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlPlsCnt_FL from the vehicle.
     * @base PN - RUPHEV
     * @return Impulse
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getWhlPlsCnt_FL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlPlsCnt_FL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlPlsCnt_FLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlPlsCnt_FL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlPlsCnt_FLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlPlsCnt_FR from the vehicle.
     * @base PN - RUPHEV
     * @return Impulse
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getWhlPlsCnt_FR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlPlsCnt_FR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlPlsCnt_FRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlPlsCnt_FR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlPlsCnt_FRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlPlsCnt_RL from the vehicle.
     * @base PN - RUPHEV
     * @return Impulse
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getWhlPlsCnt_RL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlPlsCnt_RL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlPlsCnt_RLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlPlsCnt_RL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlPlsCnt_RLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlPlsCnt_RR from the vehicle.
     * @base PN - RUPHEV
     * @return Impulse
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getWhlPlsCnt_RR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlPlsCnt_RR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlPlsCnt_RRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlPlsCnt_RR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlPlsCnt_RRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlRPM_FL from the vehicle.
     * @base PN - RUPHEV
     * @return RPM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getWhlRPM_FL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlRPM_FL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlRPM_FLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlRPM_FL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlRPM_FLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlRPM_FR from the vehicle.
     * @base PN - RUPHEV
     * @return RPM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getWhlRPM_FR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlRPM_FR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlRPM_FRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlRPM_FR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlRPM_FRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlRPM_RL from the vehicle.
     * @base PN - RUPHEV
     * @return RPM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getWhlRPM_RL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlRPM_RL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlRPM_RLChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlRPM_RL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlRPM_RLChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the WhlRPM_RR from the vehicle.
     * @base PN - RUPHEV
     * @return RPM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getWhlRPM_RR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WhlRPM_RR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerWhlRPM_RRChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WhlRPM_RR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterWhlRPM_RRChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the YawRate from the vehicle.
     * @base PN - RUPHEV
     * @return °/s
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    float getYawRate() throws PropertyNotSupported;

    /**
     * Registers listening to changes to YawRate.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerYawRateChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to YawRate.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterYawRateChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Gets the Zacceleration from the vehicle.
     * @base ATL - MP
     * @return m/s^2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    int getZacceleration() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Zacceleration.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean registerZaccelerationChange(FcaIVehicleDriveStatusManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Zacceleration.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHDRIVESTATUS_READ_HIGH
     */
    boolean unregisterZaccelerationChange(FcaIVehicleDriveStatusManagerCallback callback);

    /**
     * Callback interface to register IVehicleDriveStatusManager against.
     */
    public interface FcaIVehicleDriveStatusManagerCallback {
        default void onAccelPdlPosnChange(float value) { }
        default void onActlAccelPdlPosnChange(float value) { }
        default void onADC_StatChange(int value) { }
        default void onASCM_HMI_StatChange(int value) { }
        default void onASCM_StatChange(int value) { }
        default void onAvg_Fuel_EconChange(float value) { }
        default void onAvgFuelEconChange(float value) { }
        default void onBrakeFluidChange(int value) { }
        default void onBrkPrss_TMCChange(float value) { }
        default void onDRIVE_STYLE_SELECTORChange(int value) { }
        default void onDriveStyleStsChange(int value) { }
        default void onDrvMdHMI_3Change(int value) { }
        default void onDrvMdHMI_4Change(int value) { }
        default void onDrvRqShftROTChange(int value) { }
        default void onSetDsbl_Loss_Of_ComFailed() { }
        default void onEconShftRqChange(int value) { }
        default void onSetEModeSwPsdFailed() { }
        default void onEngineRPMChange(int value) { }
        default void onEPBHoldStsChange(int value) { }
        default void onEPS_MODE_STATChange(int value) { }
        default void onESS_ENG_STChange(int value) { }
        default void onFt_RrCouplingTrq_ActualChange(int value) { }
        default void onFt_RrCouplingTrq_DesiredChange(int value) { }
        default void onFtAxlePrcntgAWDChange(int value) { }
        default void onFuelLevelChange(int value) { }
        default void onSetGlobDrvMdRqFailed() { }
        default void onGlobDrvMdStsChange(int value) { }
        default void onGr_TargetChange(int value) { }
        default void onHDCUserFdBckChange(int value) { }
        default void onHILL_DES_STATChange(int value) { }
        default void onHybridDriveModeStsChange(int value) { }
        default void onInst_Fuel_EconChange(float value) { }
        default void onInstantaneousFuelConsumption1Change(int value) { }
        default void onInstantaneousFuelConsumption2Change(int value) { }
        default void onInstantaneousFuelConsumption3Change(int value) { }
        default void onKeyInIgnChange(int value) { }
        default void onLatAccelerationChange(float value) { }
        default void onSetLaunch_RPM_Selected_Setting2Failed() { }
        default void onLaunchRPMsetting2_ESCChange(int value) { }
        default void onLHF_SpinChange(int value) { }
        default void onLHFWheelSpeedChange(float value) { }
        default void onLHR_SpinChange(int value) { }
        default void onLHRWheelSpeedChange(float value) { }
        default void onLongAccelerationChange(float value) { }
        default void onLT_DISTChange(int value) { }
        default void onLwsSpeedChange(int value) { }
        default void onOverSteeringChange(int value) { }
        default void onSetPaddlesModeReqFailed() { }
        default void onPARK_BRAKE_STATChange(int value) { }
        default void onPARK_BRK_EGDChange(int value) { }
        default void onPitchAngleChange(int value) { }
        default void onPRND_STATChange(int value) { }
        default void onPRNDL_DISPChange(int value) { }
        default void onPSI_EnableStsChange(int value) { }
        default void onPSI_Gr1_RPMChange(int value) { }
        default void onSetPSI_Gr1_RPM_SETFailed() { }
        default void onPSI_Gr2_RPMChange(int value) { }
        default void onSetPSI_Gr2_RPM_SETFailed() { }
        default void onPSI_Gr3_RPMChange(int value) { }
        default void onSetPSI_Gr3_RPM_SETFailed() { }
        default void onPSI_Gr4_RPMChange(int value) { }
        default void onSetPSI_Gr4_RPM_SETFailed() { }
        default void onPSI_Gr5_RPMChange(int value) { }
        default void onSetPSI_Gr5_RPM_SETFailed() { }
        default void onPSI_Max_RPMChange(int value) { }
        default void onSetPSI_RPM_ResetFailed() { }
        default void onSetPSI_RqFailed() { }
        default void onPwrtrnHV_IsolStatChange(int value) { }
        default void onRadioTractionControl_IndChange(int value) { }
        default void onReverseGearStatusChange(int value) { }
        default void onRHF_SpinChange(int value) { }
        default void onRHFWheelSpeedChange(float value) { }
        default void onRHR_SpinChange(int value) { }
        default void onRHRWheelSpeedChange(float value) { }
        default void onRollAngleChange(int value) { }
        default void onRrLkTrqChange(int value) { }
        default void onRT_DISTChange(int value) { }
        default void onSHFT_PROGChange(int value) { }
        default void onShiftLeverPositionReqChange(int value) { }
        default void onSlopeChange(int value) { }
        default void onSTR_DIR_LT_STATChange(int value) { }
        default void onTCASE_STATChange(int value) { }
        default void onSetTCaseAWD_DrvMdRqFailed() { }
        default void onTerrainModeStat_ECMChange(int value) { }
        default void onTireFLChange(int value) { }
        default void onTireFRChange(int value) { }
        default void onTirePressFLChange(int value) { }
        default void onTirePressFRChange(int value) { }
        default void onTirePressRLChange(int value) { }
        default void onTirePressRRChange(int value) { }
        default void onTirePressSprChange(int value) { }
        default void onTireRLChange(int value) { }
        default void onTireRRChange(int value) { }
        default void onTireSprChange(int value) { }
        default void onTransmissionTypeChange(int value) { }
        default void onSetTrns_DrvMdReqFailed() { }
        default void onTYRE_PRESSURE_SYSTEMChange(int value) { }
        default void onUnderSteeringChange(int value) { }
        default void onVehAccel_XChange(float value) { }
        default void onVehAccel_X_OffsetChange(float value) { }
        default void onVehAccel_YChange(float value) { }
        default void onVehAccel_Y_OffsetChange(float value) { }
        default void onVehPerfAccel_XChange(float value) { }
        default void onVehPerfAccel_YChange(float value) { }
        default void onVehPerfAccelPeak_X_NegChange(float value) { }
        default void onVehPerfAccelPeak_X_PosChange(float value) { }
        default void onVehPerfAccelPeak_Y_NegChange(float value) { }
        default void onVehPerfAccelPeak_Y_PosChange(float value) { }
        default void onVehSpdDispChange(int value) { }
        default void onWhlPlsCnt_FLChange(int value) { }
        default void onWhlPlsCnt_FRChange(int value) { }
        default void onWhlPlsCnt_RLChange(int value) { }
        default void onWhlPlsCnt_RRChange(int value) { }
        default void onWhlRPM_FLChange(float value) { }
        default void onWhlRPM_FRChange(float value) { }
        default void onWhlRPM_RLChange(float value) { }
        default void onWhlRPM_RRChange(float value) { }
        default void onYawRateChange(float value) { }
        default void onZaccelerationChange(int value) { }
    }
}
