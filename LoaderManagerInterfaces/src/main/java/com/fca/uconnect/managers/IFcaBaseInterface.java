package com.fca.uconnect.managers;

/**
 * FcaBaseInterface is inherited by all Common API interfaces.
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
 *          <td style="text-align: left;">2019-02-05
 *          </td>
 *          <td style="text-align: left;">1.0
 *          </td>
 *          <td style="text-align: left;">DCR 13822
 *          </td>
 *          <td style="text-align: left;">MY21, initial version.
 *          </td>
 *      </tr>
 *</table>
 *  
 */
public interface IFcaBaseInterface
{
    /**
     * Retrieves the version of the manager implementation.
     * 
     * @return the version as a string.
     */
    public abstract String getManagerVersion();
}
