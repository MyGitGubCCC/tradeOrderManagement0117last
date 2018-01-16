package com.xzit.until;

/**
 * Created by Liu on 2018/1/11.
 */
public class Shenpizhuangtai {

    public static String approvalState(String num){
        String str = "";
        if("2".equals(num)){
            str = "待销售业务部门提交";
        }else if("3".equals(num)){
            str = "待营销部门主管审核";
        }else if("4".equals(num)){
            str = "待会计签注信用额度";
        }else if("5".equals(num)){
            str = "待营销总监确认信用额度";
        }else if("6".equals(num)){
            str = "待营销总监调配";
        }else if("7".equals(num)){
            str = "待区域销售经理审核调配申请";
        }else if("8".equals(num)){
            str = "待业管单位填制配拨单";
        }else if("9".equals(num)){
            str = "待区域销售经理审核配拨单";
        }else if("10".equals(num)){
            str = "待营销部提交送货单";
        }else if("11".equals(num)){
            str = "待承办人提交托运单";
        }else if("1".equals(num)){
            str = "已完成贸易订单";
        }
        return str;
    }

}
