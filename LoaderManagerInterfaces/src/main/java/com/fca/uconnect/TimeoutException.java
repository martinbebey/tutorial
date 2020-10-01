package com.fca.uconnect;

/**
 * TimeoutException would be thrown in cases where an app is synchronously requesting information from another entity
 * and does not get a return value.
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
 *          <td style="text-align: left;">2019-09-25
 *          </td>
 *          <td style="text-align: left;">1.2
 *          </td>
 *          <td style="text-align: left;">DCR 14629
 *          </td>
 *          <td style="text-align: left;">MY21, initial version to support TBMController.
 *          </td>
 *      </tr>
 *</table>
 */
public class TimeoutException extends Exception
{
    /**
     * Gnerated ID.
     */
    private static final long serialVersionUID = 6240192826015236582L;
}
