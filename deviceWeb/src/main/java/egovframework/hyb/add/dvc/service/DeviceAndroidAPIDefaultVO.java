/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.hyb.add.dvc.service;

import egovframework.com.cmm.vo.DefaultSearchVO;
import io.swagger.annotations.ApiModelProperty;

/**  
 * @Class Name : DeviceAPIDefaultVO.java
 * @Description : DeviceAPIDefaultVO Class
 * @Modification Information  
 * @
 * @ 수정일                수정자             수정내용
 * @ ----------   ---------   -------------------------------
 *   2012.07.23   서형주              최초생성
 *   2020.08.11   신용호              DefaultSearchVO 추가
 * 
 * @author Device API 실행환경팀
 * @since 2012. 07. 23
 * @version 1.0
 * @see
 * 
 */
public class DeviceAndroidAPIDefaultVO extends DefaultSearchVO {
    
	private static final long serialVersionUID = 4081275219669795931L;
	
    /** 기기식별 */
    @ApiModelProperty(value="기기식별코드")
    private String uuid;

    /**
     * @return  uuid을 반환한다
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param 파라미터 uuid를 변수 uuid에 설정한다.
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
