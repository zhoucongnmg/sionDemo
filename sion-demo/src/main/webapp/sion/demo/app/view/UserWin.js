/*
 * File: app/view/UserWin.js
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

Ext.define('sion.demo.view.UserWin', {
    extend: 'Ext.window.Window',

    requires: [
        'sion.demo.view.User',
        'Ext.panel.Panel'
    ],

    height: 546,
    width: 693,
    layout: 'fit',
    title: '',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'user1'
                }
            ]
        });

        me.callParent(arguments);
    }

});