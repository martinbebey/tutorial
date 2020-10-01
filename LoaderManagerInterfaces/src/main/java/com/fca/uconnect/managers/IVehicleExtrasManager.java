package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleExtrasManager
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
public interface IVehicleExtrasManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_CMP_DIR_CMP_N   = 0;
    public static final int VALUE_CMP_DIR_CMP_N_E = 1;
    public static final int VALUE_CMP_DIR_CMP_E   = 2;
    public static final int VALUE_CMP_DIR_CMP_S_E = 3;
    public static final int VALUE_CMP_DIR_CMP_S   = 4;
    public static final int VALUE_CMP_DIR_CMP_S_W = 5;
    public static final int VALUE_CMP_DIR_CMP_W   = 6;
    public static final int VALUE_CMP_DIR_CMP_N_W = 7;
    public static final int VALUE_CMP_DIR_NONE    = 8;
    public static final int VALUE_CMP_DIR_SNA     = 15;

    public static final int VALUE_DOOR_LOCK_STATUS_LKD          = 0;
    public static final int VALUE_DOOR_LOCK_STATUS_DRV_DR_UNLKD = 1;
    public static final int VALUE_DOOR_LOCK_STATUS_ALL_DR_UNLKD = 2;
    public static final int VALUE_DOOR_LOCK_STATUS_SNA          = 3;

    public static final int VALUE_DOORS_STAT_OFF   = 0;
    public static final int VALUE_DOORS_STAT_CONT  = 1;
    public static final int VALUE_DOORS_STAT_BLINK = 2;
    public static final int VALUE_DOORS_STAT_SNA   = 3;

    public static final int VALUE_HIBMLVR_STAT_IDLE             = 0;
    public static final int VALUE_HIBMLVR_STAT_HIBM_ON_PSD      = 1;
    public static final int VALUE_HIBMLVR_STAT_HIBM_FLSH_ON_PSD = 2;

    public static final int VALUE_ITBM_BRKSTYLE_LT_ELECT = 0;
    public static final int VALUE_ITBM_BRKSTYLE_HV_ELECT = 1;
    public static final int VALUE_ITBM_BRKSTYLE_LT_EOH   = 2;
    public static final int VALUE_ITBM_BRKSTYLE_HV_EOH   = 3;

    public static final int VALUE_ITBM_TRLRSTAT_NO_TRLR    = 0;
    public static final int VALUE_ITBM_TRLRSTAT_TRLR_PRSNT = 1;
    public static final int VALUE_ITBM_TRLRSTAT_TRLR_DCONN = 2;
    public static final int VALUE_ITBM_TRLRSTAT_SNA        = 3;

    public static final int VALUE_L_R_REQ_PE_NO_REQ      = 0;
    public static final int VALUE_L_R_REQ_PE_HNDL_PE_REQ = 1;
    public static final int VALUE_L_R_REQ_PE_BTN_PE_REQ  = 2;
    public static final int VALUE_L_R_REQ_PE_HF_PE_REQ   = 3;

    public static final int VALUE_LRWS_ST_OK      = 0;
    public static final int VALUE_LRWS_ST_INI     = 1;
    public static final int VALUE_LRWS_ST_ERR     = 2;
    public static final int VALUE_LRWS_ST_ERR_INI = 3;

    public static final int VALUE_MEM_D_POS_RQ_NOT_PRESSED     = 0;
    public static final int VALUE_MEM_D_POS_RQ_MEMPOS1_PRESSED = 1;
    public static final int VALUE_MEM_D_POS_RQ_MEMPOS2_PRESSED = 2;
    public static final int VALUE_MEM_D_POS_RQ_SNA             = 3;

    public static final int VALUE_MEM_D_RC_RQ_NOT_PRESSED = 0;
    public static final int VALUE_MEM_D_RC_RQ_PRESSED     = 1;

    public static final int VALUE_MEM_D_SV_RQ_NOT_PRESSED = 0;
    public static final int VALUE_MEM_D_SV_RQ_PRESSED     = 1;

    public static final int VALUE_MIRRFLD_RQ_P_IDLE    = 0;
    public static final int VALUE_MIRRFLD_RQ_P_EXTEND  = 1;
    public static final int VALUE_MIRRFLD_RQ_P_RETRACT = 2;

    public static final int VALUE_PADDLES_MODE_STS_NONE = 0;
    public static final int VALUE_PADDLES_MODE_STS_DIS  = 1;
    public static final int VALUE_PADDLES_MODE_STS_EN   = 2;
    public static final int VALUE_PADDLES_MODE_STS_SNA  = 3;

    public static final int VALUE_PSD_LT_DRSTAT_MAN        = 0;
    public static final int VALUE_PSD_LT_DRSTAT_PWR_OPEN   = 1;
    public static final int VALUE_PSD_LT_DRSTAT_PWR_CLS    = 2;
    public static final int VALUE_PSD_LT_DRSTAT_MAN_OPEN   = 3;
    public static final int VALUE_PSD_LT_DRSTAT_MAN_CLS    = 4;
    public static final int VALUE_PSD_LT_DRSTAT_FULLY_OPEN = 5;
    public static final int VALUE_PSD_LT_DRSTAT_FULLY_CLS  = 6;
    public static final int VALUE_PSD_LT_DRSTAT_REV_OPEN   = 7;
    public static final int VALUE_PSD_LT_DRSTAT_REV_CLS    = 8;
    public static final int VALUE_PSD_LT_DRSTAT_DR_FAIL    = 11;
    public static final int VALUE_PSD_LT_DRSTAT_SNA        = 15;

    public static final int VALUE_PSD_RT_DRSTAT_MAN        = 0;
    public static final int VALUE_PSD_RT_DRSTAT_PWR_OPEN   = 1;
    public static final int VALUE_PSD_RT_DRSTAT_PWR_CLS    = 2;
    public static final int VALUE_PSD_RT_DRSTAT_MAN_OPEN   = 3;
    public static final int VALUE_PSD_RT_DRSTAT_MAN_CLS    = 4;
    public static final int VALUE_PSD_RT_DRSTAT_FULLY_OPEN = 5;
    public static final int VALUE_PSD_RT_DRSTAT_FULLY_CLS  = 6;
    public static final int VALUE_PSD_RT_DRSTAT_REV_OPEN   = 7;
    public static final int VALUE_PSD_RT_DRSTAT_REV_CLS    = 8;
    public static final int VALUE_PSD_RT_DRSTAT_DR_FAIL    = 11;
    public static final int VALUE_PSD_RT_DRSTAT_SNA        = 15;

    public static final int VALUE_PSG_ODS_STAT_ODS_STAT_NOCC = 0;
    public static final int VALUE_PSG_ODS_STAT_ODS_STAT_OCC  = 1;
    public static final int VALUE_PSG_ODS_STAT_ODS_FAULT     = 2;
    public static final int VALUE_PSG_ODS_STAT_SNA           = 3;

    public static final int VALUE_STEERING_WHEEL_ANGLE_SNA = 2147483647;

    public static final int VALUE_TRK_OPN_STAT_OFF   = 0;
    public static final int VALUE_TRK_OPN_STAT_CONT  = 1;
    public static final int VALUE_TRK_OPN_STAT_BLINK = 2;
    public static final int VALUE_TRK_OPN_STAT_SNA   = 3;

    public static final int VALUE_TURNINDLVR_STAT_IDLE  = 0;
    public static final int VALUE_TURNINDLVR_STAT_LEFT  = 1;
    public static final int VALUE_TURNINDLVR_STAT_RIGHT = 2;

    public static final int VALUE_WPR_SW6_POSN_OFF       = 0;
    public static final int VALUE_WPR_SW6_POSN_INTERVAL1 = 1;
    public static final int VALUE_WPR_SW6_POSN_INTERVAL2 = 2;
    public static final int VALUE_WPR_SW6_POSN_INTERVAL3 = 3;
    public static final int VALUE_WPR_SW6_POSN_INTERVAL4 = 4;
    public static final int VALUE_WPR_SW6_POSN_INTERVAL5 = 5;
    public static final int VALUE_WPR_SW6_POSN_INTERVAL6 = 6;
    public static final int VALUE_WPR_SW6_POSN_WPR_LOW   = 7;
    public static final int VALUE_WPR_SW6_POSN_WPR_HI    = 8;
    public static final int VALUE_WPR_SW6_POSN_SNA       = 15;

    public static final int VALUE_WPRWASH_R_SW_POSN_V3_OFF          = 0;
    public static final int VALUE_WPRWASH_R_SW_POSN_V3_INTERMITTENT = 1;
    public static final int VALUE_WPRWASH_R_SW_POSN_V3_WASH         = 2;
    public static final int VALUE_WPRWASH_R_SW_POSN_V3_CONSTANT     = 3;

    public static final int VALUE_WPRWASHSW_PSD_NPSD = 0;
    public static final int VALUE_WPRWASHSW_PSD_MIST = 1;
    public static final int VALUE_WPRWASHSW_PSD_WASH = 2;

    /**
     * Gets the CMP_DIR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_CMP_DIR
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getCMP_DIR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CMP_DIR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerCMP_DIRChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CMP_DIR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterCMP_DIRChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the DoorLockStatus from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_DOOR_LOCK_STATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getDoorLockStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DoorLockStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerDoorLockStatusChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DoorLockStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterDoorLockStatusChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the DOORS_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_DOORS_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getDOORS_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DOORS_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerDOORS_STATChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DOORS_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterDOORS_STATChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the DR_LKD from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getDR_LKD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DR_LKD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerDR_LKDChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DR_LKD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterDR_LKDChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the ExteriorRearReleaseSwitchSts from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getExteriorRearReleaseSwitchSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ExteriorRearReleaseSwitchSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerExteriorRearReleaseSwitchStsChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ExteriorRearReleaseSwitchSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterExteriorRearReleaseSwitchStsChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the FrontLeftLevel from the vehicle.
     * @base PN - MASPN
     * @return mm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getFrontLeftLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FrontLeftLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerFrontLeftLevelChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FrontLeftLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterFrontLeftLevelChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the FrontRightLevel from the vehicle.
     * @base PN - MASPN
     * @return mm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getFrontRightLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FrontRightLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerFrontRightLevelChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FrontRightLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterFrontRightLevelChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the HIBEAM_ON from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getHIBEAM_ON() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HIBEAM_ON.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerHIBEAM_ONChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HIBEAM_ON.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterHIBEAM_ONChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the HiBmLvr_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_HIBMLVR_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getHiBmLvr_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HiBmLvr_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerHiBmLvr_StatChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HiBmLvr_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterHiBmLvr_StatChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the HOOD_AJAR_STATUS from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getHOOD_AJAR_STATUS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HOOD_AJAR_STATUS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerHOOD_AJAR_STATUSChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HOOD_AJAR_STATUS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterHOOD_AJAR_STATUSChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the ITBM_BrkStyle from the vehicle.
     * @base PN -WD
     * @return VALUE_ITBM_BRKSTYLE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getITBM_BrkStyle() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ITBM_BrkStyle.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerITBM_BrkStyleChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ITBM_BrkStyle.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterITBM_BrkStyleChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the ITBM_GAIN_STAT from the vehicle.
     * @base PN -WD
     * @return Gain
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    float getITBM_GAIN_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ITBM_GAIN_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerITBM_GAIN_STATChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ITBM_GAIN_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterITBM_GAIN_STATChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the ITBM_TrlrStat from the vehicle.
     * @base PN -WD
     * @return VALUE_ITBM_TRLRSTAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getITBM_TrlrStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ITBM_TrlrStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerITBM_TrlrStatChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ITBM_TrlrStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterITBM_TrlrStatChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the L_R_AJAR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getL_R_AJAR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to L_R_AJAR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerL_R_AJARChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to L_R_AJAR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterL_R_AJARChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the L_R_Req_PE from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_L_R_REQ_PE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getL_R_Req_PE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to L_R_Req_PE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerL_R_Req_PEChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to L_R_Req_PE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterL_R_Req_PEChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the LRW_PLRTY from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getLRW_PLRTY() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LRW_PLRTY.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerLRW_PLRTYChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LRW_PLRTY.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterLRW_PLRTYChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the LRWS_ST from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_LRWS_ST
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getLRWS_ST() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LRWS_ST.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerLRWS_STChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LRWS_ST.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterLRWS_STChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the Mem_D_Pos_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_MEM_D_POS_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMem_D_Pos_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Mem_D_Pos_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMem_D_Pos_RqChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Mem_D_Pos_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMem_D_Pos_RqChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the Mem_D_Rc_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_MEM_D_RC_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMem_D_Rc_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Mem_D_Rc_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMem_D_Rc_RqChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Mem_D_Rc_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMem_D_Rc_RqChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the Mem_D_Sv_Rq from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_MEM_D_SV_RQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMem_D_Sv_Rq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Mem_D_Sv_Rq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMem_D_Sv_RqChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Mem_D_Sv_Rq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMem_D_Sv_RqChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the MirrAdj_P_Dn from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMirrAdj_P_Dn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MirrAdj_P_Dn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMirrAdj_P_DnChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MirrAdj_P_Dn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMirrAdj_P_DnChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the MirrAdj_P_Lt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMirrAdj_P_Lt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MirrAdj_P_Lt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMirrAdj_P_LtChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MirrAdj_P_Lt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMirrAdj_P_LtChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the MirrAdj_P_Rt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMirrAdj_P_Rt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MirrAdj_P_Rt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMirrAdj_P_RtChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MirrAdj_P_Rt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMirrAdj_P_RtChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the MirrAdj_P_Up from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMirrAdj_P_Up() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MirrAdj_P_Up.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMirrAdj_P_UpChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MirrAdj_P_Up.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMirrAdj_P_UpChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the MirrFld_Rq_P from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_MIRRFLD_RQ_P
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getMirrFld_Rq_P() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MirrFld_Rq_P.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMirrFld_Rq_PChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MirrFld_Rq_P.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMirrFld_Rq_PChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the MOOD_LGT_INTS from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    float getMOOD_LGT_INTS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MOOD_LGT_INTS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerMOOD_LGT_INTSChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MOOD_LGT_INTS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterMOOD_LGT_INTSChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the PaddlesModeSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_PADDLES_MODE_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getPaddlesModeSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PaddlesModeSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerPaddlesModeStsChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PaddlesModeSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterPaddlesModeStsChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the PANEL_INTS from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    float getPANEL_INTS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PANEL_INTS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerPANEL_INTSChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PANEL_INTS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterPANEL_INTSChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the Pass_Door_Ajar_Status from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getPass_Door_Ajar_Status() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Pass_Door_Ajar_Status.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerPass_Door_Ajar_StatusChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Pass_Door_Ajar_Status.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterPass_Door_Ajar_StatusChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the PSD_LT_DrStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PSD_LT_DRSTAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getPSD_LT_DrStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSD_LT_DrStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerPSD_LT_DrStatChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSD_LT_DrStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterPSD_LT_DrStatChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the PSD_RT_DrStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PSD_RT_DRSTAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getPSD_RT_DrStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSD_RT_DrStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerPSD_RT_DrStatChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSD_RT_DrStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterPSD_RT_DrStatChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the PSG_ODS_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PSG_ODS_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getPSG_ODS_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PSG_ODS_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerPSG_ODS_STATChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PSG_ODS_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterPSG_ODS_STATChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the R_R_AJAR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getR_R_AJAR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to R_R_AJAR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerR_R_AJARChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to R_R_AJAR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterR_R_AJARChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the RearLeftLevel from the vehicle.
     * @base PN - MASPN
     * @return mm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getRearLeftLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RearLeftLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerRearLeftLevelChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RearLeftLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterRearLeftLevelChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the RearRightLevel from the vehicle.
     * @base PN - MASPN
     * @return mm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getRearRightLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RearRightLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerRearRightLevelChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RearRightLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterRearRightLevelChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the RR_DR_UNLKD from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getRR_DR_UNLKD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RR_DR_UNLKD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerRR_DR_UNLKDChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RR_DR_UNLKD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterRR_DR_UNLKDChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the SD_LO_Status from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getSD_LO_Status() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SD_LO_Status.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerSD_LO_StatusChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SD_LO_Status.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterSD_LO_StatusChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the SEAT_BELT_STAT from the vehicle.
     * @base ATL - MP
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getSEAT_BELT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SEAT_BELT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerSEAT_BELT_STATChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SEAT_BELT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterSEAT_BELT_STATChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the SteeringWheelAngle from the vehicle.
     * @base PN - RUPHEV
     * @return Degrees
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    float getSteeringWheelAngle() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SteeringWheelAngle.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerSteeringWheelAngleChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SteeringWheelAngle.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterSteeringWheelAngleChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the TLG_AJAR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getTLG_AJAR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TLG_AJAR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerTLG_AJARChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TLG_AJAR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterTLG_AJARChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the TRK_OPN_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_TRK_OPN_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getTRK_OPN_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TRK_OPN_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerTRK_OPN_STATChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TRK_OPN_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterTRK_OPN_STATChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the TurnInd_LT_ON from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getTurnInd_LT_ON() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TurnInd_LT_ON.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerTurnInd_LT_ONChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TurnInd_LT_ON.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterTurnInd_LT_ONChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the TurnInd_RT_ON from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getTurnInd_RT_ON() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TurnInd_RT_ON.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerTurnInd_RT_ONChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TurnInd_RT_ON.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterTurnInd_RT_ONChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the TurnIndLvr_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TURNINDLVR_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getTurnIndLvr_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TurnIndLvr_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerTurnIndLvr_StatChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TurnIndLvr_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterTurnIndLvr_StatChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WinPos_D_Sts from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWinPos_D_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WinPos_D_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWinPos_D_StsChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WinPos_D_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWinPos_D_StsChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WinPos_P_Sts from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWinPos_P_Sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WinPos_P_Sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWinPos_P_StsChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WinPos_P_Sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWinPos_P_StsChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WPR_SYS_HIGH from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWPR_SYS_HIGH() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WPR_SYS_HIGH.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWPR_SYS_HIGHChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WPR_SYS_HIGH.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWPR_SYS_HIGHChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WPR_SYS_INT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWPR_SYS_INT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WPR_SYS_INT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWPR_SYS_INTChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WPR_SYS_INT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWPR_SYS_INTChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WPR_SYS_LOW from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWPR_SYS_LOW() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WPR_SYS_LOW.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWPR_SYS_LOWChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WPR_SYS_LOW.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWPR_SYS_LOWChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WPR_SYS_MIST from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWPR_SYS_MIST() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WPR_SYS_MIST.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWPR_SYS_MISTChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WPR_SYS_MIST.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWPR_SYS_MISTChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WPR_SYS_OFF from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWPR_SYS_OFF() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WPR_SYS_OFF.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWPR_SYS_OFFChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WPR_SYS_OFF.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWPR_SYS_OFFChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WPR_SYS_WASH from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWPR_SYS_WASH() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WPR_SYS_WASH.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWPR_SYS_WASHChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WPR_SYS_WASH.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWPR_SYS_WASHChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WprSw6Posn from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_WPR_SW6_POSN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWprSw6Posn() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WprSw6Posn.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWprSw6PosnChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WprSw6Posn.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWprSw6PosnChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WprWash_R_Sw_Posn_V3 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_WPRWASH_R_SW_POSN_V3
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWprWash_R_Sw_Posn_V3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WprWash_R_Sw_Posn_V3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWprWash_R_Sw_Posn_V3Change(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WprWash_R_Sw_Posn_V3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWprWash_R_Sw_Posn_V3Change(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Gets the WprWashSw_Psd from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_WPRWASHSW_PSD
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    int getWprWashSw_Psd() throws PropertyNotSupported;

    /**
     * Registers listening to changes to WprWashSw_Psd.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean registerWprWashSw_PsdChange(FcaIVehicleExtrasManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to WprWashSw_Psd.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHEXTRAS_READ_HIGH
     */
    boolean unregisterWprWashSw_PsdChange(FcaIVehicleExtrasManagerCallback callback);

    /**
     * Callback interface to register IVehicleExtrasManager against.
     */
    public interface FcaIVehicleExtrasManagerCallback {
        default void onCMP_DIRChange(int value) { }
        default void onDoorLockStatusChange(int value) { }
        default void onDOORS_STATChange(int value) { }
        default void onDR_LKDChange(int value) { }
        default void onExteriorRearReleaseSwitchStsChange(int value) { }
        default void onFrontLeftLevelChange(int value) { }
        default void onFrontRightLevelChange(int value) { }
        default void onHIBEAM_ONChange(int value) { }
        default void onHiBmLvr_StatChange(int value) { }
        default void onHOOD_AJAR_STATUSChange(int value) { }
        default void onITBM_BrkStyleChange(int value) { }
        default void onITBM_GAIN_STATChange(float value) { }
        default void onITBM_TrlrStatChange(int value) { }
        default void onL_R_AJARChange(int value) { }
        default void onL_R_Req_PEChange(int value) { }
        default void onLRW_PLRTYChange(int value) { }
        default void onLRWS_STChange(int value) { }
        default void onMem_D_Pos_RqChange(int value) { }
        default void onMem_D_Rc_RqChange(int value) { }
        default void onMem_D_Sv_RqChange(int value) { }
        default void onMirrAdj_P_DnChange(int value) { }
        default void onMirrAdj_P_LtChange(int value) { }
        default void onMirrAdj_P_RtChange(int value) { }
        default void onMirrAdj_P_UpChange(int value) { }
        default void onMirrFld_Rq_PChange(int value) { }
        default void onMOOD_LGT_INTSChange(float value) { }
        default void onPaddlesModeStsChange(int value) { }
        default void onPANEL_INTSChange(float value) { }
        default void onPass_Door_Ajar_StatusChange(int value) { }
        default void onPSD_LT_DrStatChange(int value) { }
        default void onPSD_RT_DrStatChange(int value) { }
        default void onPSG_ODS_STATChange(int value) { }
        default void onR_R_AJARChange(int value) { }
        default void onRearLeftLevelChange(int value) { }
        default void onRearRightLevelChange(int value) { }
        default void onRR_DR_UNLKDChange(int value) { }
        default void onSD_LO_StatusChange(int value) { }
        default void onSEAT_BELT_STATChange(int value) { }
        default void onSteeringWheelAngleChange(float value) { }
        default void onTLG_AJARChange(int value) { }
        default void onTRK_OPN_STATChange(int value) { }
        default void onTurnInd_LT_ONChange(int value) { }
        default void onTurnInd_RT_ONChange(int value) { }
        default void onTurnIndLvr_StatChange(int value) { }
        default void onWinPos_D_StsChange(int value) { }
        default void onWinPos_P_StsChange(int value) { }
        default void onWPR_SYS_HIGHChange(int value) { }
        default void onWPR_SYS_INTChange(int value) { }
        default void onWPR_SYS_LOWChange(int value) { }
        default void onWPR_SYS_MISTChange(int value) { }
        default void onWPR_SYS_OFFChange(int value) { }
        default void onWPR_SYS_WASHChange(int value) { }
        default void onWprSw6PosnChange(int value) { }
        default void onWprWash_R_Sw_Posn_V3Change(int value) { }
        default void onWprWashSw_PsdChange(int value) { }
    }
}
