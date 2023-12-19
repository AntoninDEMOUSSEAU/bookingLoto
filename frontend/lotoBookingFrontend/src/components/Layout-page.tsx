import React, {PropsWithChildren} from "react";
import {Outlet} from "react-router-dom";
import {TopBar} from "./TopBar";

export const LayoutPage = () => {

    return <>
        <TopBar/>
        <main>
            <Outlet />
        </main>
    </>
};