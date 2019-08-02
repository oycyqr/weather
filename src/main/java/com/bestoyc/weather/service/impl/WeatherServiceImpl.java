package com.bestoyc.weather.service.impl;

import com.bestoyc.weather.constant.WeatherConstant;
import com.bestoyc.weather.domain.Weather;
import com.bestoyc.weather.service.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @Author: oyc
 * @Date: 2019-07-28 20:32
 * @Description:
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public Weather getWeatherByCityId(String cityId) throws Exception {
        //String uri = WeatherConstant.WEATHER_URI + "citykey=" + cityId;
        String uri = WeatherConstant.WEATHER_URI;
        return this.doGetWeahter(uri);
    }

    @Override
    public Weather getWeatherByCityName(String cityName) throws Exception {
        String uri = WeatherConstant.WEATHER_URI + "city=" + cityName;
        return this.doGetWeahter(uri);
    }

    private Weather doGetWeahter(String uri) {
        // 调用服务接口获取天气情况
        ResponseEntity<Weather> weather = restTemplate.getForEntity(uri, Weather.class);
        return weather.getBody();
    }
}
