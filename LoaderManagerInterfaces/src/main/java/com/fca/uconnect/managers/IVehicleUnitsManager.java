package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleUnitsManager
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
public interface IVehicleUnitsManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_CONSUMPTION_UNIT_KMPL    = 0;
    public static final int VALUE_CONSUMPTION_UNIT_LP100KM = 1;
    public static final int VALUE_CONSUMPTION_UNIT_MPG_UK  = 2;
    public static final int VALUE_CONSUMPTION_UNIT_MPG_US  = 3;
    public static final int VALUE_CONSUMPTION_UNIT_SNA     = 7;

    public static final int VALUE_CONSUMPTIONUNIT_REQ_KM_PER_LITRE        = 0;
    public static final int VALUE_CONSUMPTIONUNIT_REQ_LITRES_PER_100KM    = 1;
    public static final int VALUE_CONSUMPTIONUNIT_REQ_MILES_PER_GALLON_UK = 2;
    public static final int VALUE_CONSUMPTIONUNIT_REQ_MILES_PER_GALLON_US = 3;

    public static final int VALUE_DISTANCE_UNIT_KM = 0;
    public static final int VALUE_DISTANCE_UNIT_MI = 1;

    public static final int VALUE_EV_CONSUMPTIONUNIT_KM_PER_KWH    = 0;
    public static final int VALUE_EV_CONSUMPTIONUNIT_KWH_PER_100KM = 1;
    public static final int VALUE_EV_CONSUMPTIONUNIT_MILES_PER_KWH = 2;
    public static final int VALUE_EV_CONSUMPTIONUNIT_KWH_PER_MILES = 3;
    public static final int VALUE_EV_CONSUMPTIONUNIT_M_P_GE        = 4;

    public static final int VALUE_EV_CONSUMPTIONUNIT_REQ_KM_PER_KWH    = 0;
    public static final int VALUE_EV_CONSUMPTIONUNIT_REQ_KWH_PER_100KM = 1;
    public static final int VALUE_EV_CONSUMPTIONUNIT_REQ_MILES_PER_KWH = 2;
    public static final int VALUE_EV_CONSUMPTIONUNIT_REQ_KWH_PER_MILES = 3;
    public static final int VALUE_EV_CONSUMPTIONUNIT_REQ_M_P_GE        = 4;

    public static final int VALUE_LWS_ANGLE_TYPE_ABSOLUTE = 0;
    public static final int VALUE_LWS_ANGLE_TYPE_RELATIVE = 1;
    public static final int VALUE_LWS_ANGLE_TYPE_SNA      = 2;

    public static final int VALUE_POWER_UNIT_KW    = 0;
    public static final int VALUE_POWER_UNIT_HP_UK = 1;
    public static final int VALUE_POWER_UNIT_HP_U  = 2;

    public static final int VALUE_PRESSURE_UNIT_KPA = 0;
    public static final int VALUE_PRESSURE_UNIT_BAR = 1;
    public static final int VALUE_PRESSURE_UNIT_PSI = 2;

    public static final int VALUE_SPEED_UNIT_KPH = 0;
    public static final int VALUE_SPEED_UNIT_MPH = 1;

    public static final int VALUE_TEMPERATURE_UNIT_C = 0;
    public static final int VALUE_TEMPERATURE_UNIT_F = 1;

    public static final int VALUE_TORQUE_UNIT_NM   = 0;
    public static final int VALUE_TORQUE_UNIT_FTLB = 1;

    /**
     * Gets the ConsumptionUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_CONSUMPTION_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getConsumptionUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ConsumptionUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerConsumptionUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ConsumptionUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterConsumptionUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Request the ConsumptionUnit_Req of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetConsumptionUnit_ReqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_WRITE_HIGH
     */
    void setConsumptionUnit_Req(int value, FcaIVehicleUnitsManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the DistanceUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_DISTANCE_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getDistanceUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to DistanceUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerDistanceUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to DistanceUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterDistanceUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Gets the EV_ConsumptionUnit from the vehicle.
     * @base ATL - BEV
     * @return VALUE_EV_CONSUMPTIONUNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getEV_ConsumptionUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to EV_ConsumptionUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerEV_ConsumptionUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to EV_ConsumptionUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterEV_ConsumptionUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Request the EV_ConsumptionUnit_Req of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetEV_ConsumptionUnit_ReqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_WRITE_HIGH
     */
    void setEV_ConsumptionUnit_Req(int value, FcaIVehicleUnitsManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the LwsAngleType from the vehicle.
     * @base ATL - MP
     * @return VALUE_LWS_ANGLE_TYPE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getLwsAngleType() throws PropertyNotSupported;

    /**
     * Registers listening to changes to LwsAngleType.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerLwsAngleTypeChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to LwsAngleType.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterLwsAngleTypeChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Gets the PowerUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_POWER_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getPowerUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PowerUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerPowerUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PowerUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterPowerUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Gets the PressureUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PRESSURE_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getPressureUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PressureUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerPressureUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PressureUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterPressureUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Gets the SpeedUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_SPEED_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getSpeedUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SpeedUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerSpeedUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SpeedUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterSpeedUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Gets the TemperatureUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TEMPERATURE_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getTemperatureUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TemperatureUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerTemperatureUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TemperatureUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterTemperatureUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Gets the TorqueUnit from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_TORQUE_UNIT
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    int getTorqueUnit() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TorqueUnit.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean registerTorqueUnitChange(FcaIVehicleUnitsManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TorqueUnit.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHUNIT_READ_LOW
     */
    boolean unregisterTorqueUnitChange(FcaIVehicleUnitsManagerCallback callback);

    /**
     * Callback interface to register IVehicleUnitsManager against.
     */
    public interface FcaIVehicleUnitsManagerCallback {
        default void onConsumptionUnitChange(int value) { }
        default void onSetConsumptionUnit_ReqFailed() { }
        default void onDistanceUnitChange(int value) { }
        default void onEV_ConsumptionUnitChange(int value) { }
        default void onSetEV_ConsumptionUnit_ReqFailed() { }
        default void onLwsAngleTypeChange(int value) { }
        default void onPowerUnitChange(int value) { }
        default void onPressureUnitChange(int value) { }
        default void onSpeedUnitChange(int value) { }
        default void onTemperatureUnitChange(int value) { }
        default void onTorqueUnitChange(int value) { }
    }
}
