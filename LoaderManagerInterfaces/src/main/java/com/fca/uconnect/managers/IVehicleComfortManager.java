package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleComfortManager
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
public interface IVehicleComfortManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_AVERAGE_TEMP_C_SNA = 511;

    public static final int VALUE_AVERAGE_TEMP_F_SNA = 511;

    public static final int VALUE_FT_DRV_ATC_TEMP_MAS_SNA = 2147483647;

    public static final int VALUE_FT_PSG_ATC_TEMP_MAS_SNA = 2147483647;

    /**
     * Gets the AMB_TEMP_AVG from the vehicle.
     * @base PN - RUPHEV
     * @return C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    float getAMB_TEMP_AVG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AMB_TEMP_AVG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean registerAMB_TEMP_AVGChange(FcaIVehicleComfortManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AMB_TEMP_AVG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean unregisterAMB_TEMP_AVGChange(FcaIVehicleComfortManagerCallback callback);

    /**
     * Gets the AMB_TEMP_AVG_F from the vehicle.
     * @base PN - RUPHEV
     * @return °F
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    int getAMB_TEMP_AVG_F() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AMB_TEMP_AVG_F.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean registerAMB_TEMP_AVG_FChange(FcaIVehicleComfortManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AMB_TEMP_AVG_F.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean unregisterAMB_TEMP_AVG_FChange(FcaIVehicleComfortManagerCallback callback);

    /**
     * Gets the AverageTempC from the vehicle.
     * @base PN - RUPHEV
     * @return °C
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    float getAverageTempC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AverageTempC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean registerAverageTempCChange(FcaIVehicleComfortManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AverageTempC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean unregisterAverageTempCChange(FcaIVehicleComfortManagerCallback callback);

    /**
     * Gets the AverageTempF from the vehicle.
     * @base ATL -MP
     * @return F
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    int getAverageTempF() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AverageTempF.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean registerAverageTempFChange(FcaIVehicleComfortManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AverageTempF.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean unregisterAverageTempFChange(FcaIVehicleComfortManagerCallback callback);

    /**
     * Gets the FT_DRV_ATC_TEMP_MAS from the vehicle.
     * @base PN - MASPN
     * @return degrees
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    int getFT_DRV_ATC_TEMP_MAS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_DRV_ATC_TEMP_MAS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean registerFT_DRV_ATC_TEMP_MASChange(FcaIVehicleComfortManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_DRV_ATC_TEMP_MAS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean unregisterFT_DRV_ATC_TEMP_MASChange(FcaIVehicleComfortManagerCallback callback);

    /**
     * Gets the FT_PSG_ATC_TEMP_MAS from the vehicle.
     * @base PN - MASPN
     * @return degrees
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    int getFT_PSG_ATC_TEMP_MAS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FT_PSG_ATC_TEMP_MAS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean registerFT_PSG_ATC_TEMP_MASChange(FcaIVehicleComfortManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FT_PSG_ATC_TEMP_MAS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCOMFORT_READ_HIGH
     */
    boolean unregisterFT_PSG_ATC_TEMP_MASChange(FcaIVehicleComfortManagerCallback callback);

    /**
     * Callback interface to register IVehicleComfortManager against.
     */
    public interface FcaIVehicleComfortManagerCallback {
        default void onAMB_TEMP_AVGChange(float value) { }
        default void onAMB_TEMP_AVG_FChange(int value) { }
        default void onAverageTempCChange(float value) { }
        default void onAverageTempFChange(int value) { }
        default void onFT_DRV_ATC_TEMP_MASChange(int value) { }
        default void onFT_PSG_ATC_TEMP_MASChange(int value) { }
    }
}
