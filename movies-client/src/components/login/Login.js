import {useEffect, useRef} from 'react';
import api from '../../api/axiosConfig';
import {useParams} from 'react-router-dom';
import {Container, Row, Col} from 'react-bootstrap';
import LoginForm from '../loginForm/LoginForm';

import React from 'react'

const Login = ({setUser}) => {
    const revText_usrname = useRef();
    const revText_password = useRef();
    const revText_emailId = useRef();

    const signupUser = async (e) => {
        e.preventDefault();

        try {
            const response = await api.post("/api/v1/user",{
                emailId:revText_emailId,
                username:revText_usrname.current.value,
                password:revText_password.current.value});
            
            console.log(response);
            setUser(response.data)
        } catch (err) {
            console.error(err);
        }
    }

    const loginUser = async (e) => {

    }

    return (
        <Container>
            <Row>
                <Col><h3>Login page</h3></Col>
            </Row>
            <Row className="mt-2">
                <Col>
                    {
                        <>
                            <Row>
                                <Col>
                                    <LoginForm handleLogin={loginUser} revText_usrname={revText_usrname} revText_password={revText_password} revText_emailId={revText_emailId} />
                                </Col>
                            </Row>
                            <Row>
                                <Col>
                                    <hr />
                                </Col>
                            </Row>
                        </>
                    }
                </Col>
            </Row>      
        </Container>
    )
}

export default Login