/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.utils;

import management.constants.Constant;

/**
 *
 * @author junie
 */
public class APIs {
    public static Service getService(){
        return Client.getClient(Constant.BASE_URL).create(Service.class);
    }
}
