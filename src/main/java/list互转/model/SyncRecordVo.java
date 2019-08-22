package list互转.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * 同步记录返回Vo
 */
@Data
public class SyncRecordVo {
    /**
     * 媒资ID
     */
    private Long assetId;

    /**
     * 媒资名称
     */
    private String assetName;

    /**
     * 开始时间，yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    /**
     * 完成时间，yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    /**
     * 同步用时,时分秒格式
     */
    private String syncTime;

    /**
     * 同步状态    0-未完成 1-已完成
     */
    private String syncStatus;

    /**
     *是否可操作
     */
    private String isOperate;






}
