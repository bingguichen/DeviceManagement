package net.binchen.controller;

import io.swagger.annotations.Api;
import net.binchen.bean.DevicePreference;
import net.binchen.bean.request.GetDeviceListRequest;
import net.binchen.bean.response.GetDeviceListResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bin on 2016/8/26.
 */
@RestController
@Api(value = "DevicePreference", description = "Device Preference Management Controller")
@RequestMapping("/devicepreference")
public class DevicePreferenceController {
    @RequestMapping(value = "/getDeviceList", method = RequestMethod.POST)
    @ResponseBody
    public GetDeviceListResponse getDeviceList(@RequestBody GetDeviceListRequest getDeviceListRequest){
        GetDeviceListResponse getDeviceListResponse = new GetDeviceListResponse();
        String customerId = getDeviceListRequest.getCustomerId();
        List<DevicePreference> devicePreferenceList = new ArrayList<DevicePreference>();
        DevicePreference devicePreference = new DevicePreference();
        devicePreference.setDeviceId("00123");
        devicePreference.setDeviceName(customerId+"-Android");
        devicePreference.setOSModel("Android");
        devicePreference.setOSVersion("A6.0");
        devicePreferenceList.add(devicePreference);
        getDeviceListResponse.setDevicePreferenceList(devicePreferenceList);
        return getDeviceListResponse;
    }
}
