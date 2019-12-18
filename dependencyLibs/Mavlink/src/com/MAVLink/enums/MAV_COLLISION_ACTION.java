/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/** 
* Possible actions an aircraft can take to avoid a collision.
*/
public class MAV_COLLISION_ACTION {
   public static final int MAV_COLLISION_ACTION_NONE = 0; /* Ignore any potential collisions | */
   public static final int MAV_COLLISION_ACTION_REPORT = 1; /* Report potential collision | */
   public static final int MAV_COLLISION_ACTION_ASCEND_OR_DESCEND = 2; /* Ascend or Descend to avoid threat | */
   public static final int MAV_COLLISION_ACTION_MOVE_HORIZONTALLY = 3; /* Move horizontally to avoid threat | */
   public static final int MAV_COLLISION_ACTION_MOVE_PERPENDICULAR = 4; /* Aircraft to move perpendicular to the collision's velocity vector | */
   public static final int MAV_COLLISION_ACTION_RTL = 5; /* Aircraft to fly directly back to its launch point | */
   public static final int MAV_COLLISION_ACTION_HOVER = 6; /* Aircraft to stop in place | */
   public static final int MAV_COLLISION_ACTION_ENUM_END = 7; /*  | */
}
            