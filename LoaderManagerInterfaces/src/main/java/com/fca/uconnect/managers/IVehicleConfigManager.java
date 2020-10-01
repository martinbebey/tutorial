package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleConfigManager
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
public interface IVehicleConfigManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_ADC_DRVMD_CFGSTS_MODE_1 = 0;
    public static final int VALUE_ADC_DRVMD_CFGSTS_MODE_2 = 1;
    public static final int VALUE_ADC_DRVMD_CFGSTS_MODE_3 = 2;
    public static final int VALUE_ADC_DRVMD_CFGSTS_SNA    = 3;

    public static final int VALUE_AUTOSHOW_OFF_RD_OFF                   = 0;
    public static final int VALUE_AUTOSHOW_OFF_RD_FORWARD_FACING_CAMERA = 1;
    public static final int VALUE_AUTOSHOW_OFF_RD_NONE                  = 2;

    public static final int VALUE_ENG_DRV_MD_STAT_NORMAL     = 0;
    public static final int VALUE_ENG_DRV_MD_STAT_ECO        = 1;
    public static final int VALUE_ENG_DRV_MD_STAT_SPORT      = 2;
    public static final int VALUE_ENG_DRV_MD_STAT_TRACK      = 3;
    public static final int VALUE_ENG_DRV_MD_STAT_SPORT_PLUS = 4;
    public static final int VALUE_ENG_DRV_MD_STAT_SNA        = 7;

    public static final int VALUE_EPS_DRVMD_CFGSTS_MODE_1 = 0;
    public static final int VALUE_EPS_DRVMD_CFGSTS_MODE_2 = 1;
    public static final int VALUE_EPS_DRVMD_CFGSTS_MODE_3 = 2;
    public static final int VALUE_EPS_DRVMD_CFGSTS_LAST   = 3;
    public static final int VALUE_EPS_DRVMD_CFGSTS_SNA    = 7;

    public static final int VALUE_ESC_DRVMD_CFGSTS_STREET = 0;
    public static final int VALUE_ESC_DRVMD_CFGSTS_SPORT  = 1;
    public static final int VALUE_ESC_DRVMD_CFGSTS_TRACK  = 2;
    public static final int VALUE_ESC_DRVMD_CFGSTS_OFF    = 3;
    public static final int VALUE_ESC_DRVMD_CFGSTS_SNOW   = 4;
    public static final int VALUE_ESC_DRVMD_CFGSTS_SNA    = 7;

    public static final int VALUE_HP_DRVMD_CFGSTS_NONE  = 0;
    public static final int VALUE_HP_DRVMD_CFGSTS_VALET = 1;
    public static final int VALUE_HP_DRVMD_CFGSTS_BLACK = 2;
    public static final int VALUE_HP_DRVMD_CFGSTS_RED   = 3;
    public static final int VALUE_HP_DRVMD_CFGSTS_SNA   = 7;

    public static final int VALUE_PADDLES_DRVMD_CFGSTS_NONE = 0;
    public static final int VALUE_PADDLES_DRVMD_CFGSTS_DIS  = 1;
    public static final int VALUE_PADDLES_DRVMD_CFGSTS_EN   = 2;
    public static final int VALUE_PADDLES_DRVMD_CFGSTS_SNA  = 3;

    public static final int VALUE_PS_SYSTYPE_EHPS = 0;
    public static final int VALUE_PS_SYSTYPE_EPS  = 1;

    public static final int VALUE_STEERING_RATIO_RACK_PINION_TYPE_TYPE_1 = 0;
    public static final int VALUE_STEERING_RATIO_RACK_PINION_TYPE_TYPE_2 = 1;
    public static final int VALUE_STEERING_RATIO_RACK_PINION_TYPE_TYPE_3 = 2;

    public static final int VALUE_TERAWD_DRVMD_CFGSTS_AUTO     = 0;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_TRACK    = 1;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_ROCK     = 2;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_TOW      = 3;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_SNOW     = 4;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_NORMAL   = 5;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_I_C_E    = 6;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_ALL_ROAD = 7;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_SPORT    = 8;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_MUD_SAND = 9;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_SAND     = 10;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_MUD      = 11;
    public static final int VALUE_TERAWD_DRVMD_CFGSTS_SNA      = 15;

    public static final int VALUE_TRANS_DRVMD_CFGSTS_TX_NORM    = 0;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_SSC        = 1;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_HDC        = 2;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_TRACK      = 3;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_VALET      = 4;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_E_MODE     = 5;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_SPORT_PLUS = 6;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_TX_SPORT   = 7;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_LOW        = 8;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_OD_OFF     = 9;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_TX_TOW     = 10;
    public static final int VALUE_TRANS_DRVMD_CFGSTS_SNA        = 255;

    public static final int VALUE_VIN_MSG_VIN_LO  = 0;
    public static final int VALUE_VIN_MSG_VIN_MID = 1;
    public static final int VALUE_VIN_MSG_VIN_HI  = 2;
    public static final int VALUE_VIN_MSG_SNA     = 2147483647;

    /**
     * Gets the ADC_DrvMd_CfgSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_ADC_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getADC_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ADC_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerADC_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ADC_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterADC_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Antinclination_Sensor from the vehicle.
     * @base ATLH - WL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getAntinclination_Sensor() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Antinclination_Sensor.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerAntinclination_SensorChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Antinclination_Sensor.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterAntinclination_SensorChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Autoshow_Off_Rd from the vehicle.
     * @base ATLH - WL
     * @return VALUE_AUTOSHOW_OFF_RD
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getAutoshow_Off_Rd() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Autoshow_Off_Rd.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerAutoshow_Off_RdChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Autoshow_Off_Rd.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterAutoshow_Off_RdChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Car_Shape_Configuration from the vehicle.
     * @base All ATL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getCar_Shape_Configuration() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Car_Shape_Configuration.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerCar_Shape_ConfigurationChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Car_Shape_Configuration.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterCar_Shape_ConfigurationChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Damping_Tuning_Set from the vehicle.
     * @base ATLH - WL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getDamping_Tuning_Set() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Damping_Tuning_Set.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerDamping_Tuning_SetChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Damping_Tuning_Set.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterDamping_Tuning_SetChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the EC_AudTel3B from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getEC_AudTel3B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EC_AudTel3B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerEC_AudTel3BChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EC_AudTel3B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterEC_AudTel3BChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the EC_Cluster1A from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getEC_Cluster1A() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EC_Cluster1A.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerEC_Cluster1AChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EC_Cluster1A.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterEC_Cluster1AChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the EngDrvMdStat from the vehicle.
     * @base WD Only
     * @return VALUE_ENG_DRV_MD_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getEngDrvMdStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngDrvMdStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerEngDrvMdStatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngDrvMdStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterEngDrvMdStatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the EPS_DrvMd_CfgSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_EPS_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getEPS_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EPS_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerEPS_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EPS_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterEPS_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the ESC_DrvMd_CfgSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_ESC_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getESC_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESC_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerESC_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESC_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterESC_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Forward_Facing_Camera from the vehicle.
     * @base ATLH - WL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getForward_Facing_Camera() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Forward_Facing_Camera.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerForward_Facing_CameraChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Forward_Facing_Camera.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterForward_Facing_CameraChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Gear_Box_Type from the vehicle.
     * @base All ATL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getGear_Box_Type() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Gear_Box_Type.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerGear_Box_TypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Gear_Box_Type.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterGear_Box_TypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the HP_DrvMd_CfgSts from the vehicle.
     * @base WD Only
     * @return VALUE_HP_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getHP_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HP_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerHP_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HP_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterHP_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Paddles_DrvMd_CfgSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_PADDLES_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getPaddles_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Paddles_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerPaddles_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Paddles_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterPaddles_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the PS_SysType from the vehicle.
     * @base PNNAWD
     * @return VALUE_PS_SYSTYPE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getPS_SysType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PS_SysType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerPS_SysTypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PS_SysType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterPS_SysTypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the RRM_VP_LEVEL from the vehicle.
     * @base ATLH - WL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getRRM_VP_LEVEL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RRM_VP_LEVEL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerRRM_VP_LEVELChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RRM_VP_LEVEL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterRRM_VP_LEVELChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Selec_Speed_Control_Feature from the vehicle.
     * @base ATLH - WL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getSelec_Speed_Control_Feature() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Selec_Speed_Control_Feature.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerSelec_Speed_Control_FeatureChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Selec_Speed_Control_Feature.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterSelec_Speed_Control_FeatureChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Steering_Ratio_Rack_Pinion_Type from the vehicle.
     * @base ATLH - WL
     * @return VALUE_STEERING_RATIO_RACK_PINION_TYPE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getSteering_Ratio_Rack_Pinion_Type() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Steering_Ratio_Rack_Pinion_Type.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerSteering_Ratio_Rack_Pinion_TypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Steering_Ratio_Rack_Pinion_Type.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterSteering_Ratio_Rack_Pinion_TypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Stop_And_Start from the vehicle.
     * @base ATLH - WL
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getStop_And_Start() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Stop_And_Start.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerStop_And_StartChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Stop_And_Start.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterStop_And_StartChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the TerAWD_DrvMd_CfgSts from the vehicle.
     * @base WD Only
     * @return VALUE_TERAWD_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getTerAWD_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TerAWD_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerTerAWD_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TerAWD_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterTerAWD_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the Trans_DrvMd_CfgSts from the vehicle.
     * @base PNNAWD
     * @return VALUE_TRANS_DRVMD_CFGSTS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getTrans_DrvMd_CfgSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Trans_DrvMd_CfgSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerTrans_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Trans_DrvMd_CfgSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterTrans_DrvMd_CfgStsChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ABSM from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ABSM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ABSM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ABSMChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ABSM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ABSMChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AC_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AC_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AC_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AC_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AC_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AC_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ACC_DLY_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ACC_DLY_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ACC_DLY_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ACC_DLY_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ACC_DLY_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ACC_DLY_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ACC_Type from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ACC_Type() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ACC_Type.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ACC_TypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ACC_Type.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ACC_TypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ADJ_PDL_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ADJ_PDL_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ADJ_PDL_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ADJ_PDL_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ADJ_PDL_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ADJ_PDL_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ADR_PRSNT from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ADR_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ADR_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ADR_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ADR_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ADR_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AFLS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AFLS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AFLS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AFLS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AFLS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AFLS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AIRBAG_ON_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AIRBAG_ON_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AIRBAG_ON_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AIRBAG_ON_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AIRBAG_ON_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AIRBAG_ON_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AMB_DMR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AMB_DMR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AMB_DMR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AMB_DMR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AMB_DMR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AMB_DMR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AmbLtgPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AmbLtgPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AmbLtgPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AmbLtgPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AmbLtgPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AmbLtgPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AmbTempLct from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AmbTempLct() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AmbTempLct.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AmbTempLctChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AmbTempLct.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AmbTempLctChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AnlgDrSnsr from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AnlgDrSnsr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AnlgDrSnsr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AnlgDrSnsrChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AnlgDrSnsr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AnlgDrSnsrChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AQS_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AQS_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AQS_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AQS_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AQS_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AQS_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ARC_PRSNT from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ARC_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ARC_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ARC_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ARC_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ARC_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AS_ERS from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AS_ERS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AS_ERS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AS_ERSChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AS_ERS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AS_ERSChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ASCM_TJ_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ASCM_TJ_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ASCM_TJ_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ASCM_TJ_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ASCM_TJ_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ASCM_TJ_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ASCM_WRN_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ASCM_WRN_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ASCM_WRN_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ASCM_WRN_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ASCM_WRN_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ASCM_WRN_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUTO_AERO_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUTO_AERO_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUTO_AERO_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUTO_AERO_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUTO_AERO_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUTO_AERO_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUTO_HB from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUTO_HB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUTO_HB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUTO_HBChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUTO_HB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUTO_HBChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUTO_HB_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUTO_HB_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUTO_HB_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUTO_HB_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUTO_HB_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUTO_HB_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUTO_HL from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUTO_HL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUTO_HL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUTO_HLChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUTO_HL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUTO_HLChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUTO_PRK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUTO_PRK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUTO_PRK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUTO_PRK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUTO_PRK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUTO_PRK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUTO_SS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUTO_SS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUTO_SS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUTO_SS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUTO_SS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUTO_SS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AutoParkPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AutoParkPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AutoParkPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AutoParkPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AutoParkPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AutoParkPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AUX_SWS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AUX_SWS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AUX_SWS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AUX_SWS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AUX_SWS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AUX_SWS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AXLE_RATIO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_AXLE_RATIO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AXLE_RATIO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AXLE_RATIOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AXLE_RATIO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AXLE_RATIOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_AxleLockerPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_AxleLockerPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_AxleLockerPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_AxleLockerPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_AxleLockerPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_AxleLockerPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Base_TPM from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Base_TPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Base_TPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Base_TPMChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Base_TPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Base_TPMChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_BLIND_SPOT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_BLIND_SPOT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_BLIND_SPOT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_BLIND_SPOT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_BLIND_SPOT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_BLIND_SPOT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_BODY_STYLE from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_BODY_STYLE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_BODY_STYLE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_BODY_STYLEChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_BODY_STYLE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_BODY_STYLEChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Brake_Type from the vehicle.
     * @base PN - RUPHEV
     * @return Type
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Brake_Type() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Brake_Type.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Brake_TypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Brake_Type.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Brake_TypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_BrkTyp from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_BrkTyp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_BrkTyp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_BrkTypChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_BrkTyp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_BrkTypChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_BSM_TRLR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_BSM_TRLR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_BSM_TRLR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_BSM_TRLR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_BSM_TRLR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_BSM_TRLR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CAPACITY_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CAPACITY_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CAPACITY_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CAPACITY_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CAPACITY_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CAPACITY_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ChassisType from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ChassisType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ChassisType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ChassisTypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ChassisType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ChassisTypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ChildDisp_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ChildDisp_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ChildDisp_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ChildDisp_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ChildDisp_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ChildDisp_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CHILLER_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CHILLER_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CHILLER_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CHILLER_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CHILLER_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CHILLER_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CHMCM_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CHMCM_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CHMCM_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CHMCM_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CHMCM_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CHMCM_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CHMSL_LINE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CHMSL_LINE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CHMSL_LINE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CHMSL_LINE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CHMSL_LINE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CHMSL_LINE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CLK_DSP_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CLK_DSP_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CLK_DSP_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CLK_DSP_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CLK_DSP_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CLK_DSP_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CMP_CAL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CMP_CAL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CMP_CAL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CMP_CAL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CMP_CAL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CMP_CAL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CMP_DISP from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CMP_DISP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CMP_DISP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CMP_DISPChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CMP_DISP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CMP_DISPChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CMP_VAR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CMP_VAR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CMP_VAR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CMP_VAR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CMP_VAR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CMP_VAR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CMRA_GRDLNS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CMRA_GRDLNS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CMRA_GRDLNS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CMRA_GRDLNS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CMRA_GRDLNS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CMRA_GRDLNS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CMS from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CMS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CMS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CMSChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CMS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CMSChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CONS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CONS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CONS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CONS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CONS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CONS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_COUNTRY from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_COUNTRY() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_COUNTRY.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_COUNTRYChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_COUNTRY.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_COUNTRYChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_CRUISE_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_CRUISE_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_CRUISE_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_CRUISE_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_CRUISE_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_CRUISE_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DampingPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DampingPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DampingPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DampingPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DampingPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DampingPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DCS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DCS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DCS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DCS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DCS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DCS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DISTANCE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DISTANCE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DISTANCE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DISTANCE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DISTANCE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DISTANCE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DR_LK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DR_LK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DR_LK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DR_LK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DR_LK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DR_LK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DR_UNLK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DR_UNLK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DR_UNLK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DR_UNLK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DR_UNLK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DR_UNLK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Drag_Prsnt from the vehicle.
     * @base WD Only
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Drag_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Drag_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Drag_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Drag_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Drag_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DrAlrPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DrAlrPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DrAlrPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DrAlrPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DrAlrPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DrAlrPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DRL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DRL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DRL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DRL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DRL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DRL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DRVMD_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DRVMD_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DRVMD_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DRVMD_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DRVMD_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DRVMD_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DSBL_CLK_DISP from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DSBL_CLK_DISP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DSBL_CLK_DISP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DSBL_CLK_DISPChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DSBL_CLK_DISP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DSBL_CLK_DISPChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DST_Present from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DST_Present() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DST_Present.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DST_PresentChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DST_Present.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DST_PresentChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_DualFuelSens from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_DualFuelSens() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_DualFuelSens.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_DualFuelSensChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_DualFuelSens.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_DualFuelSensChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_EASY_EXIT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_EASY_EXIT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_EASY_EXIT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_EASY_EXIT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_EASY_EXIT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_EASY_EXIT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ECO_Indicator from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ECO_Indicator() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ECO_Indicator.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ECO_IndicatorChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ECO_Indicator.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ECO_IndicatorChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ELV_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ELV_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ELV_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ELV_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ELV_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ELV_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_EmodePrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_EmodePrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_EmodePrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_EmodePrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_EmodePrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_EmodePrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_EngPowerDrvMd_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_EngPowerDrvMd_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_EngPowerDrvMd_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_EngPowerDrvMd_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_EngPowerDrvMd_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_EngPowerDrvMd_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ENTRY_EXIT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ENTRY_EXIT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ENTRY_EXIT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ENTRY_EXIT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ENTRY_EXIT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ENTRY_EXIT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_EPB_ON_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_EPB_ON_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_EPB_ON_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_EPB_ON_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_EPB_ON_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_EPB_ON_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_EPB_SERV_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_EPB_SERV_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_EPB_SERV_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_EPB_SERV_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_EPB_SERV_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_EPB_SERV_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_EPS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_EPS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_EPS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_EPS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_EPS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_EPS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ESAVE_CSO from the vehicle.
     * @base All ATL
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ESAVE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ESAVE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ESAVE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ESAVE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ESAVE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ESCDrvMd_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ESCDrvMd_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ESCDrvMd_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ESCDrvMd_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ESCDrvMd_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ESCDrvMd_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ESCL_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ESCL_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ESCL_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ESCL_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ESCL_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ESCL_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_eShifter_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_eShifter_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_eShifter_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_eShifter_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_eShifter_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_eShifter_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FCW from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FCW() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FCW.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FCWChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FCW.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FCWChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FCW_BRK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FCW_BRK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FCW_BRK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FCW_BRK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FCW_BRK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FCW_BRK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FCW_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FCW_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FCW_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FCW_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FCW_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FCW_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FCW_SW_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FCW_SW_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FCW_SW_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FCW_SW_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FCW_SW_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FCW_SW_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FG_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FG_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FG_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FG_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FG_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FG_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FLSH_LMP_LK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FLSH_LMP_LK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FLSH_LMP_LK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FLSH_LMP_LK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FLSH_LMP_LK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FLSH_LMP_LK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FLSH_LMP_SLDR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FLSH_LMP_SLDR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FLSH_LMP_SLDR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FLSH_LMP_SLDR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FLSH_LMP_SLDR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FLSH_LMP_SLDR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FOBIKsafeENBL from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FOBIKsafeENBL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FOBIKsafeENBL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FOBIKsafeENBLChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FOBIKsafeENBL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FOBIKsafeENBLChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FUEL_CAP from the vehicle.
     * @base PN - RUPHEV
     * @return liters
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FUEL_CAP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FUEL_CAP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FUEL_CAPChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FUEL_CAP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FUEL_CAPChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FUEL_SAV_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FUEL_SAV_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FUEL_SAV_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FUEL_SAV_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FUEL_SAV_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FUEL_SAV_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FULL_SPARE from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FULL_SPARE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FULL_SPARE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FULL_SPAREChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FULL_SPARE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FULL_SPAREChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_FullSpeedRange_FCW from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_FullSpeedRange_FCW() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_FullSpeedRange_FCW.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_FullSpeedRange_FCWChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_FullSpeedRange_FCW.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_FullSpeedRange_FCWChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Glovebox from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Glovebox() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Glovebox.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_GloveboxChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Glovebox.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_GloveboxChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HANDS_FREE_LFT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HANDS_FREE_LFT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HANDS_FREE_LFT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HANDS_FREE_LFT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HANDS_FREE_LFT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HANDS_FREE_LFT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HANDS_FREE_SLDR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HANDS_FREE_SLDR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HANDS_FREE_SLDR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HANDS_FREE_SLDR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HANDS_FREE_SLDR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HANDS_FREE_SLDR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HDC_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HDC_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HDC_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HDC_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HDC_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HDC_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HdRstPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HdRstPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HdRstPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HdRstPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HdRstPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HdRstPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HID_HL from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HID_HL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HID_HL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HID_HLChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HID_HL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HID_HLChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HL_DRP_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HL_DRP_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HL_DRP_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HL_DRP_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HL_DRP_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HL_DRP_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HL_OFF_DLY_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HL_OFF_DLY_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HL_OFF_DLY_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HL_OFF_DLY_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HL_OFF_DLY_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HL_OFF_DLY_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HL_WPR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HL_WPR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HL_WPR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HL_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HL_WPR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HL_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HOLD_N_GO_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HOLD_N_GO_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HOLD_N_GO_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HOLD_N_GO_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HOLD_N_GO_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HOLD_N_GO_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HRN_RMT_LK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HRN_RMT_LK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HRN_RMT_LK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HRN_RMT_LK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HRN_RMT_LK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HRN_RMT_LK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HRN_RMT_LWR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HRN_RMT_LWR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HRN_RMT_LWR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HRN_RMT_LWR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HRN_RMT_LWR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HRN_RMT_LWR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HRN_RMT_ST_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HRN_RMT_ST_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HRN_RMT_ST_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HRN_RMT_ST_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HRN_RMT_ST_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HRN_RMT_ST_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HSA_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HSA_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HSA_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HSA_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HSA_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HSA_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HVAC_Config from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HVAC_Config() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HVAC_Config.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HVAC_ConfigChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HVAC_Config.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HVAC_ConfigChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_HybridType from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_HybridType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_HybridType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_HybridTypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_HybridType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_HybridTypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ILL_APPRCH_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ILL_APPRCH_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ILL_APPRCH_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ILL_APPRCH_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ILL_APPRCH_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ILL_APPRCH_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_IntEC_MIRR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_IntEC_MIRR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_IntEC_MIRR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_IntEC_MIRRChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_IntEC_MIRR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_IntEC_MIRRChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_KG_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_KG_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_KG_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_KG_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_KG_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_KG_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LDW from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LDW() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LDW.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LDWChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LDW.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LDWChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LDW_ON_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LDW_ON_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LDW_ON_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LDW_ON_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LDW_ON_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LDW_ON_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LDW_TRQ_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LDW_TRQ_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LDW_TRQ_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LDW_TRQ_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LDW_TRQ_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LDW_TRQ_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LDW_WRN_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LDW_WRN_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LDW_WRN_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LDW_WRN_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LDW_WRN_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LDW_WRN_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LGHT_RMT_LWR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LGHT_RMT_LWR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LGHT_RMT_LWR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LGHT_RMT_LWR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LGHT_RMT_LWR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LGHT_RMT_LWR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LgtLdPressFtTr from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LgtLdPressFtTr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LgtLdPressFtTr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LgtLdPressFtTrChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LgtLdPressFtTr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LgtLdPressFtTrChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LgtLdPressRrTr from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LgtLdPressRrTr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LgtLdPressRrTr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LgtLdPressRrTrChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LgtLdPressRrTr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LgtLdPressRrTrChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LHD_RHD from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LHD_RHD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LHD_RHD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LHD_RHDChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LHD_RHD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LHD_RHDChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Liftgate_Trunk from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Liftgate_Trunk() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Liftgate_Trunk.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Liftgate_TrunkChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Liftgate_Trunk.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Liftgate_TrunkChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_LUCI_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_LUCI_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_LUCI_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_LUCI_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_LUCI_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_LUCI_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MaseratiMd from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MaseratiMd() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MaseratiMd.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MaseratiMdChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MaseratiMd.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MaseratiMdChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MAX_VEH_SPD from the vehicle.
     * @base PN - RUPHEV
     * @return kph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MAX_VEH_SPD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MAX_VEH_SPD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MAX_VEH_SPDChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MAX_VEH_SPD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MAX_VEH_SPDChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MaxLdPressFtTr from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MaxLdPressFtTr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MaxLdPressFtTr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MaxLdPressFtTrChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MaxLdPressFtTr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MaxLdPressFtTrChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MaxLdPressRrTr from the vehicle.
     * @base PN - RUPHEV
     * @return psi
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MaxLdPressRrTr() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MaxLdPressRrTr.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MaxLdPressRrTrChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MaxLdPressRrTr.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MaxLdPressRrTrChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MemoryDRVMD_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MemoryDRVMD_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MemoryDRVMD_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MemoryDRVMD_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MemoryDRVMD_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MemoryDRVMD_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MOC_Type from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MOC_Type() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MOC_Type.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MOC_TypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MOC_Type.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MOC_TypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_MODEL_YEAR from the vehicle.
     * @base PN - RUPHEV
     * @return model-year
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_MODEL_YEAR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_MODEL_YEAR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_MODEL_YEARChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_MODEL_YEAR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_MODEL_YEARChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_NAV_TRN_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_NAV_TRN_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_NAV_TRN_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_NAV_TRN_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_NAV_TRN_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_NAV_TRN_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_NonReg_TPIS from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_NonReg_TPIS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_NonReg_TPIS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_NonReg_TPISChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_NonReg_TPIS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_NonReg_TPISChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_OffRoad from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_OffRoad() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_OffRoad.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_OffRoadChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_OffRoad.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_OffRoadChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_OFFroad_Camera from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_OFFroad_Camera() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_OFFroad_Camera.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_OFFroad_CameraChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_OFFroad_Camera.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_OFFroad_CameraChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_OFFRoadModePrsnt from the vehicle.
     * @base Proxi
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_OFFRoadModePrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_OFFRoadModePrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_OFFRoadModePrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_OFFRoadModePrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_OFFRoadModePrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_OffRoadPg from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_OffRoadPg() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_OffRoadPg.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_OffRoadPgChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_OffRoadPg.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_OffRoadPgChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PADDLE_SHIFT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PADDLE_SHIFT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PADDLE_SHIFT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PADDLE_SHIFT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PADDLE_SHIFT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PADDLE_SHIFT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PADS_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PADS_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PADS_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PADS_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PADS_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PADS_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ParkStopPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ParkStopPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ParkStopPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ParkStopPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ParkStopPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ParkStopPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PBTyp from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PBTyp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PBTyp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PBTypChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PBTyp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PBTypChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PCS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PCS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PCS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PCS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PCS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PCS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PDDL_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PDDL_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PDDL_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PDDL_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PDDL_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PDDL_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PdlsMdPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PdlsMdPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PdlsMdPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PdlsMdPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PdlsMdPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PdlsMdPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PE_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PE_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PE_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PE_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PE_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PE_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PER_SHFT_ENBL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PER_SHFT_ENBL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PER_SHFT_ENBL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PER_SHFT_ENBL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PER_SHFT_ENBL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PER_SHFT_ENBL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PER_SHFT_RPM_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PER_SHFT_RPM_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PER_SHFT_RPM_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PER_SHFT_RPM_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PER_SHFT_RPM_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PER_SHFT_RPM_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PLG_CHM_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PLG_CHM_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PLG_CHM_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PLG_CHM_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PLG_CHM_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PLG_CHM_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_POLICE from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_POLICE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_POLICE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_POLICEChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_POLICE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_POLICEChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_POLICE_PE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_POLICE_PE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_POLICE_PE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_POLICE_PE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_POLICE_PE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_POLICE_PE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_POWER_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_POWER_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_POWER_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_POWER_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_POWER_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_POWER_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PP_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PP_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PP_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PP_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PP_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PP_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PPPA_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PPPA_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PPPA_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PPPA_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PPPA_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PPPA_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Prem_TPM from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Prem_TPM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Prem_TPM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Prem_TPMChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Prem_TPM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Prem_TPMChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PRESSURE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PRESSURE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PRESSURE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PRESSURE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PRESSURE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PRESSURE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PRK_ASST_TYPE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PRK_ASST_TYPE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PRK_ASST_TYPE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PRK_ASST_TYPE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PRK_ASST_TYPE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PRK_ASST_TYPE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PRK_AST_BRK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PRK_AST_BRK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PRK_AST_BRK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PRK_AST_BRK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PRK_AST_BRK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PRK_AST_BRK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PRK_AST_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PRK_AST_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PRK_AST_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PRK_AST_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PRK_AST_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PRK_AST_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PRK_FT_VOL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PRK_FT_VOL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PRK_FT_VOL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PRK_FT_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PRK_FT_VOL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PRK_FT_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PRK_RR_VOL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PRK_RR_VOL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PRK_RR_VOL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PRK_RR_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PRK_RR_VOL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PRK_RR_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PTO_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PTO_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PTO_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PTO_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PTO_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PTO_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PTS_Config from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PTS_Config() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PTS_Config.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PTS_ConfigChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PTS_Config.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PTS_ConfigChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PTS_DispTyp from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PTS_DispTyp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PTS_DispTyp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PTS_DispTypChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PTS_DispTyp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PTS_DispTypChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PWR_FLD_MRR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PWR_FLD_MRR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PWR_FLD_MRR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PWR_FLD_MRR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PWR_FLD_MRR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PWR_FLD_MRR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PWR_LFT_GT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PWR_LFT_GT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PWR_LFT_GT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PWR_LFT_GTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PWR_LFT_GT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PWR_LFT_GTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PWR_LT_SLDR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PWR_LT_SLDR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PWR_LT_SLDR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PWR_LT_SLDRChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PWR_LT_SLDR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PWR_LT_SLDRChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PWR_RT_SLDR from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PWR_RT_SLDR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PWR_RT_SLDR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PWR_RT_SLDRChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PWR_RT_SLDR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PWR_RT_SLDRChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_PwrIvtrTyp from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_PwrIvtrTyp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_PwrIvtrTyp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_PwrIvtrTypChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_PwrIvtrTyp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_PwrIvtrTypChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RAIN_WPR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RAIN_WPR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RAIN_WPR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RAIN_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RAIN_WPR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RAIN_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RainSnsPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RainSnsPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RainSnsPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RainSnsPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RainSnsPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RainSnsPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RDY_DRV_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RDY_DRV_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RDY_DRV_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RDY_DRV_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RDY_DRV_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RDY_DRV_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_REAR_CMRA_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_REAR_CMRA_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_REAR_CMRA_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_REAR_CMRA_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_REAR_CMRA_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_REAR_CMRA_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_REAR_CMRA_DLY_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_REAR_CMRA_DLY_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_REAR_CMRA_DLY_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_REAR_CMRA_DLY_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_REAR_CMRA_DLY_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_REAR_CMRA_DLY_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RearDoorLocks2DCM from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RearDoorLocks2DCM() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RearDoorLocks2DCM.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RearDoorLocks2DCMChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RearDoorLocks2DCM.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RearDoorLocks2DCMChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RedKey from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RedKey() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RedKey.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RedKeyChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RedKey.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RedKeyChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RemStPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RemStPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RemStPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RemStPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RemStPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RemStPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RKE_MEM_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RKE_MEM_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RKE_MEM_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RKE_MEM_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RKE_MEM_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RKE_MEM_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RKE_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RKE_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RKE_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RKE_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RKE_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RKE_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RKE_UNLK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RKE_UNLK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RKE_UNLK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RKE_UNLK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RKE_UNLK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RKE_UNLK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RR_DuallyPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RR_DuallyPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RR_DuallyPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RR_DuallyPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RR_DuallyPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RR_DuallyPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RunFlatTirePrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RunFlatTirePrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RunFlatTirePrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RunFlatTirePrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RunFlatTirePrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RunFlatTirePrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_RVCM_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_RVCM_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_RVCM_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_RVCM_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_RVCM_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_RVCM_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SBR_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SBR_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SBR_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SBR_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SBR_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SBR_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SCR_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SCR_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SCR_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SCR_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SCR_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SCR_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SecLkPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SecLkPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SecLkPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SecLkPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SecLkPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SecLkPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SecPrkPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SecPrkPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SecPrkPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SecPrkPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SecPrkPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SecPrkPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ShftInd_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ShftInd_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ShftInd_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ShftInd_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ShftInd_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ShftInd_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ShftrTyp from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ShftrTyp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ShftrTyp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ShftrTypChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ShftrTyp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ShftrTypChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SKIM_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SKIM_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SKIM_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SKIM_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SKIM_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SKIM_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SLD_DR_ALRT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SLD_DR_ALRT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SLD_DR_ALRT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SLD_DR_ALRT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SLD_DR_ALRT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SLD_DR_ALRT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SLD_DR_CHM_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SLD_DR_CHM_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SLD_DR_CHM_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SLD_DR_CHM_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SLD_DR_CHM_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SLD_DR_CHM_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SmartAlternator from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SmartAlternator() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SmartAlternator.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SmartAlternatorChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SmartAlternator.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SmartAlternatorChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SpdLmt_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SpdLmt_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SpdLmt_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SpdLmt_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SpdLmt_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SpdLmt_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SpecialPKG from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SpecialPKG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SpecialPKG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SpecialPKGChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SpecialPKG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SpecialPKGChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SpecialPKG_IC from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SpecialPKG_IC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SpecialPKG_IC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SpecialPKG_ICChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SpecialPKG_IC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SpecialPKG_ICChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SPEED_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SPEED_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SPEED_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SPEED_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SPEED_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SPEED_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SPEED_WARNING_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SPEED_WARNING_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SPEED_WARNING_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SPEED_WARNING_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SPEED_WARNING_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SPEED_WARNING_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SPORT_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SPORT_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SPORT_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SPORT_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SPORT_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SPORT_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SRT_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SRT_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SRT_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SRT_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SRT_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SRT_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SSC_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SSC_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SSC_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SSC_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SSC_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SSC_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_STP_PRSNT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_STP_PRSNT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_STP_PRSNT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_STP_PRSNTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_STP_PRSNT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_STP_PRSNTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_0 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_0() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_0.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_0Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_0.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_0Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_Mns1 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_Mns1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_Mns1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_Mns1Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_Mns1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_Mns1Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_Mns2 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_Mns2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_Mns2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_Mns2Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_Mns2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_Mns2Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_Mns3 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_Mns3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_Mns3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_Mns3Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_Mns3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_Mns3Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_Mns4 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_Mns4() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_Mns4.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_Mns4Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_Mns4.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_Mns4Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_Mns5 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_Mns5() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_Mns5.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_Mns5Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_Mns5.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_Mns5Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_pls1 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_pls1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_pls1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_pls1Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_pls1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_pls1Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_pls2 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_pls2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_pls2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_pls2Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_pls2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_pls2Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_pls3 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_pls3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_pls3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_pls3Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_pls3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_pls3Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_pls4 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_pls4() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_pls4.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_pls4Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_pls4.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_pls4Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Strng_Rt_pls5 from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_Strng_Rt_pls5() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Strng_Rt_pls5.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Strng_Rt_pls5Change(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Strng_Rt_pls5.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Strng_Rt_pls5Change(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SUNR_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SUNR_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SUNR_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SUNR_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SUNR_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SUNR_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SunShade_Present from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SunShade_Present() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SunShade_Present.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SunShade_PresentChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SunShade_Present.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SunShade_PresentChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Suspension_Type from the vehicle.
     * @base PN - RUPHEV
     * @return TYPE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Suspension_Type() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Suspension_Type.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Suspension_TypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Suspension_Type.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Suspension_TypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SuspPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SuspPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SuspPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SuspPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SuspPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SuspPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SVC_DELAY_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SVC_DELAY_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SVC_DELAY_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SVC_DELAY_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SVC_DELAY_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SVC_DELAY_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SVC_GRIDLINES_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SVC_GRIDLINES_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SVC_GRIDLINES_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SVC_GRIDLINES_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SVC_GRIDLINES_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SVC_GRIDLINES_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_SVC_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_SVC_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_SVC_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_SVC_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_SVC_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_SVC_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TCASE_HI_RATIO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_TCASE_HI_RATIO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TCASE_HI_RATIO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TCASE_HI_RATIOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TCASE_HI_RATIO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TCASE_HI_RATIOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TCASE_LO_RATIO from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    float getVC_TCASE_LO_RATIO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TCASE_LO_RATIO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TCASE_LO_RATIOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TCASE_LO_RATIO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TCASE_LO_RATIOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TcaseTyp from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TcaseTyp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TcaseTyp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TcaseTypChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TcaseTyp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TcaseTypChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_AUTO_HB_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_AUTO_HB_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_AUTO_HB_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_AUTO_HB_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_AUTO_HB_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_AUTO_HB_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_BLIND_SPOT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_BLIND_SPOT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_BLIND_SPOT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_BLIND_SPOT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_BLIND_SPOT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_BLIND_SPOT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_FCW_BRK_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_FCW_BRK_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_FCW_BRK_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_FCW_BRK_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_FCW_BRK_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_FCW_BRK_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_FCW_SENS_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_FCW_SENS_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_FCW_SENS_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_FCW_SENS_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_FCW_SENS_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_FCW_SENS_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_FT_PRK_VOL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_FT_PRK_VOL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_FT_PRK_VOL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_FT_PRK_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_FT_PRK_VOL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_FT_PRK_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_FUEL_POPUP_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_FUEL_POPUP_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_FUEL_POPUP_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_FUEL_POPUP_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_FUEL_POPUP_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_FUEL_POPUP_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_FUEL_WRN_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_FUEL_WRN_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_FUEL_WRN_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_FUEL_WRN_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_FUEL_WRN_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_FUEL_WRN_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_LGHT_WPR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_LGHT_WPR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_LGHT_WPR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_LGHT_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_LGHT_WPR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_LGHT_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_MAX_SPEED_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_MAX_SPEED_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_MAX_SPEED_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_MAX_SPEED_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_MAX_SPEED_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_MAX_SPEED_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_PLG_CHIME_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_PLG_CHIME_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_PLG_CHIME_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_PLG_CHIME_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_PLG_CHIME_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_PLG_CHIME_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_PRK_ASST_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_PRK_ASST_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_PRK_ASST_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_PRK_ASST_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_PRK_ASST_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_PRK_ASST_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_RAIN_WPR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_RAIN_WPR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_RAIN_WPR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_RAIN_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_RAIN_WPR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_RAIN_WPR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_RR_PRK_VOL_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_RR_PRK_VOL_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_RR_PRK_VOL_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_RR_PRK_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_RR_PRK_VOL_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_RR_PRK_VOL_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_SLD_DR_ALRT_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_SLD_DR_ALRT_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_SLD_DR_ALRT_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_SLD_DR_ALRT_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_SLD_DR_ALRT_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_SLD_DR_ALRT_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEEN_SLD_DR_CHM_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEEN_SLD_DR_CHM_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEEN_SLD_DR_CHM_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEEN_SLD_DR_CHM_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEEN_SLD_DR_CHM_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEEN_SLD_DR_CHM_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TeenKey from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TeenKey() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TeenKey.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TeenKeyChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TeenKey.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TeenKeyChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEMP_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEMP_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEMP_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEMP_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEMP_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEMP_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TEMP_DISP from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TEMP_DISP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TEMP_DISP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TEMP_DISPChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TEMP_DISP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TEMP_DISPChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_ThatchamPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_ThatchamPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_ThatchamPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_ThatchamPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_ThatchamPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_ThatchamPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TIRE_CIRCUMF from the vehicle.
     * @base PN - RUPHEV
     * @return mm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TIRE_CIRCUMF() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TIRE_CIRCUMF.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TIRE_CIRCUMFChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TIRE_CIRCUMF.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TIRE_CIRCUMFChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TireCircumfFT from the vehicle.
     * @base PN - RUPHEV
     * @return mm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TireCircumfFT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TireCircumfFT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TireCircumfFTChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TireCircumfFT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TireCircumfFTChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TLT_MRR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TLT_MRR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TLT_MRR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TLT_MRR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TLT_MRR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TLT_MRR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TORQUE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TORQUE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TORQUE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TORQUE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TORQUE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TORQUE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TPMS_Configuration from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TPMS_Configuration() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TPMS_Configuration.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TPMS_ConfigurationChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TPMS_Configuration.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TPMS_ConfigurationChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Trans_Equipped from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Trans_Equipped() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Trans_Equipped.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Trans_EquippedChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Trans_Equipped.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Trans_EquippedChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_Trans_N_Hold_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_Trans_N_Hold_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_Trans_N_Hold_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_Trans_N_Hold_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_Trans_N_Hold_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_Trans_N_Hold_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TransType from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TransType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TransType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TransTypeChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TransType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TransTypeChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TRLR_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TRLR_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TRLR_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TRLR_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TRLR_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TRLR_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TRLR_NAME_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TRLR_NAME_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TRLR_NAME_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TRLR_NAME_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TRLR_NAME_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TRLR_NAME_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TRLR_TYPE_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TRLR_TYPE_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TRLR_TYPE_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TRLR_TYPE_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TRLR_TYPE_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TRLR_TYPE_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TRNS_MD_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TRNS_MD_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TRNS_MD_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TRNS_MD_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TRNS_MD_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TRNS_MD_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TrnsDrvMdPrsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TrnsDrvMdPrsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TrnsDrvMdPrsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TrnsDrvMdPrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TrnsDrvMdPrsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TrnsDrvMdPrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_TSBM_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_TSBM_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_TSBM_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_TSBM_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_TSBM_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_TSBM_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_UNIT_SET_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_UNIT_SET_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_UNIT_SET_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_UNIT_SET_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_UNIT_SET_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_UNIT_SET_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_US_METRIC_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_US_METRIC_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_US_METRIC_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_US_METRIC_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_US_METRIC_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_US_METRIC_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VEH_BRAND from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VEH_BRAND() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VEH_BRAND.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VEH_BRANDChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VEH_BRAND.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VEH_BRANDChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VEH_LINE from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VEH_LINE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VEH_LINE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VEH_LINEChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VEH_LINE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VEH_LINEChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg1_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg1_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg1_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg1_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg1_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg1_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg2_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg2_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg2_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg2_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg2_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg2_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg3_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg3_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg3_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg3_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg3_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg3_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg4_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg4_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg4_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg4_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg4_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg4_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg5_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg5_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg5_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg5_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg5_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg5_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg6_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg6_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg6_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg6_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg6_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg6_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfg7_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfg7_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfg7_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfg7_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfg7_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfg7_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfgCSO1_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfgCSO1_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfgCSO1_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfgCSO1_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfgCSO1_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfgCSO1_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_VehCfgCSO2_Stat from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_VehCfgCSO2_Stat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_VehCfgCSO2_Stat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_VehCfgCSO2_StatChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_VehCfgCSO2_Stat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_VehCfgCSO2_StatChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_WHL_ALGN_CSO from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_WHL_ALGN_CSO() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_WHL_ALGN_CSO.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_WHL_ALGN_CSOChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_WHL_ALGN_CSO.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_WHL_ALGN_CSOChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_WHL_BASE from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_WHL_BASE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_WHL_BASE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_WHL_BASEChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_WHL_BASE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_WHL_BASEChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_WIN_EXPR_FEAT from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_WIN_EXPR_FEAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_WIN_EXPR_FEAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_WIN_EXPR_FEATChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_WIN_EXPR_FEAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_WIN_EXPR_FEATChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_WTS_Prsnt from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_WTS_Prsnt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_WTS_Prsnt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_WTS_PrsntChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_WTS_Prsnt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_WTS_PrsntChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VC_XWD from the vehicle.
     * @base PN - RUPHEV
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    int getVC_XWD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VC_XWD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean registerVC_XWDChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VC_XWD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_HIGH
     */
    boolean unregisterVC_XWDChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Gets the VIN_MSG from the vehicle.
     * @base PN - RUPHEV
     * @return VIN Type
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_MEDIUM
     */
    int getVIN_MSG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to VIN_MSG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_MEDIUM
     */
    boolean registerVIN_MSGChange(FcaIVehicleConfigManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to VIN_MSG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCONFIG_READ_MEDIUM
     */
    boolean unregisterVIN_MSGChange(FcaIVehicleConfigManagerCallback callback);

    /**
     * Callback interface to register IVehicleConfigManager against.
     */
    public interface FcaIVehicleConfigManagerCallback {
        default void onADC_DrvMd_CfgStsChange(int value) { }
        default void onAntinclination_SensorChange(int value) { }
        default void onAutoshow_Off_RdChange(int value) { }
        default void onCar_Shape_ConfigurationChange(int value) { }
        default void onDamping_Tuning_SetChange(int value) { }
        default void onEC_AudTel3BChange(int value) { }
        default void onEC_Cluster1AChange(int value) { }
        default void onEngDrvMdStatChange(int value) { }
        default void onEPS_DrvMd_CfgStsChange(int value) { }
        default void onESC_DrvMd_CfgStsChange(int value) { }
        default void onForward_Facing_CameraChange(int value) { }
        default void onGear_Box_TypeChange(int value) { }
        default void onHP_DrvMd_CfgStsChange(int value) { }
        default void onPaddles_DrvMd_CfgStsChange(int value) { }
        default void onPS_SysTypeChange(int value) { }
        default void onRRM_VP_LEVELChange(int value) { }
        default void onSelec_Speed_Control_FeatureChange(int value) { }
        default void onSteering_Ratio_Rack_Pinion_TypeChange(int value) { }
        default void onStop_And_StartChange(int value) { }
        default void onTerAWD_DrvMd_CfgStsChange(int value) { }
        default void onTrans_DrvMd_CfgStsChange(int value) { }
        default void onVC_ABSMChange(int value) { }
        default void onVC_AC_PrsntChange(int value) { }
        default void onVC_ACC_DLY_CSOChange(int value) { }
        default void onVC_ACC_TypeChange(int value) { }
        default void onVC_ADJ_PDL_PRSNTChange(int value) { }
        default void onVC_ADR_PRSNTChange(int value) { }
        default void onVC_AFLS_CSOChange(int value) { }
        default void onVC_AIRBAG_ON_CSOChange(int value) { }
        default void onVC_AMB_DMR_CSOChange(int value) { }
        default void onVC_AmbLtgPrsntChange(int value) { }
        default void onVC_AmbTempLctChange(int value) { }
        default void onVC_AnlgDrSnsrChange(int value) { }
        default void onVC_AQS_PrsntChange(int value) { }
        default void onVC_ARC_PRSNTChange(int value) { }
        default void onVC_AS_ERSChange(int value) { }
        default void onVC_ASCM_TJ_CSOChange(int value) { }
        default void onVC_ASCM_WRN_CSOChange(int value) { }
        default void onVC_AUTO_AERO_CSOChange(int value) { }
        default void onVC_AUTO_HBChange(int value) { }
        default void onVC_AUTO_HB_CSOChange(int value) { }
        default void onVC_AUTO_HLChange(int value) { }
        default void onVC_AUTO_PRK_CSOChange(int value) { }
        default void onVC_AUTO_SS_CSOChange(int value) { }
        default void onVC_AutoParkPrsntChange(int value) { }
        default void onVC_AUX_SWS_CSOChange(int value) { }
        default void onVC_AXLE_RATIOChange(float value) { }
        default void onVC_AxleLockerPrsntChange(int value) { }
        default void onVC_Base_TPMChange(int value) { }
        default void onVC_BLIND_SPOT_CSOChange(int value) { }
        default void onVC_BODY_STYLEChange(int value) { }
        default void onVC_Brake_TypeChange(int value) { }
        default void onVC_BrkTypChange(int value) { }
        default void onVC_BSM_TRLR_CSOChange(int value) { }
        default void onVC_CAPACITY_CSOChange(int value) { }
        default void onVC_ChassisTypeChange(int value) { }
        default void onVC_ChildDisp_PrsntChange(int value) { }
        default void onVC_CHILLER_PRSNTChange(int value) { }
        default void onVC_CHMCM_PrsntChange(int value) { }
        default void onVC_CHMSL_LINE_CSOChange(int value) { }
        default void onVC_CLK_DSP_CSOChange(int value) { }
        default void onVC_CMP_CAL_CSOChange(int value) { }
        default void onVC_CMP_DISPChange(int value) { }
        default void onVC_CMP_VAR_CSOChange(int value) { }
        default void onVC_CMRA_GRDLNS_CSOChange(int value) { }
        default void onVC_CMSChange(int value) { }
        default void onVC_CONS_CSOChange(int value) { }
        default void onVC_COUNTRYChange(int value) { }
        default void onVC_CRUISE_PRSNTChange(int value) { }
        default void onVC_DampingPrsntChange(int value) { }
        default void onVC_DCS_CSOChange(int value) { }
        default void onVC_DISTANCE_CSOChange(int value) { }
        default void onVC_DR_LK_CSOChange(int value) { }
        default void onVC_DR_UNLK_CSOChange(int value) { }
        default void onVC_Drag_PrsntChange(int value) { }
        default void onVC_DrAlrPrsntChange(int value) { }
        default void onVC_DRL_CSOChange(int value) { }
        default void onVC_DRVMD_PrsntChange(int value) { }
        default void onVC_DSBL_CLK_DISPChange(int value) { }
        default void onVC_DST_PresentChange(int value) { }
        default void onVC_DualFuelSensChange(int value) { }
        default void onVC_EASY_EXIT_CSOChange(int value) { }
        default void onVC_ECO_IndicatorChange(int value) { }
        default void onVC_ELV_PrsntChange(int value) { }
        default void onVC_EmodePrsntChange(int value) { }
        default void onVC_EngPowerDrvMd_PrsntChange(int value) { }
        default void onVC_ENTRY_EXIT_CSOChange(int value) { }
        default void onVC_EPB_ON_CSOChange(int value) { }
        default void onVC_EPB_SERV_CSOChange(int value) { }
        default void onVC_EPS_CSOChange(int value) { }
        default void onVC_ESAVE_CSOChange(int value) { }
        default void onVC_ESCDrvMd_PrsntChange(int value) { }
        default void onVC_ESCL_PRSNTChange(int value) { }
        default void onVC_eShifter_PrsntChange(int value) { }
        default void onVC_FCWChange(int value) { }
        default void onVC_FCW_BRK_CSOChange(int value) { }
        default void onVC_FCW_CSOChange(int value) { }
        default void onVC_FCW_SW_CSOChange(int value) { }
        default void onVC_FG_PRSNTChange(int value) { }
        default void onVC_FLSH_LMP_LK_CSOChange(int value) { }
        default void onVC_FLSH_LMP_SLDR_CSOChange(int value) { }
        default void onVC_FOBIKsafeENBLChange(int value) { }
        default void onVC_FUEL_CAPChange(int value) { }
        default void onVC_FUEL_SAV_CSOChange(int value) { }
        default void onVC_FULL_SPAREChange(int value) { }
        default void onVC_FullSpeedRange_FCWChange(int value) { }
        default void onVC_GloveboxChange(int value) { }
        default void onVC_HANDS_FREE_LFT_CSOChange(int value) { }
        default void onVC_HANDS_FREE_SLDR_CSOChange(int value) { }
        default void onVC_HDC_PrsntChange(int value) { }
        default void onVC_HdRstPrsntChange(int value) { }
        default void onVC_HID_HLChange(int value) { }
        default void onVC_HL_DRP_CSOChange(int value) { }
        default void onVC_HL_OFF_DLY_CSOChange(int value) { }
        default void onVC_HL_WPR_CSOChange(int value) { }
        default void onVC_HOLD_N_GO_CSOChange(int value) { }
        default void onVC_HRN_RMT_LK_CSOChange(int value) { }
        default void onVC_HRN_RMT_LWR_CSOChange(int value) { }
        default void onVC_HRN_RMT_ST_CSOChange(int value) { }
        default void onVC_HSA_CSOChange(int value) { }
        default void onVC_HVAC_ConfigChange(int value) { }
        default void onVC_HybridTypeChange(int value) { }
        default void onVC_ILL_APPRCH_CSOChange(int value) { }
        default void onVC_IntEC_MIRRChange(int value) { }
        default void onVC_KG_PrsntChange(int value) { }
        default void onVC_LDWChange(int value) { }
        default void onVC_LDW_ON_CSOChange(int value) { }
        default void onVC_LDW_TRQ_CSOChange(int value) { }
        default void onVC_LDW_WRN_CSOChange(int value) { }
        default void onVC_LGHT_RMT_LWR_CSOChange(int value) { }
        default void onVC_LgtLdPressFtTrChange(int value) { }
        default void onVC_LgtLdPressRrTrChange(int value) { }
        default void onVC_LHD_RHDChange(int value) { }
        default void onVC_Liftgate_TrunkChange(int value) { }
        default void onVC_LUCI_PRSNTChange(int value) { }
        default void onVC_MaseratiMdChange(int value) { }
        default void onVC_MAX_VEH_SPDChange(int value) { }
        default void onVC_MaxLdPressFtTrChange(int value) { }
        default void onVC_MaxLdPressRrTrChange(int value) { }
        default void onVC_MemoryDRVMD_PrsntChange(int value) { }
        default void onVC_MOC_TypeChange(int value) { }
        default void onVC_MODEL_YEARChange(int value) { }
        default void onVC_NAV_TRN_CSOChange(int value) { }
        default void onVC_NonReg_TPISChange(int value) { }
        default void onVC_OffRoadChange(int value) { }
        default void onVC_OFFroad_CameraChange(int value) { }
        default void onVC_OFFRoadModePrsntChange(int value) { }
        default void onVC_OffRoadPgChange(int value) { }
        default void onVC_PADDLE_SHIFT_CSOChange(int value) { }
        default void onVC_PADS_PrsntChange(int value) { }
        default void onVC_ParkStopPrsntChange(int value) { }
        default void onVC_PBTypChange(int value) { }
        default void onVC_PCS_CSOChange(int value) { }
        default void onVC_PDDL_PRSNTChange(int value) { }
        default void onVC_PdlsMdPrsntChange(int value) { }
        default void onVC_PE_CSOChange(int value) { }
        default void onVC_PE_PrsntChange(int value) { }
        default void onVC_PER_SHFT_ENBL_CSOChange(int value) { }
        default void onVC_PER_SHFT_RPM_CSOChange(int value) { }
        default void onVC_PLG_CHM_CSOChange(int value) { }
        default void onVC_POLICEChange(int value) { }
        default void onVC_POLICE_PE_CSOChange(int value) { }
        default void onVC_POWER_CSOChange(int value) { }
        default void onVC_PP_PrsntChange(int value) { }
        default void onVC_PPPA_PrsntChange(int value) { }
        default void onVC_Prem_TPMChange(int value) { }
        default void onVC_PRESSURE_CSOChange(int value) { }
        default void onVC_PRK_ASST_TYPE_CSOChange(int value) { }
        default void onVC_PRK_AST_BRK_CSOChange(int value) { }
        default void onVC_PRK_AST_CSOChange(int value) { }
        default void onVC_PRK_FT_VOL_CSOChange(int value) { }
        default void onVC_PRK_RR_VOL_CSOChange(int value) { }
        default void onVC_PTO_CSOChange(int value) { }
        default void onVC_PTS_ConfigChange(int value) { }
        default void onVC_PTS_DispTypChange(int value) { }
        default void onVC_PWR_FLD_MRR_CSOChange(int value) { }
        default void onVC_PWR_LFT_GTChange(int value) { }
        default void onVC_PWR_LT_SLDRChange(int value) { }
        default void onVC_PWR_RT_SLDRChange(int value) { }
        default void onVC_PwrIvtrTypChange(int value) { }
        default void onVC_RAIN_WPR_CSOChange(int value) { }
        default void onVC_RainSnsPrsntChange(int value) { }
        default void onVC_RDY_DRV_CSOChange(int value) { }
        default void onVC_REAR_CMRA_CSOChange(int value) { }
        default void onVC_REAR_CMRA_DLY_CSOChange(int value) { }
        default void onVC_RearDoorLocks2DCMChange(int value) { }
        default void onVC_RedKeyChange(int value) { }
        default void onVC_RemStPrsntChange(int value) { }
        default void onVC_RKE_MEM_CSOChange(int value) { }
        default void onVC_RKE_PRSNTChange(int value) { }
        default void onVC_RKE_UNLK_CSOChange(int value) { }
        default void onVC_RR_DuallyPrsntChange(int value) { }
        default void onVC_RunFlatTirePrsntChange(int value) { }
        default void onVC_RVCM_PrsntChange(int value) { }
        default void onVC_SBR_PrsntChange(int value) { }
        default void onVC_SCR_PrsntChange(int value) { }
        default void onVC_SecLkPrsntChange(int value) { }
        default void onVC_SecPrkPrsntChange(int value) { }
        default void onVC_ShftInd_PrsntChange(int value) { }
        default void onVC_ShftrTypChange(int value) { }
        default void onVC_SKIM_PRSNTChange(int value) { }
        default void onVC_SLD_DR_ALRT_CSOChange(int value) { }
        default void onVC_SLD_DR_CHM_CSOChange(int value) { }
        default void onVC_SmartAlternatorChange(int value) { }
        default void onVC_SpdLmt_PRSNTChange(int value) { }
        default void onVC_SpecialPKGChange(int value) { }
        default void onVC_SpecialPKG_ICChange(int value) { }
        default void onVC_SPEED_CSOChange(int value) { }
        default void onVC_SPEED_WARNING_CSOChange(int value) { }
        default void onVC_SPORT_PRSNTChange(int value) { }
        default void onVC_SRT_PRSNTChange(int value) { }
        default void onVC_SSC_PrsntChange(int value) { }
        default void onVC_STP_PRSNTChange(int value) { }
        default void onVC_Strng_Rt_0Change(float value) { }
        default void onVC_Strng_Rt_Mns1Change(float value) { }
        default void onVC_Strng_Rt_Mns2Change(float value) { }
        default void onVC_Strng_Rt_Mns3Change(float value) { }
        default void onVC_Strng_Rt_Mns4Change(float value) { }
        default void onVC_Strng_Rt_Mns5Change(float value) { }
        default void onVC_Strng_Rt_pls1Change(float value) { }
        default void onVC_Strng_Rt_pls2Change(float value) { }
        default void onVC_Strng_Rt_pls3Change(float value) { }
        default void onVC_Strng_Rt_pls4Change(float value) { }
        default void onVC_Strng_Rt_pls5Change(float value) { }
        default void onVC_SUNR_PrsntChange(int value) { }
        default void onVC_SunShade_PresentChange(int value) { }
        default void onVC_Suspension_TypeChange(int value) { }
        default void onVC_SuspPrsntChange(int value) { }
        default void onVC_SVC_DELAY_CSOChange(int value) { }
        default void onVC_SVC_GRIDLINES_CSOChange(int value) { }
        default void onVC_SVC_PrsntChange(int value) { }
        default void onVC_TCASE_HI_RATIOChange(float value) { }
        default void onVC_TCASE_LO_RATIOChange(float value) { }
        default void onVC_TcaseTypChange(int value) { }
        default void onVC_TEEN_AUTO_HB_CSOChange(int value) { }
        default void onVC_TEEN_BLIND_SPOT_CSOChange(int value) { }
        default void onVC_TEEN_FCW_BRK_CSOChange(int value) { }
        default void onVC_TEEN_FCW_SENS_CSOChange(int value) { }
        default void onVC_TEEN_FT_PRK_VOL_CSOChange(int value) { }
        default void onVC_TEEN_FUEL_POPUP_CSOChange(int value) { }
        default void onVC_TEEN_FUEL_WRN_CSOChange(int value) { }
        default void onVC_TEEN_LGHT_WPR_CSOChange(int value) { }
        default void onVC_TEEN_MAX_SPEED_CSOChange(int value) { }
        default void onVC_TEEN_PLG_CHIME_CSOChange(int value) { }
        default void onVC_TEEN_PRK_ASST_CSOChange(int value) { }
        default void onVC_TEEN_RAIN_WPR_CSOChange(int value) { }
        default void onVC_TEEN_RR_PRK_VOL_CSOChange(int value) { }
        default void onVC_TEEN_SLD_DR_ALRT_CSOChange(int value) { }
        default void onVC_TEEN_SLD_DR_CHM_CSOChange(int value) { }
        default void onVC_TeenKeyChange(int value) { }
        default void onVC_TEMP_CSOChange(int value) { }
        default void onVC_TEMP_DISPChange(int value) { }
        default void onVC_ThatchamPrsntChange(int value) { }
        default void onVC_TIRE_CIRCUMFChange(int value) { }
        default void onVC_TireCircumfFTChange(int value) { }
        default void onVC_TLT_MRR_CSOChange(int value) { }
        default void onVC_TORQUE_CSOChange(int value) { }
        default void onVC_TPMS_ConfigurationChange(int value) { }
        default void onVC_Trans_EquippedChange(int value) { }
        default void onVC_Trans_N_Hold_PrsntChange(int value) { }
        default void onVC_TransTypeChange(int value) { }
        default void onVC_TRLR_CSOChange(int value) { }
        default void onVC_TRLR_NAME_CSOChange(int value) { }
        default void onVC_TRLR_TYPE_CSOChange(int value) { }
        default void onVC_TRNS_MD_CSOChange(int value) { }
        default void onVC_TrnsDrvMdPrsntChange(int value) { }
        default void onVC_TSBM_PrsntChange(int value) { }
        default void onVC_UNIT_SET_CSOChange(int value) { }
        default void onVC_US_METRIC_CSOChange(int value) { }
        default void onVC_VEH_BRANDChange(int value) { }
        default void onVC_VEH_LINEChange(int value) { }
        default void onVC_VehCfg1_StatChange(int value) { }
        default void onVC_VehCfg2_StatChange(int value) { }
        default void onVC_VehCfg3_StatChange(int value) { }
        default void onVC_VehCfg4_StatChange(int value) { }
        default void onVC_VehCfg5_StatChange(int value) { }
        default void onVC_VehCfg6_StatChange(int value) { }
        default void onVC_VehCfg7_StatChange(int value) { }
        default void onVC_VehCfgCSO1_StatChange(int value) { }
        default void onVC_VehCfgCSO2_StatChange(int value) { }
        default void onVC_WHL_ALGN_CSOChange(int value) { }
        default void onVC_WHL_BASEChange(int value) { }
        default void onVC_WIN_EXPR_FEATChange(int value) { }
        default void onVC_WTS_PrsntChange(int value) { }
        default void onVC_XWDChange(int value) { }
        default void onVIN_MSGChange(int value) { }
    }
}
