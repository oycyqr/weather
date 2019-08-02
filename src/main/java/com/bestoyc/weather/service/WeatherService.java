package com.bestoyc.weather.service;

import com.bestoyc.weather.domain.Weather;
import org.springframework.stereotype.Service;

/**
 * @Author: oyc
 * @Date: 2019-07-28 20:29
 * @Description: 天气预报服务接口
 */
public interface WeatherService {
    /**
     * 根据城市ID获取城市天气情况
     * @param cityId
     * @return
     * @throws Exception
     */
    public Weather getWeatherByCityId(String cityId) throws Exception;

    /**
     * 根据城市名称获取城市天气情况
     * @param cityName
     * @return
     * @throws Exception
     */
    public Weather getWeatherByCityName(String cityName) throws Exception;
}
