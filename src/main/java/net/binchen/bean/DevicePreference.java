package net.binchen.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Bin on 2016/8/26.
 */
@Data
@ApiModel(value = "Device Preference", description = "Device Preference Bean")
public class DevicePreference {
    @ApiModelProperty(value = "Device Id", dataType = "String", required = true)
    String deviceId;
    @ApiModelProperty(value = "Device Name", dataType = "String", required = false)
    String deviceName;
    @ApiModelProperty(value = "Device OS Model", dataType = "String", required = false)
    String OSModel;
    @ApiModelProperty(value = "Device OS Version", dataType = "String", required = false)
    String OSVersion;
}
