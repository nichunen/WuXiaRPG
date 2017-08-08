package com.mygdx.game.manager;

/**
 * Created by apple on 16/11/10.
 */
public enum EnumAction {
    NULL,
    moveU,
    moveD,
    moveL,
    moveR,
    stop,
    run,
//   Face to
    FACE_N,
    FACE_NE,
    FACE_E,
    FACE_SE,
    FACE_S,
    FACE_SW,
    FACE_W,
    FACE_NW,
// Movement
    PAUSE,
    MOVE_N,
    MOVE_NE,
    MOVE_E,
    MOVE_SE,
    MOVE_S,
    MOVE_SW,
    MOVE_W,
    MOVE_NW,
    MOVE_DOWN,
    MOVE_UP,
// Shift view
    CENTER,
    SHIFT_N,
    SHIFT_NE,
    SHIFT_E,
    SHIFT_SE,
    SHIFT_S,
    SHIFT_SW,
    SHIFT_W,
    SHIFT_NW,
// Environment Interaction
    OPEN,
    CLOSE,
    SMASH,
    EXAMINE,
    PICKUP,
    BUTCHER,
    CHAT,
    LOOK,
    PEEK,
    LIST_ITEMS,
// Inventory Interaction (including quasi-inventories like bionics)
    INVENTORY,
    ADVANCEDINV,
    COMPARE,
    ORGANIZE,
    USE,
    USE_WIELDED,
    WEAR,
    TAKE_OFF,
    EAT,
    READ,
    WIELD,
    PICK_STYLE,
    RELOAD,
    UNLOAD,
    THROW,
    FIRE,
    FIRE_BURST,
    SELECT_FIRE_MODE,
    DROP,
    DIR_DROP,
    BIONICS,
    SORT_ARMOR,
// Long-term / special actions
    WAIT,
    CRAFT,
    RECRAFT,
    LONGCRAFT,
    CONSTRUCT,
    DISASSEMBLE,
    SLEEP,
    CONTROL_VEHICLE,
    TOGGLE_SAFEMODE,
    TOGGLE_AUTOSAFE,
    IGNORE_ENEMY,
    SAVE,
    QUIT,
// Info Screens
    PL_INFO,
    MAP,
    MISSIONS,
    KILLS,
    FACTIONS,
    MORALE,
    MESSAGES,
    HELP,
// Debug Functions
    DEBUG,
    DISPLAY_SCENT,
    TOGGLE_DEBUGMON,
    NUM_ACTIONS
}
