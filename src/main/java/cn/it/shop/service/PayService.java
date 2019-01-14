package cn.it.shop.service;

import cn.it.shop.model.BackData;
import cn.it.shop.model.SendData;

import java.util.Map;

public interface PayService {

	public abstract Map<String, Object> saveDataToRequest(
            Map<String, Object> request, SendData sendData);
	public abstract boolean checkBackData(BackData backData);
}