({
    name: "BettleCar_LED", // Category Name
    description: "Led of bettle car",
    author: "upSkill.asis",
    category: "led",
    version: "1.0.0",
    icon: "/static/icon.png", // Category icon
    color: "#3498DB", // Category color (recommend some blocks color)
    blocks: [ // Blocks in Category
        {
            xml: `
                <block type="led_onoff">
                    <field name = "pin_trig">12</field>
                    <field name = "onoff">on()</field>
                </block>
            `
        },
    ]
});
