/*
 * File: app/view/UserMain.js
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

Ext.define('sion.demo.view.UserMain', {
    extend: 'Ext.window.Window',

    requires: [
        'Ext.form.Panel',
        'Ext.form.field.Number',
        'Ext.toolbar.Toolbar',
        'Ext.button.Button'
    ],

    height: 250,
    width: 400,
    title: '人员编辑',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    bodyPadding: 10,
                    header: false,
                    title: 'My Form',
                    items: [
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: 'Label',
                            name: 'id'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: '姓名',
                            name: 'name'
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            fieldLabel: '年龄',
                            name: 'age'
                        }
                    ],
                    dockedItems: [
                        {
                            xtype: 'toolbar',
                            dock: 'top',
                            items: [
                                {
                                    xtype: 'button',
                                    text: '保存',
                                    listeners: {
                                        click: {
                                            fn: me.onButtonClick,
                                            scope: me
                                        }
                                    }
                                }
                            ]
                        }
                    ]
                }
            ],
            listeners: {
                beforerender: {
                    fn: me.onWindowBeforeRender,
                    scope: me
                }
            }
        });

        me.callParent(arguments);
    },

    onButtonClick: function(button, e, eOpts) {
        var me = this,
            form = me.down('form'),
            user = form.getRecord();
        form.updateRecord(user);
        user.save();
    },

    onWindowBeforeRender: function(component, eOpts) {
        var me = this,
            form = me.down('form'),
            user = me._user;
        if (!user) {
            user = Ext.create(me.getNs()+'.model.User');
        }
        form.loadRecord(user);
    }

});