Blockly.defineBlocksWithJsonArray([
{
  "type": "led_onoff",
  "message0": "LED pin : %1 is : %2",
  "args0":[
    {
      "type": "field_dropdown",
      "name": "pin_trig",
      "options": [
        [
          "12"
        ],
        [
          "33"
        ]
      ]
        
    },
    {
      "type": "field_dropdown",
      "name": "onoff",
      "options":[
        [
          "on()"
        ],
        [
          "off()"
        ]
      ]
    }
  ], 
  "output": "Number",
  "colour": "#004098",
  "tooltip": "",
  "helpUrl": ""
} 
]);
