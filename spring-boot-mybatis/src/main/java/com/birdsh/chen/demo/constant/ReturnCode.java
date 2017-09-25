package com.birdsh.chen.demo.constant;

/**
 * @ClassName: ReturnCode
 * @Description: <font color="red">TODO(调用API接口返回码详情) </font>
 */
public enum ReturnCode {
	// 0~99 表示公用返回码；

	/**
	 * <font color="red"><b>0</b></font> <font color="blue"><b>操作失败！</b></font>
	 */
	Operation_Errored(0, "操作失败！"),
	/**
	 * <font color="red"><b>1</b></font> <font color="blue"><b>操作成功！</b></font>
	 */
	Operation_Succeeded(1, "操作成功！"), Internal_Server_Error(2, "服务器内部错误！"), Parameters_Incomplete(3, "传参不全！"), Format_Mismatching(4, "格式不匹配！"), Invalid_Request(5, "请先登录！"), No_Updates(6, "没有同步信息！"), Push_Error(7, "推送失败！"), Push_Succeeded(8, "推送成功！"), Insufficient_Authority(9, "权限不足,系统管理员不可添加用户"), Related_To_Account(9, "仍有账户存在！"), Illeage_Mobile_Formate(10, "非法的手机号!"), Illeage_IDcard_Format(11, "非法的身份证号!"),
	// 100~9999 表示公用返回码预留

	// 20000~29999 表示PC返回码
	// 登录注册或者修改密码时返回码(20000~20049)
	/**
	 * <font color="red"><b>20000</b></font> <font color=
	 * "blue"><b>用户不存在！</b></font>{该用户(例如、账号、用户名等等，设备号单独写了一些返回码)未注册(登录时用)}
	 */
	No_Exists_Account(20000, "用户不存在！"),
	/**
	 * <font color="red"><b>20001</b></font> <font color=
	 * "blue"><b>用户已存在！</b></font>{该用户(例如、账号、用户名等等，设备号单独写了一些返回码)已经注册(在注册时，用户名不允许重复的情况下用)
	 * }
	 */

	Exists_Account(20001, "用户已存在！"),
	/**
	 * <font color="red"><b>20002</b></font>
	 * <font color="blue"><b>用户名或密码不能为空！</b></font>
	 */
	Empty_Uname_Upwd(20002, "用户名或密码不能为空！"),
	/**
	 * <font color="red"><b>20003</b></font>
	 * <font color="blue"><b>用户名或密码不正确！</b></font>
	 */
	Error_Uname_Upwd(20003, "用户名或密码不正确！"),
	/**
	 * <font color="red"><b>20004</b></font>
	 * <font color="blue"><b>原始密码不正确！</b></font>{修改密码时，原来的密码输入不正确时返回此码}
	 */
	Empty_Original_Password(20004, "原始密码为空！"),
	/**
	 * <font color="red"><b>20005</b></font>
	 * <font color="blue"><b>原始密码不正确！</b></font>{修改密码时，原来的密码输入不正确时返回此码}
	 */
	Error_Original_Password(20005, "原始密码不正确！"),
	/**
	 * <font color="red"><b>20006</b></font>
	 * <font color="blue"><b>确认密码和新密码不一致！</b></font>{两次输入密码不一致 (前端也会校验)}
	 */
	Pwd_Inconsistent(20006, "确认密码和新密码不一致！"),
	/**
	 * <font color="red"><b>20007</b></font>
	 * <font color="blue"><b>新密码不能和原始密码一致，请确认！</b></font>{新密码不能和原始密码一致(有这个要求时用)}
	 */
	Pwd_Accordance(20007, "新密码不能和原始密码一致，请确认！"),
	/**
	 * <font color="red"><b>20009</b></font>
	 * <font color="blue"><b>该账号被禁用，请使用其他账号登录！</b></font>{输入的账号被禁用时用}
	 */
	Acc_Forbid(20009, "该账号被禁用，请使用其他账号登录！"),
	/**
	 * <font color="red"><b>20008~20049</b></font>
	 * <font color="blue"><b>预留字段</b></font>
	 */
	Obligate20008(20008, "预留字段"),

	No_DELETE_Account(20010, "无法删除账号，该账号下有设备"),

