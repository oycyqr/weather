package com.bestoyc.weather.controller;

import com.bestoyc.weather.domain.Weather;
import com.bestoyc.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: oyc
 * @Date: 2019-07-28 20:33
 * @Description:天气预报接口
 */
@RestController
@RequestMapping("weather")
public class WeatherController {

    @Resource
    private WeatherService weatherService;

    /**
     * 根据城市ID获取城市天气预报
     * @param cityId
     * @return
     * @throws Exception
     */
    @GetMapping("/cityId/{cityId}")
    public Weather getWeatherByCityId(@PathVariable String cityId) throws Exception{
        return weatherService.getWeatherByCityId(cityId);
    }

    /**
     * 根据城市名称获取城市天气情况
     * @param cityName
     * @return
     * @throws Exception
     */
    @GetMapping("/cityName/{cityName}")
    public Weather getWeatherByCityName(@PathVariable String cityName) throws Exception{
        return weatherService.getWeatherByCityName(cityName);
    }
}
