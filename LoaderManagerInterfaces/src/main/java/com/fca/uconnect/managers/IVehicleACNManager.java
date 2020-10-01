package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleACNManager
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
public interface IVehicleACNManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    /**
     * Gets the IMPACT_A from the vehicle.
     * @base ATL - BEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_A() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_A.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_AChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_A.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_AChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_B from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_BChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_BChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_C from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_CChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_CChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_D from the vehicle.
     * @base ATL - BEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_D() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_D.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_DChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_D.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_DChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_E from the vehicle.
     * @base ATL - BEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_E() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_E.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_EChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_E.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_EChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_F from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_F() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_F.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_FChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_F.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_FChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_G from the vehicle.
     * @base ATL - BEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_G() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_G.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_GChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_G.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_GChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_H from the vehicle.
     * @base ATL - BEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_H() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_H.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_HChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_H.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_HChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_I from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_I() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_I.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_IChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_I.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_IChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_K from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_K() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_K.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_KChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_K.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_KChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_L from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_LChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_LChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_M from the vehicle.
     * @base PN - MASPN
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_MChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_MChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_O from the vehicle.
     * @base ATL - BEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_O() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_O.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_OChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_O.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_OChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Gets the IMPACT_X from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    int getIMPACT_X() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IMPACT_X.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean registerIMPACT_XChange(FcaIVehicleACNManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IMPACT_X.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHACN_READ_HIGH
     */
    boolean unregisterIMPACT_XChange(FcaIVehicleACNManagerCallback callback);

    /**
     * Callback interface to register IVehicleACNManager against.
     */
    public interface FcaIVehicleACNManagerCallback {
        default void onIMPACT_AChange(int value) { }
        default void onIMPACT_BChange(int value) { }
        default void onIMPACT_CChange(int value) { }
        default void onIMPACT_DChange(int value) { }
        default void onIMPACT_EChange(int value) { }
        default void onIMPACT_FChange(int value) { }
        default void onIMPACT_GChange(int value) { }
        default void onIMPACT_HChange(int value) { }
        default void onIMPACT_IChange(int value) { }
        default void onIMPACT_KChange(int value) { }
        default void onIMPACT_LChange(int value) { }
        default void onIMPACT_MChange(int value) { }
        default void onIMPACT_OChange(int value) { }
        default void onIMPACT_XChange(int value) { }
    }
}