	Exists_Same_Uid(20011, "员工编号已存在"), 
	Exists_Same_Mobile(20012, "员工手机号已存在"), 
	Exists_Same_Idcard(20013, "员工身份证号已存在"),
	Error_Idcard(20014, "员工身份证号格式错误"),
	// token和签名相关返回码(20050~20099)
	/**
	 * <font color="red"><b>20050</b></font> <font color="blue"><b>token获取失败
	 * ！</b></font>token获取失败 {极少出现这种情况(先做个保留)}
	 */
	Get_Failure_Token(20050, "token获取失败！"),
	/**
	 * <font color="red"><b>20051</b></font>
	 * <font color="blue"><b>token为空！</b></font>{暂时不用 }
	 */
	Empty_Token(20051, "token为空！"),
	/**
	 * <font color="red"><b>20052</b></font>
	 * <font color="blue"><b>token错误！</b></font>{ 场景:设备号已经获取token，但是输入有误时返回此代码}
	 */
	Error_Token(20052, "token错误！"),
	/**
	 * <font color="red"><b>20053</b></font>
	 * <font color="blue"><b>token过期！</b></font>{也称token超时或无效}
	 */
	Overdue_Token(20053, "token过期！"),
	/**
	 * <font color="red"><b>20054</b></font> <font color=
	 * "blue"><b>token没有该数据的权限！</b></font>{场景:用其他设备号生成的token访问时，会出现此种情况 }
	 */
	No_Permission_Token(20054, "Token没有该数据的权限！"),
	/**
	 * <font color="red"><b>20055</b></font>
	 * <font color="blue"><b>签名为空！</b></font>
	 */
	Empty_Signature(20055, "签名为空！"),
	/**
	 * <font color="red"><b>20056</b></font> <font color="blue"><b>签名不正确！
	 * </b></font>
	 */
	Error_Signature(20056, "签名不正确！"),
	/**
	 * <font color="red"><b>20057~20099</b></font>
	 * <font color="blue"><b>预留字段</b></font>
	 */
	Obligate20099(20099, "预留字段"),

	// 验证码相关返回代码(20100~20149)
	/**
	 * <font color="red"><b>20100</b></font>
	 * <font color="blue"><b>验证码已发送，请您稍候！</b></font>{场景:用手机获取验证码}
	 */
	Send_Success(20100, "验证码发送成功，请您稍候！"),
	/**
	 * <font color="red"><b>20101</b></font>
	 * <font color="blue"><b>发送失败，请检查原因！</b></font>{场景:用手机获取验证码}
	 */
	Send_Error(20101, "发送失败，请检查原因！"),
	/**
	 * <font color="red"><b>20102</b></font>
	 * <font color="blue"><b>验证码为空！</b></font>{前端也会校验，但为了安全起见和规范，后端最好也做下校验 }
	 */
	Empty_Verify_Code(20102, "验证码为空！"),
	/**
	 * <font color="red"><b>20103</b></font>
	 * <font color="blue"><b>验证码输入错误，请重新输入！</b></font>
	 */
	Error_Verify_Code(20103, "验证码输入错误，请重新输入！"),
	/**
	 * <font color="red"><b>20104</b></font>
	 * <font color="blue"><b>获取验证码超时，请重新获取！</b></font>{会有一个时间限制，具体多长时间视情况而定 }
	 */
	Overdue_Verification_code(20104, "获取验证码超时，请重新获取！"),
	/**
	 * <font color="red"><b>20105</b></font>
	 * <font color="blue"><b>验证码发送次数超出限制！</b></font>{场景:用手机获取验证码时会有次数限制 }
	 */
	TimeOut_Verification_code(20105, "验证码发送次数超出限制！"),
	/**
	 * <font color="red"><b>20106</b></font> <font color=
	 * "blue"><b>请输入最新的验证码！</b></font>{如果你在验证码的有效时间内，获取了多次验证码，只要输入的不是最新的，那么就会返回此码}
	 */
	Newest_Verification_code(20106, "请输入最新的验证码！"),
	/**
	 * <font color="red"><b>20107~20149</b></font> <font color="blue"><b>预留字段
	 * </b></font>
	 */
	Obligate20107(20107, "预留字段"),

