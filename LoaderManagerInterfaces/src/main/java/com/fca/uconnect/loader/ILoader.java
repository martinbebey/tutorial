package com.fca.uconnect.loader;

import android.content.Context;
import com.fca.uconnect.managers.IFcaBaseInterface;

/**
 * ILoader interface used to request a manager implementation.
 * 
 * Note: android.jar is required to compile this interface in a java environment.
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
 *          <td style="text - align: left; ">MY21, initial version.
 *          </td>
 *      </tr>
 *      <tr>
 *          <td style="text - align: left; ">2019-06-26
 *          </td>
 *          <td style="text - align: left; ">1.1
 *          </td>
 *          <td style="text - align: left; ">DCR 14223, 14224
 *          </td>
 *          <td style="text - align: left; ">MY21, added base interface.
 *          </td>
 *      </tr>
 *</table>
 *
 */
public abstract interface ILoader extends IFcaBaseInterface
{
    /**
     * This interface version.
     */
    public static final String version = "1.1";
    
    public abstract interface ILoaderCallback
    {
        /**
         * 
         * @param paramString
         */
        public abstract void onManagerFailure(String paramString);

        /**
         * 
         * @param paramString that identifies the interface. The same string used in the 
         * getManager method (i.e. IVehicleStatusManager.class.getName()).
         * @param paramObject the actual manager class that must be cast to the appropriate manager.
         * i.e. IVehicleHVACManager mVehicleHVACManager = (IVehicleHVACManager) paramObject.
         */
        public abstract void onManagerReady(String paramString, Object paramObject);
    }

    /**
     * Get the manager associated with an interface.
     * 
     * @param paramString that identifies the interface (i.e. IVehicleStatusManager.class.getName()).
     * @param paramILoaderCallback for onManagerReady() and onManagerFailure().
     * @param paramContext Android context or null if running in JVM.
     * @return true is request is successful false otherwise.
     */
    public abstract boolean getManager(String paramString, ILoaderCallback paramILoaderCallback, Context paramContext);
}
