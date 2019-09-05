package missions;

import drone.DroneConnection;
import flight.FlightBehavior;

public abstract class Mission {

	private FlightBehavior[] flightPath;
	private int missionNumber;

	/**
	 *
	 * @param missionNumber
	 */
	public Mission(int missionNumber) {
		// TODO - implement Mission.Mission
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param droneConnection
	 */
	public void executeMission(DroneConnection droneConnection) {
		// TODO - implement Mission.executeMission
		throw new UnsupportedOperationException();
	}

	public int getMissionNumber() {
		return this.missionNumber;
	}



}