	// 设备相关返回代码(20150~20199)
	/**
	 * <font color="red"><b>20150</b></font> <font color="blue"><b>设备未激活，请先激活再登录
	 * ！</b></font>{场景:侍卫长用设备号登陆}
	 */
	Dev_Nonactivated(20150, "设备未激活，请先激活再登录！"),
	/**
	 * <font color="red"><b>20151</b></font> <font color="blue"><b>设备已注册，不能重复注册！
	 * </b></font>{ 场景:侍卫长用设备号注册 }
	 */
	Dev_RegisterFail(20151, "设备已注册，不能重复注册！"),
	/**
	 * <font color="red"><b>20152</b></font> <font color="blue"><b>设备不存在
	 * ！</b></font>{场景:查询设备信息时}
	 */
	Dev_Absent(20152, "设备不存在！"),
	/**
	 * <font color="red"><b>20153</b></font>
	 * <font color="blue"><b>设备已到期，请续费！</b></font>{场景：侍卫长用设备号登陆时 ，在提醒期内}
	 */
	Dev_Expire(20153, "设备已到期，请续费！"),
	/**
	 * <font color="red"><b>20154</b></font> <font color="blue"><b>设备已停用
	 * ！</b></font>
	 */
	Dev_Disable(20154, "设备已停用！"),
	/**
	 * <font color="red"><b>20155~20199</b></font>
	 * <font color="blue"><b>预留字段</b></font>
	 */
	Obligate20155(20155, "预留字段"),

	// 指令相关返回代码(20200~20249)cmd
	/**
	 * <font color="red"><b>20200</b></font> <font color="blue"><b>指令下发成功，等待终端
	 * 应答 ！</b></font>
	 */
	Send_Directive_Success(20200, "指令下发成功，等待终端应答！"),
	/**
	 * <font color="red"><b>20201</b></font>
	 * <font color="blue"><b>设备处于离线状态，不能下发指令！</b></font>{设备离线时，无法下发指令！}
	 */
	Dev_Off_Line(20201, "设备处于离线状态,不能下发指令！"),
	/**
	 * <font color="red"><b>20202</b></font>
	 * <font color="blue"><b>指令发送超时！</b></font>{特别说明：指令未发送成功}
	 */
	Send_Timeout_Directive(20202, "指令发送超时！"),
	/**
	 * <font color="red"><b>20203</b></font> <font color="blue"><b>等待超时，终端无应答！
	 * </b></font>{特别说明：指令已发送成功}
	 */
	No_Reply_Terminal(20203, "等待超时，终端无应答！"),
	/**
	 * <font color="red"><b>20204</b></font>
	 * <font color="blue"><b>指令下发过于频繁！</b></font> {一定时间内允许下发几次待定 }
	 */
	Send_Too_Often(20204, "指令下发过于频繁！"),
	/**
	 * <font color="red"><b>20205~20249</b></font>
	 * <font color="blue"><b>预留字段</b></font>
	 */
	Obligate20205(20205, "预留字段"),

	// 参数相关返回码(包括类型、格式、长度等规范20250~20299)param
	/**
	 * <font color="red"><b>20250</b></font> <font color="blue"><b>参数值不全
	 * ！</b></font>
	 */
	Empty_Parameter(20250, "参数值不全！"),
	/**
	 * <font color="red"><b>20251</b></font>
	 * <font color="blue"><b>参数类型错误！</b></font>
	 */
	Parameter_Type_Error(20251, "参数类型错误！"),
	/**
	 * <font color="red"><b>20252</b></font>
	 * <font color="blue"><b>参数长度过大，超出限制！</b></font>
	 */
	Parameter_Length_Oversize(20252, "参数长度过大，超出限制！"),
	/**
	 * <font color="red"><b>20253~20299</b></font>
	 * <font color="blue"><b>预留字段</b></font>
	 */
	Obligate20253(20253, "预留字段！"),

	/*
	 * 上传图片相关返回码(例如上传用户头像 20300~20349)Img
	 * 图片上传格式：常用格式(jpg、jpeg、gif、png、jpeg2000、bmp、psd)；
	 * 不常用格式(swf、svg、pcx、dxf、wmf、emf、lic、eps、tga)
	 */
	/**
	 * <font color="red"><b>20300</b></font> <font color="blue"><b>图片上传成功！
	 * </b></font>
	 */
	Img_Upload_Success(20300, "图片上传成功"),
	/**
	 * <font color="red"><b>20301</b></font>
	 * <font color="blue"><b>图片格式不合法！</b></font>{当上传图片格式与要求不符合时，报此异常 }
	 */
	Img_Legal_Format(20301, "图片格式不合法！"),
	/**
	 * <font color="red"><b>20302</b></font>
	 * <font color="blue"><b>图片过大，不能上传！</b></font>
	 */
	Img_Oversize(20302, "图片过大，不能上传！"),
	/**
	 * <font color="red"><b>20303</b></font>
	 * <font color="blue"><b>图片过大，不能显示缩略图！</b></font>
	 */
	Img_Thumbnail_No_Show(20303, "图片过大，不能显示缩略图！"),
	/**
	 * <font color="red"><b>20304</b></font>
	 * <font color="blue"><b>像素不合法！</b></font>
	 */
	Img_Legal_Pixel(20304, "像素不合法！"),
	/**
	 * <font color="red"><b>20305~20349</b></font>
	 * <font color="blue"><b>预留字段</b></font>
	 */
	Img_Obligate20305(20305, "预留字段！"),

