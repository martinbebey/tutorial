package com.fca.uconnect;

import java.util.HashMap;

/**
 * PersistFileException
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
 *          <td style="text-align: left;">2019-03-22
 *          </td>
 *          <td style="text-align: left;">1.0
 *          </td>
 *          <td style="text-align: left;">DCR 13822
 *          </td>
 *          <td style="text-align: left;">MY21 R1, initial version.
 *          </td>
 *      </tr>
 *</table>
 *
 */
public class PersistFileException extends Exception
{
    public static final int RESPONSE_CODE_SUCCESS = 0;
    public static final int RESPONSE_CODE_FAIL = 1;
    
    private HashMap<String, Integer> fileStatusMap = new HashMap<String, Integer>();
    
    /**
     * Generated
     */
    private static final long serialVersionUID = 1134248793331261851L;
    
    /**
     * Exception for unknown conditions.
     */
    public PersistFileException() {}
    
    /**
     * Exception showing file list.
     * 
     * @param persistFileStatusMap showing the relative file path and a response code.
     */
    public PersistFileException(HashMap<String, Integer> persistFileStatusMap) {
        
        fileStatusMap = new HashMap<String, Integer>(persistFileStatusMap);
    }
    
    public HashMap<String, Integer> getFilelist() {
      
        return this.fileStatusMap;
    }
}
