package com.fca.uconnect.loader;

import android.content.Context;

/**
 * ManagerLoader is a stub class and intended to be used for compile only, dependencies {compileOnly ...}. 
 * The firmware will return the actual manager in a production HU.
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
 *          <td style="text - align: left; ">2019-06-26
 *          </td>
 *          <td style="text - align: left; ">1.0
 *          </td>
 *          <td style="text - align: left; ">DCR 14223, 14224
 *          </td>
 *          <td style="text - align: left; ">MY21, initial version.
 *          </td>
 *      </tr>
 *</table>
 *
 */
public class ManagerLoader extends java.lang.Object implements com.fca.uconnect.loader.ILoader {
    public ManagerLoader() {
        throw new RuntimeException("Stub");
    }
    @Override
    public boolean getManager(String paramString, ILoaderCallback paramILoaderCallback, Context paramContext) {
        throw new RuntimeException("Stub");
    }
    @Override
    public String getManagerVersion() {
        throw new RuntimeException("Stub");
    }
}
