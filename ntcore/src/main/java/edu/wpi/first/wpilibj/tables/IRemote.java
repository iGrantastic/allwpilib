// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package edu.wpi.first.wpilibj.tables;

/**
 * Represents an object that has a remote connection.
 *
 * @deprecated Use {@link edu.wpi.first.networktables.NetworkTableInstance}.
 */
@Deprecated
@SuppressWarnings("checkstyle:all")
public interface IRemote {
  /**
   * Register an object to listen for connection and disconnection events
   *
   * @param listener the listener to be register
   * @param immediateNotify if the listener object should be notified of the current connection
   *     state
   */
  public void addConnectionListener(IRemoteConnectionListener listener, boolean immediateNotify);

  /**
   * Unregister a listener from connection events
   *
   * @param listener the listener to be unregistered
   */
  public void removeConnectionListener(IRemoteConnectionListener listener);

  /**
   * Get the current state of the objects connection
   *
   * @return the current connection state
   */
  public boolean isConnected();

  /**
   * If the object is acting as a server
   *
   * @return if the object is a server
   */
  public boolean isServer();
}
