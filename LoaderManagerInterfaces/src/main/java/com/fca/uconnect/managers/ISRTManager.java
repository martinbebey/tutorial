package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * ISRTManager
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
public interface ISRTManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_SRT_1000FTTM_B_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_1000FTTM_B_TMR_CANCEL = 253;
    public static final int VALUE_SRT_1000FTTM_B_TMR_READY  = 254;
    public static final int VALUE_SRT_1000FTTM_B_SNA        = 2147483647;

    public static final int VALUE_SRT_1000FTTM_C_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_1000FTTM_C_TMR_CANCEL = 253;
    public static final int VALUE_SRT_1000FTTM_C_TMR_READY  = 254;
    public static final int VALUE_SRT_1000FTTM_C_SNA        = 2147483647;

    public static final int VALUE_SRT_1000FTTM_L_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_1000FTTM_L_TMR_CANCEL = 253;
    public static final int VALUE_SRT_1000FTTM_L_TMR_READY  = 254;
    public static final int VALUE_SRT_1000FTTM_L_SNA        = 2147483647;

    public static final int VALUE_SRT_1000FTTMB_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_1000FTTMB_TMR_CANCEL = 253;
    public static final int VALUE_SRT_1000FTTMB_TMR_READY  = 254;
    public static final int VALUE_SRT_1000FTTMB_SNA        = 2147483647;

    public static final int VALUE_SRT_1000FTTMC_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_1000FTTMC_TMR_CANCEL = 253;
    public static final int VALUE_SRT_1000FTTMC_TMR_READY  = 254;
    public static final int VALUE_SRT_1000FTTMC_SNA        = 2147483647;

    public static final int VALUE_SRT_1000FTTML_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_1000FTTML_TMR_CANCEL = 253;
    public static final int VALUE_SRT_1000FTTML_TMR_READY  = 254;
    public static final int VALUE_SRT_1000FTTML_SNA        = 2147483647;

    public static final int VALUE_SRT_100MPHTM_B_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_100MPHTM_B_TMR_CANCEL = 253;
    public static final int VALUE_SRT_100MPHTM_B_TMR_READY  = 254;
    public static final int VALUE_SRT_100MPHTM_B_SNA        = 2147483647;

    public static final int VALUE_SRT_100MPHTM_C_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_100MPHTM_C_TMR_CANCEL = 253;
    public static final int VALUE_SRT_100MPHTM_C_TMR_READY  = 254;
    public static final int VALUE_SRT_100MPHTM_C_SNA        = 2147483647;

    public static final int VALUE_SRT_100MPHTM_L_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_100MPHTM_L_TMR_CANCEL = 253;
    public static final int VALUE_SRT_100MPHTM_L_TMR_READY  = 254;
    public static final int VALUE_SRT_100MPHTM_L_SNA        = 2147483647;

    public static final int VALUE_SRT_100MPHTMB_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_100MPHTMB_TMR_CANCEL = 253;
    public static final int VALUE_SRT_100MPHTMB_TMR_READY  = 254;
    public static final int VALUE_SRT_100MPHTMB_SNA        = 2147483647;

    public static final int VALUE_SRT_100MPHTMC_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_100MPHTMC_TMR_CANCEL = 253;
    public static final int VALUE_SRT_100MPHTMC_TMR_READY  = 254;
    public static final int VALUE_SRT_100MPHTMC_SNA        = 2147483647;

    public static final int VALUE_SRT_100MPHTML_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_100MPHTML_TMR_CANCEL = 253;
    public static final int VALUE_SRT_100MPHTML_TMR_READY  = 254;
    public static final int VALUE_SRT_100MPHTML_SNA        = 2147483647;

    public static final int VALUE_SRT_60MPHTM_B_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_60MPHTM_B_TMR_CANCEL = 253;
    public static final int VALUE_SRT_60MPHTM_B_TMR_READY  = 254;
    public static final int VALUE_SRT_60MPHTM_B_SNA        = 2147483647;

    public static final int VALUE_SRT_60MPHTM_C_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_60MPHTM_C_TMR_CANCEL = 253;
    public static final int VALUE_SRT_60MPHTM_C_TMR_READY  = 254;
    public static final int VALUE_SRT_60MPHTM_C_SNA        = 2147483647;

    public static final int VALUE_SRT_60MPHTM_L_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_60MPHTM_L_TMR_CANCEL = 253;
    public static final int VALUE_SRT_60MPHTM_L_TMR_READY  = 254;
    public static final int VALUE_SRT_60MPHTM_L_SNA        = 2147483647;

    public static final int VALUE_SRT_60MPHTMB_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_60MPHTMB_TMR_CANCEL = 253;
    public static final int VALUE_SRT_60MPHTMB_TMR_READY  = 254;
    public static final int VALUE_SRT_60MPHTMB_SNA        = 2147483647;

    public static final int VALUE_SRT_60MPHTMC_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_60MPHTMC_TMR_CANCEL = 253;
    public static final int VALUE_SRT_60MPHTMC_TMR_READY  = 254;
    public static final int VALUE_SRT_60MPHTMC_SNA        = 2147483647;

    public static final int VALUE_SRT_60MPHTML_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_60MPHTML_TMR_CANCEL = 253;
    public static final int VALUE_SRT_60MPHTML_TMR_READY  = 254;
    public static final int VALUE_SRT_60MPHTML_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKDISTB_M_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKDISTB_M_T_CANCEL   = 253;
    public static final int VALUE_SRT_BRKDISTB_M_T_READY    = 254;
    public static final int VALUE_SRT_BRKDISTB_M_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKDISTB_US_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKDISTB_US_T_CANCEL   = 253;
    public static final int VALUE_SRT_BRKDISTB_US_T_READY    = 254;
    public static final int VALUE_SRT_BRKDISTB_US_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKDISTC_M_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKDISTC_M_T_CANCEL   = 253;
    public static final int VALUE_SRT_BRKDISTC_M_T_READY    = 254;
    public static final int VALUE_SRT_BRKDISTC_M_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKDISTC_US_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKDISTC_US_T_CANCEL   = 253;
    public static final int VALUE_SRT_BRKDISTC_US_T_READY    = 254;
    public static final int VALUE_SRT_BRKDISTC_US_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKDISTL_M_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKDISTL_M_T_CANCEL   = 253;
    public static final int VALUE_SRT_BRKDISTL_M_T_READY    = 254;
    public static final int VALUE_SRT_BRKDISTL_M_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKDISTL_US_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKDISTL_US_T_CANCEL   = 253;
    public static final int VALUE_SRT_BRKDISTL_US_T_READY    = 254;
    public static final int VALUE_SRT_BRKDISTL_US_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKSPDB_M_SNA = 2147483647;

    public static final int VALUE_SRT_BRKSPDB_US_SNA = 2147483647;

    public static final int VALUE_SRT_BRKTM_B_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKTM_B_TMR_CANCEL = 253;
    public static final int VALUE_SRT_BRKTM_B_TMR_READY  = 254;
    public static final int VALUE_SRT_BRKTM_B_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKTM_C_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKTM_C_TMR_CANCEL = 253;
    public static final int VALUE_SRT_BRKTM_C_TMR_READY  = 254;
    public static final int VALUE_SRT_BRKTM_C_SNA        = 2147483647;

    public static final int VALUE_SRT_BRKTM_L_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_BRKTM_L_TMR_CANCEL = 253;
    public static final int VALUE_SRT_BRKTM_L_TMR_READY  = 254;
    public static final int VALUE_SRT_BRKTM_L_SNA        = 2147483647;

    public static final int VALUE_SRT_CTRL3_CURRENT_M   = 0;
    public static final int VALUE_SRT_CTRL3_BEST_M      = 1;
    public static final int VALUE_SRT_CTRL3_LAST_M      = 2;
    public static final int VALUE_SRT_CTRL3_CURRENT_US  = 3;
    public static final int VALUE_SRT_CTRL3_BEST_US     = 4;
    public static final int VALUE_SRT_CTRL3_LAST_US     = 5;
    public static final int VALUE_SRT_CTRL3_CURRENT2_M  = 8;
    public static final int VALUE_SRT_CTRL3_BEST2_M     = 9;
    public static final int VALUE_SRT_CTRL3_LAST2_M     = 10;
    public static final int VALUE_SRT_CTRL3_CURRENT2_US = 11;
    public static final int VALUE_SRT_CTRL3_BEST2_US    = 12;
    public static final int VALUE_SRT_CTRL3_LAST2_US    = 13;
    public static final int VALUE_SRT_CTRL3_SNA         = 15;

    public static final int VALUE_SRT_EIGHTHTM_B_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_EIGHTHTM_B_TMR_CANCEL = 253;
    public static final int VALUE_SRT_EIGHTHTM_B_TMR_READY  = 254;
    public static final int VALUE_SRT_EIGHTHTM_B_SNA        = 2147483647;

    public static final int VALUE_SRT_EIGHTHTM_C_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_EIGHTHTM_C_TMR_CANCEL = 253;
    public static final int VALUE_SRT_EIGHTHTM_C_TMR_READY  = 254;
    public static final int VALUE_SRT_EIGHTHTM_C_SNA        = 2147483647;

    public static final int VALUE_SRT_EIGHTHTM_L_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_EIGHTHTM_L_TMR_CANCEL = 253;
    public static final int VALUE_SRT_EIGHTHTM_L_TMR_READY  = 254;
    public static final int VALUE_SRT_EIGHTHTM_L_SNA        = 2147483647;

    public static final int VALUE_SRT_EIGHTHTMB_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_EIGHTHTMB_TMR_CANCEL = 253;
    public static final int VALUE_SRT_EIGHTHTMB_TMR_READY  = 254;
    public static final int VALUE_SRT_EIGHTHTMB_SNA        = 2147483647;

    public static final int VALUE_SRT_EIGHTHTMC_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_EIGHTHTMC_TMR_CANCEL = 253;
    public static final int VALUE_SRT_EIGHTHTMC_TMR_READY  = 254;
    public static final int VALUE_SRT_EIGHTHTMC_SNA        = 2147483647;

    public static final int VALUE_SRT_EIGHTHTML_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_EIGHTHTML_TMR_CANCEL = 253;
    public static final int VALUE_SRT_EIGHTHTML_TMR_READY  = 254;
    public static final int VALUE_SRT_EIGHTHTML_SNA        = 2147483647;

    public static final int VALUE_SRT_QUARTERTM_B_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_QUARTERTM_B_TMR_CANCEL = 253;
    public static final int VALUE_SRT_QUARTERTM_B_TMR_READY  = 254;
    public static final int VALUE_SRT_QUARTERTM_B_SNA        = 2147483647;

    public static final int VALUE_SRT_QUARTERTM_C_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_QUARTERTM_C_TMR_CANCEL = 253;
    public static final int VALUE_SRT_QUARTERTM_C_TMR_READY  = 254;
    public static final int VALUE_SRT_QUARTERTM_C_SNA        = 2147483647;

    public static final int VALUE_SRT_QUARTERTM_L_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_QUARTERTM_L_TMR_CANCEL = 253;
    public static final int VALUE_SRT_QUARTERTM_L_TMR_READY  = 254;
    public static final int VALUE_SRT_QUARTERTM_L_SNA        = 2147483647;

    public static final int VALUE_SRT_QUARTERTMB_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_QUARTERTMB_TMR_CANCEL = 253;
    public static final int VALUE_SRT_QUARTERTMB_TMR_READY  = 254;
    public static final int VALUE_SRT_QUARTERTMB_SNA        = 2147483647;

    public static final int VALUE_SRT_QUARTERTMC_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_QUARTERTMC_TMR_CANCEL = 253;
    public static final int VALUE_SRT_QUARTERTMC_TMR_READY  = 254;
    public static final int VALUE_SRT_QUARTERTMC_SNA        = 2147483647;

    public static final int VALUE_SRT_QUARTERTML_TMR_ACTIVE = 252;
    public static final int VALUE_SRT_QUARTERTML_TMR_CANCEL = 253;
    public static final int VALUE_SRT_QUARTERTML_TMR_READY  = 254;
    public static final int VALUE_SRT_QUARTERTML_SNA        = 2147483647;

    public static final int VALUE_SRT_REACTTM_B_TMR_READY = 252;
    public static final int VALUE_SRT_REACTTM_B_OOR       = 253;
    public static final int VALUE_SRT_REACTTM_B_TMR_NU    = 254;
    public static final int VALUE_SRT_REACTTM_B_SNA       = 2147483647;

    public static final int VALUE_SRT_REACTTM_C_TMR_READY = 252;
    public static final int VALUE_SRT_REACTTM_C_OOR       = 253;
    public static final int VALUE_SRT_REACTTM_C_TMR_NU    = 254;
    public static final int VALUE_SRT_REACTTM_C_SNA       = 2147483647;

    public static final int VALUE_SRT_REACTTM_L_TMR_READY = 252;
    public static final int VALUE_SRT_REACTTM_L_OOR       = 253;
    public static final int VALUE_SRT_REACTTM_L_TMR_NU    = 254;
    public static final int VALUE_SRT_REACTTM_L_SNA       = 2147483647;

    public static final int VALUE_SRT_REACTTMB_TMR_READY = 252;
    public static final int VALUE_SRT_REACTTMB_OOR       = 253;
    public static final int VALUE_SRT_REACTTMB_TMR_NU    = 254;
    public static final int VALUE_SRT_REACTTMB_SNA       = 2147483647;

    public static final int VALUE_SRT_REACTTMC_TMR_READY = 252;
    public static final int VALUE_SRT_REACTTMC_OOR       = 253;
    public static final int VALUE_SRT_REACTTMC_TMR_NU    = 254;
    public static final int VALUE_SRT_REACTTMC_SNA       = 2147483647;

    public static final int VALUE_SRT_REACTTML_TMR_READY = 252;
    public static final int VALUE_SRT_REACTTML_OOR       = 253;
    public static final int VALUE_SRT_REACTTML_TMR_NU    = 254;
    public static final int VALUE_SRT_REACTTML_SNA       = 2147483647;

    /**
     * Gets the SRT_1000ftTm_B from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_1000ftTm_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_1000ftTm_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_1000ftTm_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_1000ftTm_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_1000ftTm_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_1000ftTm_C from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_1000ftTm_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_1000ftTm_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_1000ftTm_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_1000ftTm_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_1000ftTm_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_1000ftTm_L from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_1000ftTm_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_1000ftTm_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_1000ftTm_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_1000ftTm_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_1000ftTm_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_1000ftTmB from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_1000ftTmB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_1000ftTmB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_1000ftTmBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_1000ftTmB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_1000ftTmBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_1000ftTmC from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_1000ftTmC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_1000ftTmC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_1000ftTmCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_1000ftTmC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_1000ftTmCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_1000ftTmL from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_1000ftTmL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_1000ftTmL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_1000ftTmLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_1000ftTmL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_1000ftTmLChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_100MPHTM_B from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_100MPHTM_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_100MPHTM_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_100MPHTM_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_100MPHTM_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_100MPHTM_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_100MPHTM_C from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_100MPHTM_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_100MPHTM_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_100MPHTM_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_100MPHTM_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_100MPHTM_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_100MPHTM_L from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_100MPHTM_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_100MPHTM_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_100MPHTM_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_100MPHTM_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_100MPHTM_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_100MPHTMB from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_100MPHTMB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_100MPHTMB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_100MPHTMBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_100MPHTMB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_100MPHTMBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_100MPHTMC from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_100MPHTMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_100MPHTMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_100MPHTMCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_100MPHTMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_100MPHTMCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_100MPHTML from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_100MPHTML() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_100MPHTML.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_100MPHTMLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_100MPHTML.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_100MPHTMLChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60FTTM_B from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60FTTM_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60FTTM_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60FTTM_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60FTTM_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60FTTM_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60FTTM_C from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60FTTM_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60FTTM_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60FTTM_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60FTTM_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60FTTM_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60FTTM_L from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60FTTM_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60FTTM_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60FTTM_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60FTTM_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60FTTM_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60FTTMB from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60FTTMB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60FTTMB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60FTTMBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60FTTMB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60FTTMBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60FTTMC from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60FTTMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60FTTMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60FTTMCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60FTTMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60FTTMCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60FTTML from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60FTTML() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60FTTML.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60FTTMLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60FTTML.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60FTTMLChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60MPHTM_B from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60MPHTM_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60MPHTM_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60MPHTM_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60MPHTM_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60MPHTM_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60MPHTM_C from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60MPHTM_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60MPHTM_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60MPHTM_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60MPHTM_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60MPHTM_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60MPHTM_L from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60MPHTM_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60MPHTM_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60MPHTM_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60MPHTM_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60MPHTM_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60MPHTMB from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60MPHTMB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60MPHTMB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60MPHTMBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60MPHTMB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60MPHTMBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60MPHTMC from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60MPHTMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60MPHTMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60MPHTMCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60MPHTMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60MPHTMCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_60MPHTML from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_60MPHTML() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_60MPHTML.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_60MPHTMLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_60MPHTML.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_60MPHTMLChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkDistB_M from the vehicle.
     * @base PN - WD
     * @return m
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BrkDistB_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkDistB_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkDistB_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkDistB_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkDistB_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkDistB_US from the vehicle.
     * @base PN - WD
     * @return yards
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BrkDistB_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkDistB_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkDistB_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkDistB_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkDistB_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKDISTC_M from the vehicle.
     * @base PN - WD
     * @return m
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKDISTC_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKDISTC_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKDISTC_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKDISTC_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKDISTC_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKDISTC_US from the vehicle.
     * @base PN - WD
     * @return Yards
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKDISTC_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKDISTC_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKDISTC_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKDISTC_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKDISTC_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKDISTL_M from the vehicle.
     * @base PN - WD
     * @return m
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKDISTL_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKDISTL_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKDISTL_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKDISTL_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKDISTL_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKDISTL_US from the vehicle.
     * @base PN - WD
     * @return Yards
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKDISTL_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKDISTL_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKDISTL_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKDISTL_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKDISTL_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkSpdB_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BrkSpdB_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkSpdB_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkSpdB_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkSpdB_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkSpdB_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkSpdB_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BrkSpdB_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkSpdB_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkSpdB_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkSpdB_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkSpdB_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKSPDC_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKSPDC_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKSPDC_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKSPDC_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKSPDC_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKSPDC_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKSPDC_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKSPDC_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKSPDC_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKSPDC_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKSPDC_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKSPDC_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKSPDL_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKSPDL_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKSPDL_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKSPDL_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKSPDL_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKSPDL_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BRKSPDL_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_BRKSPDL_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BRKSPDL_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BRKSPDL_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BRKSPDL_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BRKSPDL_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkTm_B from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_BrkTm_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkTm_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkTm_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkTm_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkTm_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkTm_C from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_BrkTm_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkTm_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkTm_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkTm_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkTm_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_BrkTm_L from the vehicle.
     * @base PN - WD
     * @return secs
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_BrkTm_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_BrkTm_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_BrkTm_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_BrkTm_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_BrkTm_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_CTRL3 from the vehicle.
     * @base PN - WD
     * @return VALUE_SRT_CTRL3
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_CTRL3() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_CTRL3.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_CTRL3Change(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_CTRL3.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_CTRL3Change(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_EIGHTHTM_B from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_EIGHTHTM_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_EIGHTHTM_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_EIGHTHTM_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_EIGHTHTM_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_EIGHTHTM_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_EIGHTHTM_C from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_EIGHTHTM_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_EIGHTHTM_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_EIGHTHTM_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_EIGHTHTM_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_EIGHTHTM_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_EIGHTHTM_L from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_EIGHTHTM_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_EIGHTHTM_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_EIGHTHTM_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_EIGHTHTM_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_EIGHTHTM_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_EIGHTHTMB from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_EIGHTHTMB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_EIGHTHTMB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_EIGHTHTMBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_EIGHTHTMB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_EIGHTHTMBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_EIGHTHTMC from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_EIGHTHTMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_EIGHTHTMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_EIGHTHTMCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_EIGHTHTMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_EIGHTHTMCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_EIGHTHTML from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_EIGHTHTML() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_EIGHTHTML.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_EIGHTHTMLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_EIGHTHTML.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_EIGHTHTMLChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ETHSPDB_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_ETHSPDB_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ETHSPDB_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ETHSPDB_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ETHSPDB_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ETHSPDB_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ETHSPDB_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_ETHSPDB_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ETHSPDB_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ETHSPDB_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ETHSPDB_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ETHSPDB_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ETHSPDC_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_ETHSPDC_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ETHSPDC_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ETHSPDC_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ETHSPDC_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ETHSPDC_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ETHSPDC_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_ETHSPDC_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ETHSPDC_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ETHSPDC_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ETHSPDC_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ETHSPDC_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ETHSPDL_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_ETHSPDL_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ETHSPDL_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ETHSPDL_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ETHSPDL_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ETHSPDL_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ETHSPDL_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_ETHSPDL_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ETHSPDL_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ETHSPDL_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ETHSPDL_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ETHSPDL_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QRTSPDB_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_QRTSPDB_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QRTSPDB_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QRTSPDB_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QRTSPDB_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QRTSPDB_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QRTSPDB_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_QRTSPDB_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QRTSPDB_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QRTSPDB_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QRTSPDB_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QRTSPDB_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QRTSPDC_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_QRTSPDC_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QRTSPDC_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QRTSPDC_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QRTSPDC_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QRTSPDC_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QRTSPDC_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_QRTSPDC_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QRTSPDC_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QRTSPDC_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QRTSPDC_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QRTSPDC_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QRTSPDL_M from the vehicle.
     * @base PN - WD
     * @return km/h
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_QRTSPDL_M() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QRTSPDL_M.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QRTSPDL_MChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QRTSPDL_M.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QRTSPDL_MChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QRTSPDL_US from the vehicle.
     * @base PN - WD
     * @return mph
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    int getSRT_QRTSPDL_US() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QRTSPDL_US.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QRTSPDL_USChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QRTSPDL_US.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QRTSPDL_USChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QUARTERTM_B from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_QUARTERTM_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QUARTERTM_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QUARTERTM_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QUARTERTM_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QUARTERTM_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QUARTERTM_C from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_QUARTERTM_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QUARTERTM_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QUARTERTM_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QUARTERTM_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QUARTERTM_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QUARTERTM_L from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_QUARTERTM_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QUARTERTM_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QUARTERTM_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QUARTERTM_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QUARTERTM_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QUARTERTMB from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_QUARTERTMB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QUARTERTMB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QUARTERTMBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QUARTERTMB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QUARTERTMBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QUARTERTMC from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_QUARTERTMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QUARTERTMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QUARTERTMCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QUARTERTMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QUARTERTMCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_QUARTERTML from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_QUARTERTML() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_QUARTERTML.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_QUARTERTMLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_QUARTERTML.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_QUARTERTMLChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_REACTTM_B from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_REACTTM_B() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_REACTTM_B.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_REACTTM_BChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_REACTTM_B.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_REACTTM_BChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_REACTTM_C from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_REACTTM_C() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_REACTTM_C.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_REACTTM_CChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_REACTTM_C.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_REACTTM_CChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_REACTTM_L from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_REACTTM_L() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_REACTTM_L.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_REACTTM_LChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_REACTTM_L.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_REACTTM_LChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_ReactTmB from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_ReactTmB() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_ReactTmB.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_ReactTmBChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_ReactTmB.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_ReactTmBChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_REACTTMC from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_REACTTMC() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_REACTTMC.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_REACTTMCChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_REACTTMC.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_REACTTMCChange(FcaISRTManagerCallback callback);

    /**
     * Gets the SRT_REACTTML from the vehicle.
     * @base PN - WD
     * @return sec
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    float getSRT_REACTTML() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SRT_REACTTML.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean registerSRT_REACTTMLChange(FcaISRTManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SRT_REACTTML.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_SRT_READ_LOW
     */
    boolean unregisterSRT_REACTTMLChange(FcaISRTManagerCallback callback);

    /**
     * Callback interface to register ISRTManager against.
     */
    public interface FcaISRTManagerCallback {
        default void onSRT_1000ftTm_BChange(float value) { }
        default void onSRT_1000ftTm_CChange(float value) { }
        default void onSRT_1000ftTm_LChange(float value) { }
        default void onSRT_1000ftTmBChange(float value) { }
        default void onSRT_1000ftTmCChange(float value) { }
        default void onSRT_1000ftTmLChange(float value) { }
        default void onSRT_100MPHTM_BChange(float value) { }
        default void onSRT_100MPHTM_CChange(float value) { }
        default void onSRT_100MPHTM_LChange(float value) { }
        default void onSRT_100MPHTMBChange(float value) { }
        default void onSRT_100MPHTMCChange(float value) { }
        default void onSRT_100MPHTMLChange(float value) { }
        default void onSRT_60FTTM_BChange(float value) { }
        default void onSRT_60FTTM_CChange(float value) { }
        default void onSRT_60FTTM_LChange(float value) { }
        default void onSRT_60FTTMBChange(float value) { }
        default void onSRT_60FTTMCChange(float value) { }
        default void onSRT_60FTTMLChange(float value) { }
        default void onSRT_60MPHTM_BChange(float value) { }
        default void onSRT_60MPHTM_CChange(float value) { }
        default void onSRT_60MPHTM_LChange(float value) { }
        default void onSRT_60MPHTMBChange(float value) { }
        default void onSRT_60MPHTMCChange(float value) { }
        default void onSRT_60MPHTMLChange(float value) { }
        default void onSRT_BrkDistB_MChange(int value) { }
        default void onSRT_BrkDistB_USChange(int value) { }
        default void onSRT_BRKDISTC_MChange(int value) { }
        default void onSRT_BRKDISTC_USChange(int value) { }
        default void onSRT_BRKDISTL_MChange(int value) { }
        default void onSRT_BRKDISTL_USChange(int value) { }
        default void onSRT_BrkSpdB_MChange(int value) { }
        default void onSRT_BrkSpdB_USChange(int value) { }
        default void onSRT_BRKSPDC_MChange(int value) { }
        default void onSRT_BRKSPDC_USChange(int value) { }
        default void onSRT_BRKSPDL_MChange(int value) { }
        default void onSRT_BRKSPDL_USChange(int value) { }
        default void onSRT_BrkTm_BChange(float value) { }
        default void onSRT_BrkTm_CChange(float value) { }
        default void onSRT_BrkTm_LChange(float value) { }
        default void onSRT_CTRL3Change(int value) { }
        default void onSRT_EIGHTHTM_BChange(float value) { }
        default void onSRT_EIGHTHTM_CChange(float value) { }
        default void onSRT_EIGHTHTM_LChange(float value) { }
        default void onSRT_EIGHTHTMBChange(float value) { }
        default void onSRT_EIGHTHTMCChange(float value) { }
        default void onSRT_EIGHTHTMLChange(float value) { }
        default void onSRT_ETHSPDB_MChange(int value) { }
        default void onSRT_ETHSPDB_USChange(int value) { }
        default void onSRT_ETHSPDC_MChange(int value) { }
        default void onSRT_ETHSPDC_USChange(int value) { }
        default void onSRT_ETHSPDL_MChange(int value) { }
        default void onSRT_ETHSPDL_USChange(int value) { }
        default void onSRT_QRTSPDB_MChange(int value) { }
        default void onSRT_QRTSPDB_USChange(int value) { }
        default void onSRT_QRTSPDC_MChange(int value) { }
        default void onSRT_QRTSPDC_USChange(int value) { }
        default void onSRT_QRTSPDL_MChange(int value) { }
        default void onSRT_QRTSPDL_USChange(int value) { }
        default void onSRT_QUARTERTM_BChange(float value) { }
        default void onSRT_QUARTERTM_CChange(float value) { }
        default void onSRT_QUARTERTM_LChange(float value) { }
        default void onSRT_QUARTERTMBChange(float value) { }
        default void onSRT_QUARTERTMCChange(float value) { }
        default void onSRT_QUARTERTMLChange(float value) { }
        default void onSRT_REACTTM_BChange(float value) { }
        default void onSRT_REACTTM_CChange(float value) { }
        default void onSRT_REACTTM_LChange(float value) { }
        default void onSRT_ReactTmBChange(float value) { }
        default void onSRT_REACTTMCChange(float value) { }
        default void onSRT_REACTTMLChange(float value) { }
    }
}
