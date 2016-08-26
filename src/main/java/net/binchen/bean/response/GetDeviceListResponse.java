package net.binchen.bean.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import net.binchen.bean.DevicePreference;

import java.util.List;

/**
 * Created by Bin on 2016/8/26.
 */
@Data
@ApiModel(value = "Get Device List Response", description = "Return all device for current customer")
public class GetDeviceListResponse {
    List<DevicePreference> devicePreferenceList;
}
