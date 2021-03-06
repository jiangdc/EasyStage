package com.ayocrazy.easystage.rmi;

import com.ayocrazy.easystage.bean.ActorBean;
import com.ayocrazy.easystage.bean.StageBean;
import com.ayocrazy.easystage.bean.UserBean;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ayo on 2017/1/10.
 */

public interface IRemote extends Remote {
    StageBean getStage() throws RemoteException;

    UserBean getUser(int id) throws RemoteException;

    ActorBean getActor(String id) throws RemoteException;

    ActorBean[] getActors() throws RemoteException;

    boolean childrenChanged() throws RemoteException;

    boolean setValue(int id, String fieldName, Object value) throws RemoteException;
}
