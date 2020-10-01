package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleHVACManager
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
public interface IVehicleHVACManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_COMPRESSOR_STS_NOT_USED                         = 0;
    public static final int VALUE_COMPRESSOR_STS_NOT_INSERTED_BY_NCM              = 1;
    public static final int VALUE_COMPRESSOR_STS_NOT_INSRTD_BY_DRIVER_OR_SECURITY = 2;
    public static final int VALUE_COMPRESSOR_STS_INSERTED                         = 3;

    public static final int VALUE_COMP_STAT_NORMAL_OPERATION   = 0;
    public static final int VALUE_COMP_STAT_DEGRADED_OPERATION = 1;
    public static final int VALUE_COMP_STAT_INOPERATIVE        = 2;
    public static final int VALUE_COMP_STAT_RESERVED1          = 3;
    public static final int VALUE_COMP_STAT_RESERVED2          = 4;
    public static final int VALUE_COMP_STAT_RESERVED3          = 5;
    public static final int VALUE_COMP_STAT_RESERVED4          = 6;
    public static final int VALUE_COMP_STAT_SNA                = 15;

    public static final int VALUE_F_A_N_REQUEST_N_C_A_OFF        = 0;
    public static final int VALUE_F_A_N_REQUEST_N_C_A_LOW_SPEED  = 1;
    public static final int VALUE_F_A_N_REQUEST_N_C_A_HIGH_SPEED = 2;
    public static final int VALUE_F_A_N_REQUEST_N_C_A_SNA        = 3;

    public static final int VALUE_FT_HVAC_CTRL_STAT_HVAC_CTRL_OFF    = 0;
    public static final int VALUE_FT_HVAC_CTRL_STAT_BLW_AUTO_MD_AUTO = 1;
    public static final int VALUE_FT_HVAC_CTRL_STAT_BLW_AUTO_MD_MAN  = 2;
    public static final int VALUE_FT_HVAC_CTRL_STAT_BLW_MAN_MD_AUTO  = 3;
    public static final int VALUE_FT_HVAC_CTRL_STAT_BLW_MAN_MD_MAN   = 4;
    public static final int VALUE_FT_HVAC_CTRL_STAT_SNA              = 7;

    public static final int VALUE_FT_HVAC_MD_STAT_DEFR_MD           = 0;
    public static final int VALUE_FT_HVAC_MD_STAT_MIX_DEFR_MID_MD   = 1;
    public static final int VALUE_FT_HVAC_MD_STAT_MIX_MD            = 2;
    public static final int VALUE_FT_HVAC_MD_STAT_FLR_MIX_MID_MD    = 3;
    public static final int VALUE_FT_HVAC_MD_STAT_FLR_MD            = 4;
    public static final int VALUE_FT_HVAC_MD_STAT_BI_LVL_FLR_MID_MD = 5;
    public static final int VALUE_FT_HVAC_MD_STAT_BI_LVL_MD         = 6;
    public static final int VALUE_FT_HVAC_MD_STAT_PNL_BI_LVL_MID_MD = 7;
    public static final int VALUE_FT_HVAC_MD_STAT_PNL_MD            = 8;
    public static final int VALUE_FT_HVAC_MD_STAT_SNA               = 15;

    public static final int VALUE_FT_PSG_ATC_TEMP_FULL_COLD = 0;
    public static final int VALUE_FT_PSG_ATC_TEMP_FULL_HOT  = 126;
    public static final int VALUE_FT_PSG_ATC_TEMP_SNA       = 2147483647;

    public static final int VALUE_R_HVAC_CTRL_STAT_HVAC_CTRL_OFF    = 0;
    public static final int VALUE_R_HVAC_CTRL_STAT_BLW_AUTO_MD_AUTO = 1;
    public static final int VALUE_R_HVAC_CTRL_STAT_BLW_AUTO_MD_MAN  = 2;
    public static final int VALUE_R_HVAC_CTRL_STAT_BLW_MAN_MD_AUTO  = 3;
    public static final int VALUE_R_HVAC_CTRL_STAT_BLW_MAN_MD_MAN   = 4;
    public static final int VALUE_R_HVAC_CTRL_STAT_SNA              = 7;

    public static final int VALUE_R_HVAC_MD_STAT_FLR_MD            = 0;
    public static final int VALUE_R_HVAC_MD_STAT_BI_LVL_FLR_MID_MD = 1;
    public static final int VALUE_R_HVAC_MD_STAT_BI_LVL_MD         = 2;
    public static final int VALUE_R_HVAC_MD_STAT_PNL_BI_LVL_MID_MD = 3;
    public static final int VALUE_R_HVAC_MD_STAT_PNL_MD            = 4;
    public static final int VALUE_R_HVAC_MD_STAT_SNA               = 7;

    public static final int VALUE_RL_HEAT_STAT_HS_OFF = 0;
    public static final int VALUE_RL_HEAT_STAT_HS_LO  = 1;
    public static final int VALUE_RL_HEAT_STAT_HS_MID = 2;
    public static final int VALUE_RL_HEAT_STAT_HS_HI  = 3;

    public static final int VALUE_RR_HEAT_STAT_HS_OFF = 0;
    public static final int VALUE_RR_HEAT_STAT_HS_LO  = 1;
    public static final int VALUE_RR_HEAT_STAT_HS_MID = 2;
    public static final int VALUE_RR_HEAT_STAT_HS_HI  = 3;

    /**
     * Gets the CompressorSts from the vehicle.
     * @base ATL - MP
     * @return VALUE_COMPRESSOR_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getCompressorSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CompressorSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerCompressorStsChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CompressorSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterCompressorStsChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the CompStat from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMP_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getCompStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CompStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerCompStatChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CompStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterCompStatChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the FANRequestNCA from the vehicle.
     * @base ATL - MP
     * @return VALUE_F_A_N_REQUEST_N_C_A
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getFANRequestNCA() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FANRequestNCA.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerFANRequestNCAChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FANRequestNCA.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterFANRequestNCAChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the FT_DRV_ATC_TEMP from the vehicle.
     * @base PN - RUPHEV
     * @return °
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getFT_DRV_ATC_TEMP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_DRV_ATC_TEMP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerFT_DRV_ATC_TEMPChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_DRV_ATC_TEMP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterFT_DRV_ATC_TEMPChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the FT_HVAC_BLW_FN_SP from the vehicle.
     * @base PN - RUPHEV
     * @return Bars
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getFT_HVAC_BLW_FN_SP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_HVAC_BLW_FN_SP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerFT_HVAC_BLW_FN_SPChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_HVAC_BLW_FN_SP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterFT_HVAC_BLW_FN_SPChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the FT_HVAC_CTRL_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_FT_HVAC_CTRL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getFT_HVAC_CTRL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_HVAC_CTRL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerFT_HVAC_CTRL_STATChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_HVAC_CTRL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterFT_HVAC_CTRL_STATChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the FT_HVAC_MD_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_FT_HVAC_MD_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getFT_HVAC_MD_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_HVAC_MD_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerFT_HVAC_MD_STATChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_HVAC_MD_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterFT_HVAC_MD_STATChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the FT_PSG_ATC_TEMP from the vehicle.
     * @base PN - RUPHEV
     * @return °
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getFT_PSG_ATC_TEMP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_PSG_ATC_TEMP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerFT_PSG_ATC_TEMPChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_PSG_ATC_TEMP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterFT_PSG_ATC_TEMPChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the R_FOG_RQ from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getR_FOG_RQ() throws PropertyNotSupported;

    /**
     * Registers listening to changes to R_FOG_RQ.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerR_FOG_RQChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to R_FOG_RQ.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterR_FOG_RQChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the R_HVAC_BLW_FN_SP from the vehicle.
     * @base PN - RUPHEV
     * @return Bars
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getR_HVAC_BLW_FN_SP() throws PropertyNotSupported;

    /**
     * Registers listening to changes to R_HVAC_BLW_FN_SP.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerR_HVAC_BLW_FN_SPChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to R_HVAC_BLW_FN_SP.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterR_HVAC_BLW_FN_SPChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the R_HVAC_CTRL_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_R_HVAC_CTRL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getR_HVAC_CTRL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to R_HVAC_CTRL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerR_HVAC_CTRL_STATChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to R_HVAC_CTRL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterR_HVAC_CTRL_STATChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the R_HVAC_MD_STAT from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_R_HVAC_MD_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getR_HVAC_MD_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to R_HVAC_MD_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerR_HVAC_MD_STATChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to R_HVAC_MD_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterR_HVAC_MD_STATChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the RearModeCntrl from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getRearModeCntrl() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RearModeCntrl.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerRearModeCntrlChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RearModeCntrl.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterRearModeCntrlChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the RL_HEAT_STAT from the vehicle.
     * @base PN - MASPN
     * @return VALUE_RL_HEAT_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getRL_HEAT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RL_HEAT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerRL_HEAT_STATChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RL_HEAT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterRL_HEAT_STATChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Gets the RR_HEAT_STAT from the vehicle.
     * @base PN - MASPN
     * @return VALUE_RR_HEAT_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getRR_HEAT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RR_HEAT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerRR_HEAT_STATChange(FcaIVehicleHVACManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RR_HEAT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterRR_HEAT_STATChange(FcaIVehicleHVACManagerCallback callback);

    /**
     * Callback interface to register IVehicleHVACManager against.
     */
    public interface FcaIVehicleHVACManagerCallback {
        default void onCompressorStsChange(int value) { }
        default void onCompStatChange(int value) { }
        default void onFANRequestNCAChange(int value) { }
        default void onFT_DRV_ATC_TEMPChange(int value) { }
        default void onFT_HVAC_BLW_FN_SPChange(int value) { }
        default void onFT_HVAC_CTRL_STATChange(int value) { }
        default void onFT_HVAC_MD_STATChange(int value) { }
        default void onFT_PSG_ATC_TEMPChange(int value) { }
        default void onR_FOG_RQChange(int value) { }
        default void onR_HVAC_BLW_FN_SPChange(int value) { }
        default void onR_HVAC_CTRL_STATChange(int value) { }
        default void onR_HVAC_MD_STATChange(int value) { }
        default void onRearModeCntrlChange(int value) { }
        default void onRL_HEAT_STATChange(int value) { }
        default void onRR_HEAT_STATChange(int value) { }
    }
}
