/*
 * File: app/model/User.js
 *
 * This file was generated by Sencha Architect version 3.2.0.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('sion.demo.model.User', {
    extend: 'Ext.data.Model',

    requires: [
        'Ext.data.Field',
        'Ext.data.proxy.Ajax',
        'Ext.data.reader.Json'
    ],

    fields: [
        {
            name: 'id'
        },
        {
            name: 'name'
        },
        {
            name: 'age'
        }
    ],

    proxy: {
        type: 'ajax',
        api: {
            create: 'demo/user/save',
            update: 'demo/user/update',
            read: 'demo/user/read',
            destroy: 'demo/user/destroy'
        },
        reader: {
            type: 'json',
            root: 'data'
        }
    }
});