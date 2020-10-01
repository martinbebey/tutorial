package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleTripManager
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
public interface IVehicleTripManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_RESET_TRIP_A_PLUS_A_C_K_NO_ACK_REQUIRED = 0;
    public static final int VALUE_RESET_TRIP_A_PLUS_A_C_K_ACK_KO          = 1;
    public static final int VALUE_RESET_TRIP_A_PLUS_A_C_K_ACK_OK          = 3;

    public static final int VALUE_RESET_TRIP_B_PLUS_A_C_K_NO_ACK_REQUIRED = 0;
    public static final int VALUE_RESET_TRIP_B_PLUS_A_C_K_ACK_KO          = 1;
    public static final int VALUE_RESET_TRIP_B_PLUS_A_C_K_ACK_OK          = 3;

    /**
     * Gets the A_EV_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getA_EV_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to A_EV_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerA_EV_MilesChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to A_EV_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterA_EV_MilesChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the A_Hybrid_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getA_Hybrid_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to A_Hybrid_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerA_Hybrid_MilesChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to A_Hybrid_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterA_Hybrid_MilesChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the A_KMpL from the vehicle.
     * @base PN - RUPHEV
     * @return kmpl
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getA_KMpL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to A_KMpL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerA_KMpLChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to A_KMpL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterA_KMpLChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the A_MPG from the vehicle.
     * @base PN - RUPHEV
     * @return MPG
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getA_MPG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to A_MPG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerA_MPGChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to A_MPG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterA_MPGChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the A_Total_Dist_Kilometers from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getA_Total_Dist_Kilometers() throws PropertyNotSupported;

    /**
     * Registers listening to changes to A_Total_Dist_Kilometers.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerA_Total_Dist_KilometersChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to A_Total_Dist_Kilometers.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterA_Total_Dist_KilometersChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the A_Total_Dist_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getA_Total_Dist_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to A_Total_Dist_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerA_Total_Dist_MilesChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to A_Total_Dist_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterA_Total_Dist_MilesChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_EV_Kilometers from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_EV_Kilometers() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_EV_Kilometers.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_EV_KilometersChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_EV_Kilometers.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_EV_KilometersChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_EV_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_EV_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_EV_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_EV_MilesChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_EV_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_EV_MilesChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_Hybrid_Kilometers from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_Hybrid_Kilometers() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_Hybrid_Kilometers.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_Hybrid_KilometersChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_Hybrid_Kilometers.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_Hybrid_KilometersChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_Hybrid_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_Hybrid_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_Hybrid_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_Hybrid_MilesChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_Hybrid_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_Hybrid_MilesChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_KMpL from the vehicle.
     * @base PN - RUPHEV
     * @return kmpl
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_KMpL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_KMpL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_KMpLChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_KMpL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_KMpLChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_MPG from the vehicle.
     * @base PN - RUPHEV
     * @return MPG
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_MPG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_MPG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_MPGChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_MPG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_MPGChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_Total_Dist_Kilometers from the vehicle.
     * @base PN - RUPHEV
     * @return km
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_Total_Dist_Kilometers() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_Total_Dist_Kilometers.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_Total_Dist_KilometersChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_Total_Dist_Kilometers.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_Total_Dist_KilometersChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the B_Total_Dist_Miles from the vehicle.
     * @base PN - RUPHEV
     * @return Mile
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    float getB_Total_Dist_Miles() throws PropertyNotSupported;

    /**
     * Registers listening to changes to B_Total_Dist_Miles.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerB_Total_Dist_MilesChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to B_Total_Dist_Miles.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterB_Total_Dist_MilesChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the MtrAPwrUsageDisp from the vehicle.
     * @base ATLH - WL
     * @return KW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    int getMtrAPwrUsageDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MtrAPwrUsageDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerMtrAPwrUsageDispChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MtrAPwrUsageDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterMtrAPwrUsageDispChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the MtrBPwrUsageDisp from the vehicle.
     * @base ATLH - WL
     * @return KW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    int getMtrBPwrUsageDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MtrBPwrUsageDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerMtrBPwrUsageDispChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MtrBPwrUsageDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterMtrBPwrUsageDispChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the ResetTripAPlusACK from the vehicle.
     * @base ATL - MP
     * @return VALUE_RESET_TRIP_A_PLUS_A_C_K
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    int getResetTripAPlusACK() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ResetTripAPlusACK.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerResetTripAPlusACKChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ResetTripAPlusACK.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterResetTripAPlusACKChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Gets the ResetTripBPlusACK from the vehicle.
     * @base ATL - MP
     * @return VALUE_RESET_TRIP_B_PLUS_A_C_K
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    int getResetTripBPlusACK() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ResetTripBPlusACK.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean registerResetTripBPlusACKChange(FcaIVehicleTripManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ResetTripBPlusACK.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHTRIP_READ_LOW
     */
    boolean unregisterResetTripBPlusACKChange(FcaIVehicleTripManagerCallback callback);

    /**
     * Callback interface to register IVehicleTripManager against.
     */
    public interface FcaIVehicleTripManagerCallback {
        default void onA_EV_MilesChange(float value) { }
        default void onA_Hybrid_MilesChange(float value) { }
        default void onA_KMpLChange(float value) { }
        default void onA_MPGChange(float value) { }
        default void onA_Total_Dist_KilometersChange(float value) { }
        default void onA_Total_Dist_MilesChange(float value) { }
        default void onB_EV_KilometersChange(float value) { }
        default void onB_EV_MilesChange(float value) { }
        default void onB_Hybrid_KilometersChange(float value) { }
        default void onB_Hybrid_MilesChange(float value) { }
        default void onB_KMpLChange(float value) { }
        default void onB_MPGChange(float value) { }
        default void onB_Total_Dist_KilometersChange(float value) { }
        default void onB_Total_Dist_MilesChange(float value) { }
        default void onMtrAPwrUsageDispChange(int value) { }
        default void onMtrBPwrUsageDispChange(int value) { }
        default void onResetTripAPlusACKChange(int value) { }
        default void onResetTripBPlusACKChange(int value) { }
    }
}
