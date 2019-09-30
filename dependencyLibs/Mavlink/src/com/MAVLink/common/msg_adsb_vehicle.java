/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ADSB_VEHICLE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* The location and information of an ADSB vehicle
*/
public class msg_adsb_vehicle extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_ADSB_VEHICLE = 246;
    public static final int MAVLINK_MSG_LENGTH = 38;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ADSB_VEHICLE;


      
    /**
    * ICAO address
    */
    public long ICAO_address;
      
    /**
    * Latitude, expressed as degrees * 1E7
    */
    public int lat;
      
    /**
    * Longitude, expressed as degrees * 1E7
    */
    public int lon;
      
    /**
    * Altitude(ASL) in millimeters
    */
    public int altitude;
      
    /**
    * Course over ground in centidegrees
    */
    public int heading;
      
    /**
    * The horizontal velocity in centimeters/second
    */
    public int hor_velocity;
      
    /**
    * The vertical velocity in centimeters/second, positive is up
    */
    public short ver_velocity;
      
    /**
    * Flags to indicate various statuses including valid data fields
    */
    public int flags;
      
    /**
    * Squawk code
    */
    public int squawk;
      
    /**
    * Type from ADSB_ALTITUDE_TYPE enum
    */
    public short altitude_type;
      
    /**
    * The callsign, 8+null
    */
    public byte callsign[] = new byte[9];
      
    /**
    * Type from ADSB_EMITTER_TYPE enum
    */
    public short emitter_type;
      
    /**
    * Time since last communication in seconds
    */
    public short tslc;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;
              
        packet.payload.putUnsignedInt(ICAO_address);
              
        packet.payload.putInt(lat);
              
        packet.payload.putInt(lon);
              
        packet.payload.putInt(altitude);
              
        packet.payload.putUnsignedShort(heading);
              
        packet.payload.putUnsignedShort(hor_velocity);
              
        packet.payload.putShort(ver_velocity);
              
        packet.payload.putUnsignedShort(flags);
              
        packet.payload.putUnsignedShort(squawk);
              
        packet.payload.putUnsignedByte(altitude_type);
              
        
        for (int i = 0; i < callsign.length; i++) {
            packet.payload.putByte(callsign[i]);
        }
                    
              
        packet.payload.putUnsignedByte(emitter_type);
              
        packet.payload.putUnsignedByte(tslc);
        
        return packet;
    }

    /**
    * Decode a adsb_vehicle message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.ICAO_address = payload.getUnsignedInt();
              
        this.lat = payload.getInt();
              
        this.lon = payload.getInt();
              
        this.altitude = payload.getInt();
              
        this.heading = payload.getUnsignedShort();
              
        this.hor_velocity = payload.getUnsignedShort();
              
        this.ver_velocity = payload.getShort();
              
        this.flags = payload.getUnsignedShort();
              
        this.squawk = payload.getUnsignedShort();
              
        this.altitude_type = payload.getUnsignedByte();
              
         
        for (int i = 0; i < this.callsign.length; i++) {
            this.callsign[i] = payload.getByte();
        }
                
              
        this.emitter_type = payload.getUnsignedByte();
              
        this.tslc = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_adsb_vehicle(){
        msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_adsb_vehicle(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ADSB_VEHICLE;
        unpack(mavLinkPacket.payload);        
    }

                         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setCallsign(String str) {
        int len = Math.min(str.length(), 9);
        for (int i=0; i<len; i++) {
            callsign[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<9; i++) {            // padding for the rest of the buffer
            callsign[i] = 0;
        }
    }

    /**
    * Gets the message, formated as a string
    */
    public String getCallsign() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 9; i++) {
            if (callsign[i] != 0)
                buf.append((char) callsign[i]);
            else
                break;
        }
        return buf.toString();

    }
                             
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_ADSB_VEHICLE - sysid:"+sysid+" compid:"+compid+" ICAO_address:"+ICAO_address+" lat:"+lat+" lon:"+lon+" altitude:"+altitude+" heading:"+heading+" hor_velocity:"+hor_velocity+" ver_velocity:"+ver_velocity+" flags:"+flags+" squawk:"+squawk+" altitude_type:"+altitude_type+" callsign:"+callsign+" emitter_type:"+emitter_type+" tslc:"+tslc+"";
    }
}
        