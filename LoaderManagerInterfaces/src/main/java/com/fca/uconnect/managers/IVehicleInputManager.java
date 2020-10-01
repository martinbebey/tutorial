package com.fca.uconnect.managers;

import com.fca.uconnect.PropertyNotSupported;

/**
 * IVehicleInputManager
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
public interface IVehicleInputManager extends IFcaBaseInterface {

    /**
     * This interface version.
     */
    public static final String version = "1.2";

    public static final int VALUE_AUTOSHOW_OFF_RD_REQ_OFF                   = 0;
    public static final int VALUE_AUTOSHOW_OFF_RD_REQ_FORWARD_FACING_CAMERA = 1;
    public static final int VALUE_AUTOSHOW_OFF_RD_REQ_NONE                  = 2;

    public static final int VALUE_COMMAND_01_NOT_PSD = 0;
    public static final int VALUE_COMMAND_01_PSD     = 1;
    public static final int VALUE_COMMAND_01_SNA     = 3;

    public static final int VALUE_COMMAND_02_NOT_PSD = 0;
    public static final int VALUE_COMMAND_02_PSD     = 1;
    public static final int VALUE_COMMAND_02_SNA     = 3;

    public static final int VALUE_COMMAND_03_NOT_PSD = 0;
    public static final int VALUE_COMMAND_03_PSD     = 1;
    public static final int VALUE_COMMAND_03_SNA     = 3;

    public static final int VALUE_COMMAND_04_NOT_PSD = 0;
    public static final int VALUE_COMMAND_04_PSD     = 1;
    public static final int VALUE_COMMAND_04_SNA     = 3;

    public static final int VALUE_COMMAND_05_NOT_PSD = 0;
    public static final int VALUE_COMMAND_05_PSD     = 1;
    public static final int VALUE_COMMAND_05_SNA     = 3;

    public static final int VALUE_COMMAND_07_NOT_PSD = 0;
    public static final int VALUE_COMMAND_07_PSD     = 1;
    public static final int VALUE_COMMAND_07_SNA     = 3;

    public static final int VALUE_COMMAND_08_NOT_PSD = 0;
    public static final int VALUE_COMMAND_08_PSD     = 1;
    public static final int VALUE_COMMAND_08_SNA     = 3;

    public static final int VALUE_COMMAND_09_NOT_PSD = 0;
    public static final int VALUE_COMMAND_09_PSD     = 1;
    public static final int VALUE_COMMAND_09_SNA     = 3;

    public static final int VALUE_COMMAND_10_NOT_PSD = 0;
    public static final int VALUE_COMMAND_10_PSD     = 1;
    public static final int VALUE_COMMAND_10_SNA     = 3;

    public static final int VALUE_COMMAND_11_NOT_PSD = 0;
    public static final int VALUE_COMMAND_11_PSD     = 1;
    public static final int VALUE_COMMAND_11_SNA     = 3;

    public static final int VALUE_COMMAND_12_NOT_PSD = 0;
    public static final int VALUE_COMMAND_12_PSD     = 1;
    public static final int VALUE_COMMAND_12_SNA     = 3;

    public static final int VALUE_COMMAND_13_NOT_PSD = 0;
    public static final int VALUE_COMMAND_13_PSD     = 1;
    public static final int VALUE_COMMAND_13_SNA     = 3;

    public static final int VALUE_COMMAND_14_NOT_PSD = 0;
    public static final int VALUE_COMMAND_14_PSD     = 1;
    public static final int VALUE_COMMAND_14_SNA     = 3;

    public static final int VALUE_COMMAND_15_NOT_PSD = 0;
    public static final int VALUE_COMMAND_15_PSD     = 1;
    public static final int VALUE_COMMAND_15_SNA     = 3;

    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_STREET = 0;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_SPORT  = 1;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_TRACK  = 2;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_OFF    = 3;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_SNOW   = 4;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_ROCK   = 5;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_BAJA   = 6;
    public static final int VALUE_ESC_OFF_HRD_SFT_BUTTON_STS_SNA    = 7;

    public static final int VALUE_FL_HS_RQ_TGW_HS_NOT_PSD = 0;
    public static final int VALUE_FL_HS_RQ_TGW_HS_PSD     = 1;
    public static final int VALUE_FL_HS_RQ_TGW_SNA        = 3;

    public static final int VALUE_FL_VS_RQ_TGW_VS_NOT_PSD = 0;
    public static final int VALUE_FL_VS_RQ_TGW_VS_PSD     = 1;
    public static final int VALUE_FL_VS_RQ_TGW_SNA        = 3;

    public static final int VALUE_FR_HS_RQ_TGW_HS_NOT_PSD = 0;
    public static final int VALUE_FR_HS_RQ_TGW_HS_PSD     = 1;
    public static final int VALUE_FR_HS_RQ_TGW_SNA        = 3;

    public static final int VALUE_FR_VS_RQ_TGW_VS_NOT_PSD = 0;
    public static final int VALUE_FR_VS_RQ_TGW_VS_PSD     = 1;
    public static final int VALUE_FR_VS_RQ_TGW_SNA        = 3;

    public static final int VALUE_GATE_REQ_PE_NO_REQ      = 0;
    public static final int VALUE_GATE_REQ_PE_HNDL_PE_REQ = 1;
    public static final int VALUE_GATE_REQ_PE_BTN_PE_REQ  = 2;
    public static final int VALUE_GATE_REQ_PE_HF_PE_REQ   = 3;

    public static final int VALUE_HSW_RQ_TGW_NOT_PSD = 0;
    public static final int VALUE_HSW_RQ_TGW_PSD     = 1;
    public static final int VALUE_HSW_RQ_TGW_SNA     = 3;

    public static final int VALUE_ICS_KNOB1_DIR_KNOB_NO_CHNG = 0;
    public static final int VALUE_ICS_KNOB1_DIR_KNOB_INC_POS = 1;
    public static final int VALUE_ICS_KNOB1_DIR_KNOB_DEC_NEG = 2;
    public static final int VALUE_ICS_KNOB1_DIR_KNOB_ENTER   = 3;

    public static final int VALUE_ICS_KNOB2_DIR_KNOB_NO_CHNG = 0;
    public static final int VALUE_ICS_KNOB2_DIR_KNOB_INC_POS = 1;
    public static final int VALUE_ICS_KNOB2_DIR_KNOB_DEC_NEG = 2;
    public static final int VALUE_ICS_KNOB2_DIR_KNOB_ENTER   = 3;

    public static final int VALUE_ICS_KNOB3_DIR_KNOB_NO_CHNG = 0;
    public static final int VALUE_ICS_KNOB3_DIR_KNOB_INC_POS = 1;
    public static final int VALUE_ICS_KNOB3_DIR_KNOB_DEC_NEG = 2;
    public static final int VALUE_ICS_KNOB3_DIR_KNOB_ENTER   = 3;

    public static final int VALUE_PW_ADJ_P_NPSD    = 0;
    public static final int VALUE_PW_ADJ_P_MANOPN  = 1;
    public static final int VALUE_PW_ADJ_P_MANCLS  = 2;
    public static final int VALUE_PW_ADJ_P_AUTOOPN = 5;
    public static final int VALUE_PW_ADJ_P_AUTOCLS = 6;
    public static final int VALUE_PW_ADJ_P_IMPL    = 7;

    public static final int VALUE_PW_ADJ_RL_NPSD    = 0;
    public static final int VALUE_PW_ADJ_RL_MANOPN  = 1;
    public static final int VALUE_PW_ADJ_RL_MANCLS  = 2;
    public static final int VALUE_PW_ADJ_RL_AUTOOPN = 5;
    public static final int VALUE_PW_ADJ_RL_AUTOCLS = 6;
    public static final int VALUE_PW_ADJ_RL_IMPL    = 7;

    public static final int VALUE_PW_ADJ_RR_NPSD    = 0;
    public static final int VALUE_PW_ADJ_RR_MANOPN  = 1;
    public static final int VALUE_PW_ADJ_RR_MANCLS  = 2;
    public static final int VALUE_PW_ADJ_RR_AUTOOPN = 5;
    public static final int VALUE_PW_ADJ_RR_AUTOCLS = 6;
    public static final int VALUE_PW_ADJ_RR_IMPL    = 7;

    public static final int VALUE_R_R_REQ_PE_NO_REQ      = 0;
    public static final int VALUE_R_R_REQ_PE_HNDL_PE_REQ = 1;
    public static final int VALUE_R_R_REQ_PE_BTN_PE_REQ  = 2;
    public static final int VALUE_R_R_REQ_PE_HF_PE_REQ   = 3;

    public static final int VALUE_SPST_PAD1_NOT_SELECTED          = 0;
    public static final int VALUE_SPST_PAD1_SW1_ACTIVATED         = 1;
    public static final int VALUE_SPST_PAD1_SW2_ACTIVATED         = 2;
    public static final int VALUE_SPST_PAD1_SW1_AND_SW2_ACTIVATED = 3;
    public static final int VALUE_SPST_PAD1_SW3_ACTIVATED         = 4;
    public static final int VALUE_SPST_PAD1_SHORT_TO_GROUND       = 5;
    public static final int VALUE_SPST_PAD1_SHORT_TO_POWER        = 6;
    public static final int VALUE_SPST_PAD1_SNA                   = 7;

    public static final int VALUE_SPST_PAD2_UN_PSD = 0;
    public static final int VALUE_SPST_PAD2_PSD    = 1;
    public static final int VALUE_SPST_PAD2_S_GND  = 2;
    public static final int VALUE_SPST_PAD2_S_PLUS = 3;
    public static final int VALUE_SPST_PAD2_IND    = 4;
    public static final int VALUE_SPST_PAD2_SNA    = 7;

    public static final int VALUE_TERRAIN_HMI_RQ_ECM_NO_REQUEST = 0;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_1   = 1;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_2   = 2;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_3   = 3;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_4   = 4;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_5   = 5;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_6   = 6;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SCREEN_7   = 7;
    public static final int VALUE_TERRAIN_HMI_RQ_ECM_SNA        = 31;

    /**
     * Request the Autoshow_Off_Rd_Req of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetAutoshow_Off_Rd_ReqFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setAutoshow_Off_Rd_Req(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the CLS_LkSw_Psd_D from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCLS_LkSw_Psd_D() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CLS_LkSw_Psd_D.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCLS_LkSw_Psd_DChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CLS_LkSw_Psd_D.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCLS_LkSw_Psd_DChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the CLS_LkSw_Psd_P from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCLS_LkSw_Psd_P() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CLS_LkSw_Psd_P.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCLS_LkSw_Psd_PChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CLS_LkSw_Psd_P.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCLS_LkSw_Psd_PChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the CLS_UnlkSw_Psd_D from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCLS_UnlkSw_Psd_D() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CLS_UnlkSw_Psd_D.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCLS_UnlkSw_Psd_DChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CLS_UnlkSw_Psd_D.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCLS_UnlkSw_Psd_DChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the CLS_UnlkSw_Psd_P from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCLS_UnlkSw_Psd_P() throws PropertyNotSupported;

    /**
     * Registers listening to changes to CLS_UnlkSw_Psd_P.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCLS_UnlkSw_Psd_PChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to CLS_UnlkSw_Psd_P.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCLS_UnlkSw_Psd_PChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_01 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_01
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_01() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_01.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_01Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_01.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_01Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_02 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_02
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_02() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_02.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_02Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_02.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_02Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_03 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_03
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_03() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_03.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_03Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_03.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_03Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_04 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_04
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_04() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_04.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_04Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_04.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_04Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_05 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_05
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_05() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_05.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_05Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_05.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_05Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_07 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_07
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_07() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_07.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_07Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_07.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_07Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_08 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_08
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_08() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_08.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_08Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_08.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_08Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_09 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_09
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_09() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_09.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_09Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_09.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_09Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_10 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_10
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_10() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_10.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_10Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_10.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_10Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_11 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_11
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_11() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_11.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_11Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_11.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_11Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_12 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_12
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_12() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_12.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_12Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_12.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_12Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_13 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_13
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_13() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_13.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_13Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_13.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_13Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_14 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_14
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_14() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_14.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_14Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_14.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_14Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Command_15 from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_COMMAND_15
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getCommand_15() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Command_15.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerCommand_15Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Command_15.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterCommand_15Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ESC_OFF_Hrd_Sft_Button_sts from the vehicle.
     * @base PNNAWD
     * @return VALUE_ESC_OFF_HRD_SFT_BUTTON_STS
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getESC_OFF_Hrd_Sft_Button_sts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESC_OFF_Hrd_Sft_Button_sts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerESC_OFF_Hrd_Sft_Button_stsChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESC_OFF_Hrd_Sft_Button_sts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterESC_OFF_Hrd_Sft_Button_stsChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ESC_sftbtn_launch_sel from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getESC_sftbtn_launch_sel() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ESC_sftbtn_launch_sel.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerESC_sftbtn_launch_selChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ESC_sftbtn_launch_sel.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterESC_sftbtn_launch_selChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Request the FL_HS_RQ_TGW of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetFL_HS_RQ_TGWFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setFL_HS_RQ_TGW(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the FL_VS_RQ_TGW of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetFL_VS_RQ_TGWFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setFL_VS_RQ_TGW(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the FR_HS_RQ_TGW of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetFR_HS_RQ_TGWFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setFR_HS_RQ_TGW(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Request the FR_VS_RQ_TGW of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetFR_VS_RQ_TGWFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setFR_VS_RQ_TGW(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the Front_Int_SD_LT_Sw from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getFront_Int_SD_LT_Sw() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Front_Int_SD_LT_Sw.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerFront_Int_SD_LT_SwChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Front_Int_SD_LT_Sw.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterFront_Int_SD_LT_SwChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Front_Int_SD_RT_Sw from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getFront_Int_SD_RT_Sw() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Front_Int_SD_RT_Sw.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerFront_Int_SD_RT_SwChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Front_Int_SD_RT_Sw.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterFront_Int_SD_RT_SwChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the FrontFogLightSts from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getFrontFogLightSts() throws PropertyNotSupported;

    /**
     * Registers listening to changes to FrontFogLightSts.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerFrontFogLightStsChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to FrontFogLightSts.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterFrontFogLightStsChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the Gate_Req_PE from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_GATE_REQ_PE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getGate_Req_PE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to Gate_Req_PE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerGate_Req_PEChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to Gate_Req_PE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterGate_Req_PEChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Request the HSW_RQ_TGW of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetHSW_RQ_TGWFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setHSW_RQ_TGW(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the ICS_btn_0 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_0() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_0.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_0Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_0.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_0Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_1 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_1Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_1Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_12 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_12() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_12.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_12Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_12.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_12Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_13 from the vehicle.
     * @base PNNAWD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_13() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_13.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_13Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_13.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_13Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_16 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_16() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_16.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_16Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_16.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_16Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_17 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_17() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_17.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_17Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_17.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_17Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_18 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_18() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_18.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_18Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_18.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_18Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_24 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_24() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_24.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_24Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_24.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_24Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_26 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_26() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_26.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_26Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_26.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_26Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_27 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_27() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_27.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_27Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_27.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_27Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_28 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_28() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_28.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_28Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_28.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_28Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_29 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_29() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_29.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_29Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_29.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_29Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_30 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_30() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_30.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_30Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_30.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_30Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_31 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_31() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_31.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_31Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_31.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_31Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_32 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_32() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_32.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_32Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_32.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_32Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_33 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_33() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_33.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_33Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_33.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_33Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_40 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_40() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_40.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_40Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_40.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_40Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_5 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_5() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_5.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_5Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_5.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_5Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_btn_9 from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_btn_9() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_btn_9.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_btn_9Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_btn_9.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_btn_9Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_KNOB1_DIR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ICS_KNOB1_DIR
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_KNOB1_DIR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_KNOB1_DIR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_KNOB1_DIRChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_KNOB1_DIR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_KNOB1_DIRChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_KNOB1_VAL from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_KNOB1_VAL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_KNOB1_VAL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_KNOB1_VALChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_KNOB1_VAL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_KNOB1_VALChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_KNOB2_DIR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ICS_KNOB2_DIR
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_KNOB2_DIR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_KNOB2_DIR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_KNOB2_DIRChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_KNOB2_DIR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_KNOB2_DIRChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_KNOB2_VAL from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_KNOB2_VAL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_KNOB2_VAL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_KNOB2_VALChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_KNOB2_VAL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_KNOB2_VALChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_KNOB3_DIR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_ICS_KNOB3_DIR
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_KNOB3_DIR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_KNOB3_DIR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_KNOB3_DIRChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_KNOB3_DIR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_KNOB3_DIRChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_KNOB3_VAL from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_KNOB3_VAL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_KNOB3_VAL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_KNOB3_VALChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_KNOB3_VAL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_KNOB3_VALChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_R_L_BlowerDown from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_R_L_BlowerDown() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_R_L_BlowerDown.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_R_L_BlowerDownChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_R_L_BlowerDown.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_R_L_BlowerDownChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_R_L_BlowerUp from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_R_L_BlowerUp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_R_L_BlowerUp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_R_L_BlowerUpChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_R_L_BlowerUp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_R_L_BlowerUpChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_R_L_TempDown from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_R_L_TempDown() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_R_L_TempDown.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_R_L_TempDownChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_R_L_TempDown.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_R_L_TempDownChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ICS_R_L_TempUp from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getICS_R_L_TempUp() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ICS_R_L_TempUp.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerICS_R_L_TempUpChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ICS_R_L_TempUp.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterICS_R_L_TempUpChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the ITBM_BRK_SW from the vehicle.
     * @base PN - WD
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getITBM_BRK_SW() throws PropertyNotSupported;

    /**
     * Registers listening to changes to ITBM_BRK_SW.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerITBM_BRK_SWChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to ITBM_BRK_SW.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterITBM_BRK_SWChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the PW_Adj_P from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PW_ADJ_P
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getPW_Adj_P() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PW_Adj_P.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerPW_Adj_PChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PW_Adj_P.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterPW_Adj_PChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the PW_Adj_RL from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PW_ADJ_RL
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getPW_Adj_RL() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PW_Adj_RL.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerPW_Adj_RLChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PW_Adj_RL.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterPW_Adj_RLChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the PW_Adj_RR from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_PW_ADJ_RR
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getPW_Adj_RR() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PW_Adj_RR.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerPW_Adj_RRChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PW_Adj_RR.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterPW_Adj_RRChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the PW_LKOUT from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getPW_LKOUT() throws PropertyNotSupported;

    /**
     * Registers listening to changes to PW_LKOUT.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerPW_LKOUTChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to PW_LKOUT.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterPW_LKOUTChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the R_R_Req_PE from the vehicle.
     * @base PN - RUPHEV
     * @return VALUE_R_R_REQ_PE
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getR_R_Req_PE() throws PropertyNotSupported;

    /**
     * Registers listening to changes to R_R_Req_PE.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerR_R_Req_PEChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to R_R_Req_PE.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterR_R_Req_PEChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the RL_HndlSw from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getRL_HndlSw() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RL_HndlSw.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerRL_HndlSwChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RL_HndlSw.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterRL_HndlSwChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the RR_HndlSw from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getRR_HndlSw() throws PropertyNotSupported;

    /**
     * Registers listening to changes to RR_HndlSw.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerRR_HndlSwChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to RR_HndlSw.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterRR_HndlSwChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the SpSt_Pad1 from the vehicle.
     * @base PN - WD
     * @return VALUE_SPST_PAD1
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getSpSt_Pad1() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SpSt_Pad1.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerSpSt_Pad1Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SpSt_Pad1.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterSpSt_Pad1Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Gets the SpSt_Pad2 from the vehicle.
     * @base PN - WD
     * @return VALUE_SPST_PAD2
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getSpSt_Pad2() throws PropertyNotSupported;

    /**
     * Registers listening to changes to SpSt_Pad2.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerSpSt_Pad2Change(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to SpSt_Pad2.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterSpSt_Pad2Change(FcaIVehicleInputManagerCallback callback);

    /**
     * Request the Terrain_HMI_Rq_ECM of the vehicle can be changed.
     * @param value
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @triggers onSetTerrain_HMI_Rq_ECMFailed() on error
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_WRITE_HIGH
     */
    void setTerrain_HMI_Rq_ECM(int value, FcaIVehicleInputManagerCallback callback) throws PropertyNotSupported;

    /**
     * Gets the TRAC_PSD from the vehicle.
     * @base PN - RUPHEV
     * @return 1 if true, 0 if false
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    int getTRAC_PSD() throws PropertyNotSupported;

    /**
     * Registers listening to changes to TRAC_PSD.
     * @param callback
     * @throws PropertyNotSupported when requesting a signal that is not available on the current architecture.
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean registerTRAC_PSDChange(FcaIVehicleInputManagerCallback callback) throws
            PropertyNotSupported;

    /**
     * Unregisters listening to changes to TRAC_PSD.
     * @param callback
     * @return boolean value to determine success
     * @RequiresPermission com.fca.Uconnect.CommonApp.permission.FCA_PERMISSION_VEHINPUT_READ_HIGH
     */
    boolean unregisterTRAC_PSDChange(FcaIVehicleInputManagerCallback callback);

    /**
     * Callback interface to register IVehicleInputManager against.
     */
    public interface FcaIVehicleInputManagerCallback {
        default void onSetAutoshow_Off_Rd_ReqFailed() { }
        default void onCLS_LkSw_Psd_DChange(int value) { }
        default void onCLS_LkSw_Psd_PChange(int value) { }
        default void onCLS_UnlkSw_Psd_DChange(int value) { }
        default void onCLS_UnlkSw_Psd_PChange(int value) { }
        default void onCommand_01Change(int value) { }
        default void onCommand_02Change(int value) { }
        default void onCommand_03Change(int value) { }
        default void onCommand_04Change(int value) { }
        default void onCommand_05Change(int value) { }
        default void onCommand_07Change(int value) { }
        default void onCommand_08Change(int value) { }
        default void onCommand_09Change(int value) { }
        default void onCommand_10Change(int value) { }
        default void onCommand_11Change(int value) { }
        default void onCommand_12Change(int value) { }
        default void onCommand_13Change(int value) { }
        default void onCommand_14Change(int value) { }
        default void onCommand_15Change(int value) { }
        default void onESC_OFF_Hrd_Sft_Button_stsChange(int value) { }
        default void onESC_sftbtn_launch_selChange(int value) { }
        default void onSetFL_HS_RQ_TGWFailed() { }
        default void onSetFL_VS_RQ_TGWFailed() { }
        default void onSetFR_HS_RQ_TGWFailed() { }
        default void onSetFR_VS_RQ_TGWFailed() { }
        default void onFront_Int_SD_LT_SwChange(int value) { }
        default void onFront_Int_SD_RT_SwChange(int value) { }
        default void onFrontFogLightStsChange(int value) { }
        default void onGate_Req_PEChange(int value) { }
        default void onSetHSW_RQ_TGWFailed() { }
        default void onICS_btn_0Change(int value) { }
        default void onICS_btn_1Change(int value) { }
        default void onICS_btn_12Change(int value) { }
        default void onICS_btn_13Change(int value) { }
        default void onICS_btn_16Change(int value) { }
        default void onICS_btn_17Change(int value) { }
        default void onICS_btn_18Change(int value) { }
        default void onICS_btn_24Change(int value) { }
        default void onICS_btn_26Change(int value) { }
        default void onICS_btn_27Change(int value) { }
        default void onICS_btn_28Change(int value) { }
        default void onICS_btn_29Change(int value) { }
        default void onICS_btn_30Change(int value) { }
        default void onICS_btn_31Change(int value) { }
        default void onICS_btn_32Change(int value) { }
        default void onICS_btn_33Change(int value) { }
        default void onICS_btn_40Change(int value) { }
        default void onICS_btn_5Change(int value) { }
        default void onICS_btn_9Change(int value) { }
        default void onICS_KNOB1_DIRChange(int value) { }
        default void onICS_KNOB1_VALChange(int value) { }
        default void onICS_KNOB2_DIRChange(int value) { }
        default void onICS_KNOB2_VALChange(int value) { }
        default void onICS_KNOB3_DIRChange(int value) { }
        default void onICS_KNOB3_VALChange(int value) { }
        default void onICS_R_L_BlowerDownChange(int value) { }
        default void onICS_R_L_BlowerUpChange(int value) { }
        default void onICS_R_L_TempDownChange(int value) { }
        default void onICS_R_L_TempUpChange(int value) { }
        default void onITBM_BRK_SWChange(int value) { }
        default void onPW_Adj_PChange(int value) { }
        default void onPW_Adj_RLChange(int value) { }
        default void onPW_Adj_RRChange(int value) { }
        default void onPW_LKOUTChange(int value) { }
        default void onR_R_Req_PEChange(int value) { }
        default void onRL_HndlSwChange(int value) { }
        default void onRR_HndlSwChange(int value) { }
        default void onSpSt_Pad1Change(int value) { }
        default void onSpSt_Pad2Change(int value) { }
        default void onSetTerrain_HMI_Rq_ECMFailed() { }
        default void onTRAC_PSDChange(int value) { }
    }
}
