package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehiclePowerTrainManager
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
public interface IVehiclePowerTrainManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_APM_FAILUREREASON_NO_FAILURE                     = 0;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_VOLTAGE_AT_HV        = 1;
    public static final int VALUE_APM_FAILUREREASON_FAIL_LOW_VOLTAGE_AT_HV         = 2;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_VOLTAGE_AT_LV        = 3;
    public static final int VALUE_APM_FAILUREREASON_FAIL_LOW_VOLTAGE_AT_LV         = 4;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_PCB_TEMPERATURE      = 5;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_DBC_TEMPERATURE      = 6;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_CUR_AT_LV            = 7;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_CURR_AT_HV           = 8;
    public static final int VALUE_APM_FAILUREREASON_FAIL_SHORT_CIRC_AT_LV          = 9;
    public static final int VALUE_APM_FAILUREREASON_FAIL_SHORT_CIRC_AT_HV          = 10;
    public static final int VALUE_APM_FAILUREREASON_FAIL_OPEN_CIRC_AT_LV           = 11;
    public static final int VALUE_APM_FAILUREREASON_FAIL_OPEN_CIRC_AT_HV           = 12;
    public static final int VALUE_APM_FAILUREREASON_FAIL_INIT_FAILURE              = 13;
    public static final int VALUE_APM_FAILUREREASON_FAIL_WAKE_UP_ISSUE             = 14;
    public static final int VALUE_APM_FAILUREREASON_FAIL_INTERNAL_HARDWARE         = 15;
    public static final int VALUE_APM_FAILUREREASON_FAIL_BAT_FEED_LOW              = 16;
    public static final int VALUE_APM_FAILUREREASON_FAIL_BAT_FEED_HIGH_            = 17;
    public static final int VALUE_APM_FAILUREREASON_FAIL_AUX_OV                    = 18;
    public static final int VALUE_APM_FAILUREREASON_FAIL_AUX_UV                    = 19;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HVIL_FAULT                = 20;
    public static final int VALUE_APM_FAILUREREASON_FAIL_LOC_WITH_HCP              = 21;
    public static final int VALUE_APM_FAILUREREASON_FAIL_LOC_WITH_BPCM             = 22;
    public static final int VALUE_APM_FAILUREREASON_FAIL_CONT_NOT_CLOSED           = 23;
    public static final int VALUE_APM_FAILUREREASON_FAIL_SBC_FAULT                 = 24;
    public static final int VALUE_APM_FAILUREREASON_MEMORY_FAIL                    = 25;
    public static final int VALUE_APM_FAILUREREASON_IMPLAUSIBLE_DATA_FROM_HCP      = 26;
    public static final int VALUE_APM_FAILUREREASON_IMPLAUSIBLE_DATA_FROM_BPCM     = 27;
    public static final int VALUE_APM_FAILUREREASON_CAN_BUS_OFF                    = 28;
    public static final int VALUE_APM_FAILUREREASON_FAIL_TEMP_DIFF_IS_HIGH         = 29;
    public static final int VALUE_APM_FAILUREREASON_FAIL_HIGH_VOLTAGE_DIFF_IS_HIGH = 30;
    public static final int VALUE_APM_FAILUREREASON_FAIL_FOR_OTHER_REASON          = 31;
    public static final int VALUE_APM_FAILUREREASON_LOC_ORC                        = 32;
    public static final int VALUE_APM_FAILUREREASON_IMPLAUSIBLE_DATA_ORC           = 33;
    public static final int VALUE_APM_FAILUREREASON_SNA                            = 63;

    public static final int VALUE_APM_OPERMODESTATUS_IDLE         = 0;
    public static final int VALUE_APM_OPERMODESTATUS_BUCK_CV      = 1;
    public static final int VALUE_APM_OPERMODESTATUS_BUCK_CC      = 2;
    public static final int VALUE_APM_OPERMODESTATUS_BUCK_CP      = 3;
    public static final int VALUE_APM_OPERMODESTATUS_BUCK_SPECIAL = 4;
    public static final int VALUE_APM_OPERMODESTATUS_BOOST        = 5;
    public static final int VALUE_APM_OPERMODESTATUS_PRECHARGE    = 6;
    public static final int VALUE_APM_OPERMODESTATUS_DISCHARGE    = 7;
    public static final int VALUE_APM_OPERMODESTATUS_FAILURE      = 8;
    public static final int VALUE_APM_OPERMODESTATUS_SNA          = 15;

    public static final int VALUE_ENGINE_ASPIRATION_INTAKE_NORM = 0;
    public static final int VALUE_ENGINE_ASPIRATION_TURBO1      = 1;
    public static final int VALUE_ENGINE_ASPIRATION_TURBO2      = 2;
    public static final int VALUE_ENGINE_ASPIRATION_SUPER       = 3;
    public static final int VALUE_ENGINE_ASPIRATION_SNA         = 7;

    public static final int VALUE_ENGINE_TORQUE_DRIVER_REQ_SNA = 2147483647;

    public static final int VALUE_FT_RR_SYNCREQ_NOT_ACTIVE = 0;
    public static final int VALUE_FT_RR_SYNCREQ_ACTIVE     = 1;

    public static final int VALUE_FT_RRCOUPLINGTRQ_PERCENTAGE_SNA = 2147483647;

    public static final int VALUE_HP_ENGPWRMD_BLACK_SNA = 1023;

    public static final int VALUE_MAX_ENGINE_TORQUE_SNA = 2147483647;

    public static final int VALUE_POWER_LEVEL_LEVEL1 = 0;
    public static final int VALUE_POWER_LEVEL_LEVEL2 = 1;
    public static final int VALUE_POWER_LEVEL_LEVEL3 = 2;
    public static final int VALUE_POWER_LEVEL_LEVEL4 = 3;
    public static final int VALUE_POWER_LEVEL_LEVEL5 = 4;

    public static final int VALUE_POWER_LEVEL_REQ_LEVEL1 = 0;
    public static final int VALUE_POWER_LEVEL_REQ_LEVEL2 = 1;
    public static final int VALUE_POWER_LEVEL_REQ_LEVEL3 = 2;
    public static final int VALUE_POWER_LEVEL_REQ_LEVEL4 = 3;
    public static final int VALUE_POWER_LEVEL_REQ_LEVEL5 = 4;

    public static final int VALUE_TCASE4_LOW_OFF   = 0;
    public static final int VALUE_TCASE4_LOW_CONT  = 1;
    public static final int VALUE_TCASE4_LOW_BLINK = 2;
    public static final int VALUE_TCASE4_LOW_SNA   = 3;

    public static final int VALUE_TCASE_NTRL_STAT_OFF   = 0;
    public static final int VALUE_TCASE_NTRL_STAT_CONT  = 1;
    public static final int VALUE_TCASE_NTRL_STAT_BLINK = 2;
    public static final int VALUE_TCASE_NTRL_STAT_SNA   = 3;

    public static final int VALUE_TCASERANGESTATUS_HIGH = 0;
    public static final int VALUE_TCASERANGESTATUS_NTRL = 1;
    public static final int VALUE_TCASERANGESTATUS_LOW  = 2;
    public static final int VALUE_TCASERANGESTATUS_SNA  = 3;

    public static final int VALUE_TX_WARN_NONE    = 0;
    public static final int VALUE_TX_WARN_WARN_1  = 1;
    public static final int VALUE_TX_WARN_WARN_2  = 2;
    public static final int VALUE_TX_WARN_WARN_3  = 3;
    public static final int VALUE_TX_WARN_WARN_4  = 4;
    public static final int VALUE_TX_WARN_WARN_5  = 5;
    public static final int VALUE_TX_WARN_WARN_6  = 6;
    public static final int VALUE_TX_WARN_WARN_7  = 7;
    public static final int VALUE_TX_WARN_WARN_8  = 8;
    public static final int VALUE_TX_WARN_WARN_9  = 9;
    public static final int VALUE_TX_WARN_WARN_10 = 10;
    public static final int VALUE_TX_WARN_WARN_11 = 11;
    public static final int VALUE_TX_WARN_WARN_12 = 12;
    public static final int VALUE_TX_WARN_WARN_13 = 13;
    public static final int VALUE_TX_WARN_WARN_14 = 14;
    public static final int VALUE_TX_WARN_SNA     = 15;

    /**
     * Gets the ActualRearDifferentialTorqueLock from the vehicle.
     * @base ATLH - WL
     * @return NM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getActualRearDifferentialTorqueLock() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ActualRearDifferentialTorqueLock.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerActualRearDifferentialTorqueLockChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ActualRearDifferentialTorqueLock.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterActualRearDifferentialTorqueLockChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the AirFuelRatio from the vehicle.
     * @base WD Only
     * @return lambda
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getAirFuelRatio() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AirFuelRatio.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerAirFuelRatioChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AirFuelRatio.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterAirFuelRatioChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the AirPress_Outsd from the vehicle.
     * @base PN - RUPHEV
     * @return kPaA
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getAirPress_Outsd() throws PropertyNotSupported;

    /**
     * Registers listening to changes to AirPress_Outsd.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerAirPress_OutsdChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to AirPress_Outsd.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterAirPress_OutsdChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the APM_FailureReason from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_APM_FAILUREREASON
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getAPM_FailureReason() throws PropertyNotSupported;

    /**
     * Registers listening to changes to APM_FailureReason.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerAPM_FailureReasonChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to APM_FailureReason.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterAPM_FailureReasonChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the APM_OperModeStatus from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_APM_OPERMODESTATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getAPM_OperModeStatus() throws PropertyNotSupported;

    /**
     * Registers listening to changes to APM_OperModeStatus.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerAPM_OperModeStatusChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to APM_OperModeStatus.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterAPM_OperModeStatusChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the APM_OutputPower from the vehicle.
     * @base PN - RUPHEV
     * @return W
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getAPM_OutputPower() throws PropertyNotSupported;

    /**
     * Registers listening to changes to APM_OutputPower.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerAPM_OutputPowerChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to APM_OutputPower.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterAPM_OutputPowerChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the BARO_ENG from the vehicle.
     * @base PN - RUPHEV
     * @return kPaA
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getBARO_ENG() throws PropertyNotSupported;

    /**
     * Registers listening to changes to BARO_ENG.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerBARO_ENGChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to BARO_ENG.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterBARO_ENGChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the Displacement from the vehicle.
     * @base PN - RUPHEV
     * @return liters
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getDisplacement() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Displacement.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerDisplacementChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Displacement.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterDisplacementChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the EngineAspiration from the vehicle.
     * @base PN - MASPN
     * @return VALUE_ENGINE_ASPIRATION
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getEngineAspiration() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineAspiration.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerEngineAspirationChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineAspiration.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterEngineAspirationChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the EngineTorqueDriverReq from the vehicle.
     * @base ATL - MP
     * @return nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getEngineTorqueDriverReq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngineTorqueDriverReq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerEngineTorqueDriverReqChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngineTorqueDriverReq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterEngineTorqueDriverReqChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the EngLoad_OBD from the vehicle.
     * @base PN - RUPHEV
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getEngLoad_OBD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngLoad_OBD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerEngLoad_OBDChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngLoad_OBD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterEngLoad_OBDChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the EngPwrUsageDisp from the vehicle.
     * @base PN - RUPHEV
     * @return kW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getEngPwrUsageDisp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngPwrUsageDisp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerEngPwrUsageDispChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngPwrUsageDisp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterEngPwrUsageDispChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the EngTrq_Rq_ESC from the vehicle.
     * @base PN - RUPHEV
     * @return Nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getEngTrq_Rq_ESC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EngTrq_Rq_ESC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerEngTrq_Rq_ESCChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EngTrq_Rq_ESC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterEngTrq_Rq_ESCChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the Ft_Rr_SyncReq from the vehicle.
     * @base ATL - MP
     * @return VALUE_FT_RR_SYNCREQ
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getFt_Rr_SyncReq() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Ft_Rr_SyncReq.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerFt_Rr_SyncReqChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Ft_Rr_SyncReq.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterFt_Rr_SyncReqChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the Ft_RrCouplingTrq_percentage from the vehicle.
     * @base ATL - MP
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getFt_RrCouplingTrq_percentage() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Ft_RrCouplingTrq_percentage.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerFt_RrCouplingTrq_percentageChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Ft_RrCouplingTrq_percentage.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterFt_RrCouplingTrq_percentageChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the HP_EngPwrMd_BLACK from the vehicle.
     * @base PNNAWD
     * @return HP
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getHP_EngPwrMd_BLACK() throws PropertyNotSupported;

    /**
     * Registers listening to changes to HP_EngPwrMd_BLACK.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerHP_EngPwrMd_BLACKChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to HP_EngPwrMd_BLACK.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterHP_EngPwrMd_BLACKChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the IntakePressure_2 from the vehicle.
     * @base ATLH - WL
     * @return kPa
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getIntakePressure_2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to IntakePressure_2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerIntakePressure_2Change(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to IntakePressure_2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterIntakePressure_2Change(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the MaxEngineTorque from the vehicle.
     * @base ATL - MP
     * @return nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getMaxEngineTorque() throws PropertyNotSupported;

    /**
     * Registers listening to changes to MaxEngineTorque.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerMaxEngineTorqueChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to MaxEngineTorque.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterMaxEngineTorqueChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the N_Turb from the vehicle.
     * @base ATLH - WL
     * @return RPM
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getN_Turb() throws PropertyNotSupported;

    /**
     * Registers listening to changes to N_Turb.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerN_TurbChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to N_Turb.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterN_TurbChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the PowerLevel from the vehicle.
     * @base ATL - BEV
     * @return VALUE_POWER_LEVEL
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getPowerLevel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PowerLevel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerPowerLevelChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PowerLevel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterPowerLevelChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Request the PowerLevelReq of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetPowerLevelReqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_WRITE_HIGH
     */
    void setPowerLevelReq(int value, FcaIVehiclePowerTrainManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the PrcntCplt from the vehicle.
     * @base PN - MASPN
     * @return %
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getPrcntCplt() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PrcntCplt.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerPrcntCpltChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PrcntCplt.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterPrcntCpltChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the TCASE_FAIL from the vehicle.
     * @base PN -WD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTCASE_FAIL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TCASE_FAIL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTCASE_FAILChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TCASE_FAIL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTCASE_FAILChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the Tcase4Low from the vehicle.
     * @base PN -WD
     * @return VALUE_TCASE4_LOW
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTcase4Low() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Tcase4Low.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTcase4LowChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Tcase4Low.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTcase4LowChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the TcaseNtrlStat from the vehicle.
     * @base PN -WD
     * @return VALUE_TCASE_NTRL_STAT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTcaseNtrlStat() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TcaseNtrlStat.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTcaseNtrlStatChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TcaseNtrlStat.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTcaseNtrlStatChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the TCASERANGESTATUS from the vehicle.
     * @base ATLH - WL
     * @return VALUE_TCASERANGESTATUS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTCASERANGESTATUS() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TCASERANGESTATUS.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTCASERANGESTATUSChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TCASERANGESTATUS.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTCASERANGESTATUSChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the TCM_ManMd from the vehicle.
     * @base PN -WD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTCM_ManMd() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TCM_ManMd.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTCM_ManMdChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TCM_ManMd.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTCM_ManMdChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the Torque from the vehicle.
     * @base PN -WD
     * @return Nm
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getTorque() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Torque.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTorqueChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Torque.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTorqueChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the Trans_Trq_Ratio from the vehicle.
     * @base PN -WD
     * @return 
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    float getTrans_Trq_Ratio() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Trans_Trq_Ratio.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTrans_Trq_RatioChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Trans_Trq_Ratio.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTrans_Trq_RatioChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the TrboBstPress from the vehicle.
     * @base PN - MASPN
     * @return kPaG
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTrboBstPress() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TrboBstPress.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTrboBstPressChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TrboBstPress.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTrboBstPressChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Gets the TX_WARN from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TX_WARN
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    int getTX_WARN() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TX_WARN.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean registerTX_WARNChange(FcaIVehiclePowerTrainManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TX_WARN.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHPOWERTRAIN_READ_HIGH
     */
    boolean unregisterTX_WARNChange(FcaIVehiclePowerTrainManagerCallback callback);

    /**
     * Callback interface to register IVehiclePowerTrainManager against.
     */
    public interface FcaIVehiclePowerTrainManagerCallback {
        default void onActualRearDifferentialTorqueLockChange(int value) { }
        default void onAirFuelRatioChange(float value) { }
        default void onAirPress_OutsdChange(int value) { }
        default void onAPM_FailureReasonChange(int value) { }
        default void onAPM_OperModeStatusChange(float value) { }
        default void onAPM_OutputPowerChange(float value) { }
        default void onBARO_ENGChange(int value) { }
        default void onDisplacementChange(float value) { }
        default void onEngineAspirationChange(int value) { }
        default void onEngineTorqueDriverReqChange(int value) { }
        default void onEngLoad_OBDChange(float value) { }
        default void onEngPwrUsageDispChange(int value) { }
        default void onEngTrq_Rq_ESCChange(float value) { }
        default void onFt_Rr_SyncReqChange(int value) { }
        default void onFt_RrCouplingTrq_percentageChange(float value) { }
        default void onHP_EngPwrMd_BLACKChange(int value) { }
        default void onIntakePressure_2Change(float value) { }
        default void onMaxEngineTorqueChange(int value) { }
        default void onN_TurbChange(int value) { }
        default void onPowerLevelChange(int value) { }
        default void onSetPowerLevelReqFailed() { }
        default void onPrcntCpltChange(int value) { }
        default void onTCASE_FAILChange(int value) { }
        default void onTcase4LowChange(int value) { }
        default void onTcaseNtrlStatChange(int value) { }
        default void onTCASERANGESTATUSChange(int value) { }
        default void onTCM_ManMdChange(int value) { }
        default void onTorqueChange(float value) { }
        default void onTrans_Trq_RatioChange(float value) { }
        default void onTrboBstPressChange(int value) { }
        default void onTX_WARNChange(int value) { }
    }
}
