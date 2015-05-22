/*
 * File: app/view/PanelInEntrance.js
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

Ext.define('sion.demo.view.PanelInEntrance', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.Panel',

    requires: [
        'sion.demo.view.AutoNav',
        'sion.demo.view.MainTabPanel',
        'Ext.tab.Panel'
    ],

    layout: 'border',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'autonav',
                    region: 'west'
                },
                {
                    xtype: 'mytabpanel',
                    region: 'center'
                }
            ]
        });

        me.callParent(arguments);
    }

});