	Img_Illeage_Name(20306, "不合法的图片名称"),

	/*
	 * 上传文件(包括文档格式等相关返回码File 20350~20399) 上传文件格式：常用格式(.txt、.rtf、.doc、.xls)
	 * 不常用格式(.ppt、.html、.wpd、.pdf)
	 */
	/**
	 * <font color="red"><b>20350</b></font>
	 * <font color="blue"><b>文件上传成功！</b></font>
	 */
	File_Upload_Success(20350, "文件上传成功！"),

	/**
	 * <font color="red"><b>20351</b></font>
	 * <font color="blue"><b>文件上传失败！</b></font>
	 */
	File_Upload_Error(20351, "文件上传失败！"),
	/**
	 * <font color="red"><b>20352</b></font>
	 * <font color="blue"><b>文件格式不正确！</b></font>
	 */
	File_Error_Format(20352, "文件格式不正确！"),
	/**
	 * <font color="red"><b>20353</b></font>
	 * <font color="blue"><b>文件过大，不能上传！</b></font>
	 */
	File_Oversize(20353, "文件过大，不能上传！"),
	/**
	 * <font color="red"><b>20354</b></font> <font color="blue"><b>上传中断！
	 * </b></font>{正在上传文件时，客户端异常关机(待讨论)}
	 */
	File_Interrupt(20354, "上传中断！"),
	/**
	 * <font color="red"><b>20355~20399</b></font> <font color="blue"><b>预留字段
	 * </b></font>
	 */
	File_Is_Null(20355, "文件内容为空"), 
	File_Exist_Error_Data(20356, "存在错误数据"), 
	File_Not_Exist(20357, "文件不存在"), 
	File_Be_Used(20358, "文件被占用，读取失败"), 
	File_Number_Error(20359, "目录下文件数量不正确"), 
	File_Not_IsDirectory(20360, "该路径是文件不是目录"), 
	File_Analysis_Error(20361, "文件解析失败,请按照模板要求更改"),
	/*
	 * 上传压缩包(相关返回码Rar 20400~20449) 上传压缩包格式：常用格式(.rar、.zip、.jar、.iso)
	 * 不常用格式(.cab、.arj、.lzh、.ace、.7-zip、.tar、.gzip、.uue、.bz2)
	 */
	/**
	 * <font color="red"><b>20400</b></font>
	 * <font color="blue"><b>文件上传成功！</b></font>
	 */
	Rar_Upload_Success(20400, "压缩包上传成功！"),
	/**
	 * <font color="red"><b>20401</b></font>
	 * <font color="blue"><b>文件上传失败！</b></font>
	 */
	Rar_Upload_Error(20401, "压缩包上传失败！"),
	/**
	 * <font color="red"><b>20402</b></font>
	 * <font color="blue"><b>文件格式不正确！</b></font>
	 */
	Rar_Error_Format(20402, "压缩包格式不正确！"),
	/**
	 * <font color="red"><b>20403</b></font>
	 * <font color="blue"><b>文件过大，不能上传！</b></font>
	 */
	Rar_Oversize(20403, "压缩包过大，不能上传！"),
	/**
	 * <font color="red"><b>20404</b></font> <font color="blue"><b>上传中断！
	 * </b></font>{正在上传压缩包时，客户端异常关机(待讨论)}
	 */
	Rar_Interrupt(20404, "压缩包上传中断！"),
	/**
	 * <font color="red"><b>20405~20499</b></font> <font color="blue"><b>预留字段
	 * </b></font>
	 */
	Rar_Obligate20405(20405, "预留字段"), 
	Rar_Open_Null(20406, "压缩包内容为空"),
	Rar_Open_Fail(20407, "解压失败");

	/** 返回码 */
	private int code;
	/** 返回内容详情 */
	private String message;

	ReturnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
