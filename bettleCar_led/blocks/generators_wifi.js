Blockly.Python['led_onoff'] = function(block) {
  Blockly.Python.definitions_['import_Pin'] = 'from machine import Pin';
  
  var dropdown_trig = block.getFieldValue('pin_trig');
  var dropdown_onoff = block.getFieldValue('onoff');

  var code = `Pin(${dropdown_trig}, Pin.OUT).${dropdown_onoff}`;
  return [code , blockly.Python.ORDER_NONE];
};
