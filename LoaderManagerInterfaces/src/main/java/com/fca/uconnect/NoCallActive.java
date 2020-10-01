package com.fca.uconnect;

/**
 * CallSequenceInvalid would be thrown in cases where an app is requesting a call state change without the 
 * required predecessor state changes.
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
public class NoCallActive extends Exception {

    /**
     * Generated
     */
    private static final long serialVersionUID = 8367714568407853801L;

}
