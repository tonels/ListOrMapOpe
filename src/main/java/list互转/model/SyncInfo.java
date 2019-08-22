package list互转.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 内容同步信息表
 */
@Data
@Entity
@Accessors(chain = true)
@Table(name = "col_sync_info")
public class SyncInfo implements Serializable {
    private static final long serialVersionUID = 13216532245654L;
    /**
     * 同步编号ID，
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long syncInfoId;
    /**
     * G客号，
     */
    private String gkId;
    /**
     * 工作组编号ID，
     */
    private Long groupId;
    /**
     * 任务编号ID，
     */
    private Long taskId;

    /**
     * 媒资ID，
     */
    private Long assetId;
    
    /**
     * svid
     */
    private Long svid;
	
	/**
     * 媒资名称
     */
    private String assetName;

    /**
     * 内容ID，
     */
    private Long contentId;
    
    /**
     * 同步状态    0-未完成 1-已完成
     */
    private String syncStatus;
    
    /**
	 * 同步任务状态 0-未开始1-处理中 2-成功 3-失败
	 */
	private String syncTaskStatus;

    /**
     * 备注
     */
    private String remarks;
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
     * 操作人账号，
     */
    private String operator;
    /**
     * 操作人昵称，
     */
    private String operatorName;
    /**
     * 状态标志，0-未完成 1-已完成
     */
    private String nodeStatus;
    /**
     * 采集时间，yyyy-MM-dd HH:mm:ss
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime collectTime;


    

}
