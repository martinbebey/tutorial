package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleCruiseControlManager
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
public interface IVehicleCruiseControlManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_LANE_DEPART_STAT_OFF   = 0;
    public static final int VALUE_LANE_DEPART_STAT_CONT  = 1;
    public static final int VALUE_LANE_DEPART_STAT_BLINK = 2;
    public static final int VALUE_LANE_DEPART_STAT_SNA   = 3;

    public static final int VALUE_SPEED_CTRL_STAT_OFF   = 0;
    public static final int VALUE_SPEED_CTRL_STAT_CONT  = 1;
    public static final int VALUE_SPEED_CTRL_STAT_BLINK = 2;
    public static final int VALUE_SPEED_CTRL_STAT_SNA   = 3;

    public static final int VALUE_SPEED_LMT_STAT_OFF   = 0;
    public static final int VALUE_SPEED_LMT_STAT_CONT  = 1;
    public static final int VALUE_SPEED_LMT_STAT_BLINK = 2;
    public static final int VALUE_SPEED_LMT_STAT_SNA   = 3;

    /**
     * Gets the ACC_DistSwDec from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getACC_DistSwDec() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ACC_DistSwDec.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerACC_DistSwDecChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ACC_DistSwDec.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterACC_DistSwDecChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the ACC_DistSwInc from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getACC_DistSwInc() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ACC_DistSwInc.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerACC_DistSwIncChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ACC_DistSwInc.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterACC_DistSwIncChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the ACC_On from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getACC_On() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ACC_On.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerACC_OnChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ACC_On.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterACC_OnChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the AcceleratorSts from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getAcceleratorSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AcceleratorSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerAcceleratorStsChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AcceleratorSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterAcceleratorStsChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the AdaptiveCruiseEngaged from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    int getAdaptiveCruiseEngaged() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AdaptiveCruiseEngaged.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean registerAdaptiveCruiseEngagedChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AdaptiveCruiseEngaged.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHHVAC_READ_HIGH
     */
    boolean unregisterAdaptiveCruiseEngagedChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the CC_SetSpdDsplMPH from the vehicle.
     * @base PN - RUPHEV
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getCC_SetSpdDsplMPH() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CC_SetSpdDsplMPH.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerCC_SetSpdDsplMPHChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CC_SetSpdDsplMPH.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterCC_SetSpdDsplMPHChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the CRUISE_EGD from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getCRUISE_EGD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CRUISE_EGD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerCRUISE_EGDChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CRUISE_EGD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterCRUISE_EGDChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the CruiseControlOnOffSts from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getCruiseControlOnOffSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CruiseControlOnOffSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerCruiseControlOnOffStsChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CruiseControlOnOffSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterCruiseControlOnOffStsChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the CrusCnclSwitch from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getCrusCnclSwitch() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CrusCnclSwitch.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerCrusCnclSwitchChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CrusCnclSwitch.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterCrusCnclSwitchChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the DeceleratorSts from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getDeceleratorSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DeceleratorSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerDeceleratorStsChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DeceleratorSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterDeceleratorStsChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the LANE_DEPART_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_LANE_DEPART_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getLANE_DEPART_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LANE_DEPART_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerLANE_DEPART_STATChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LANE_DEPART_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterLANE_DEPART_STATChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the Rel_Pdl_ENG from the vehicle.
     * @base PN - RUPHEV
     * @return Volts
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    float getRel_Pdl_ENG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Rel_Pdl_ENG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerRel_Pdl_ENGChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Rel_Pdl_ENG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterRel_Pdl_ENGChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the Rel_Thrt_ENG from the vehicle.
     * @base PN - RUPHEV
     * @return Volts
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    float getRel_Thrt_ENG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Rel_Thrt_ENG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerRel_Thrt_ENGChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Rel_Thrt_ENG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterRel_Thrt_ENGChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the ResumeSwitch from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getResumeSwitch() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ResumeSwitch.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerResumeSwitchChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ResumeSwitch.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterResumeSwitchChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the SPEED_CTRL_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_SPEED_CTRL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getSPEED_CTRL_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SPEED_CTRL_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerSPEED_CTRL_STATChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SPEED_CTRL_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterSPEED_CTRL_STATChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Gets the SPEED_LMT_STAT from the vehicle.
     * @base ATL - MP
     * @return VALUE_SPEED_LMT_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    int getSPEED_LMT_STAT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SPEED_LMT_STAT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean registerSPEED_LMT_STATChange(FcaIVehicleCruiseControlManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SPEED_LMT_STAT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHCRUISECONTROL_READ_HIGH
     */
    boolean unregisterSPEED_LMT_STATChange(FcaIVehicleCruiseControlManagerCallback callback);

    /**
     * Callback interface to register IVehicleCruiseControlManager against.
     */
    public interface FcaIVehicleCruiseControlManagerCallback {
        default void onACC_DistSwDecChange(int value) { }
        default void onACC_DistSwIncChange(int value) { }
        default void onACC_OnChange(int value) { }
        default void onAcceleratorStsChange(int value) { }
        default void onAdaptiveCruiseEngagedChange(int value) { }
        default void onCC_SetSpdDsplMPHChange(int value) { }
        default void onCRUISE_EGDChange(int value) { }
        default void onCruiseControlOnOffStsChange(int value) { }
        default void onCrusCnclSwitchChange(int value) { }
        default void onDeceleratorStsChange(int value) { }
        default void onLANE_DEPART_STATChange(int value) { }
        default void onRel_Pdl_ENGChange(float value) { }
        default void onRel_Thrt_ENGChange(float value) { }
        default void onResumeSwitchChange(int value) { }
        default void onSPEED_CTRL_STATChange(int value) { }
        default void onSPEED_LMT_STATChange(int value) { }
    }
}
